from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import status
from .services import UsuarioService
from .serializers import UsuarioSerializer

class UsuarioAPI(APIView):
    def get(self, request):
        usuarios = UsuarioService.listar_usuarios()
        serializer = UsuarioSerializer(usuarios, many=True)
        return Response(serializer.data)

    def post(self, request):
        serializer = UsuarioSerializer(data=request.data)
        if serializer.is_valid():
            UsuarioService.registrar_usuario(serializer.validated_data)
            return Response(serializer.data, status=status.HTTP_201_CREATED)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)
