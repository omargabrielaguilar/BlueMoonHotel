from .models import Usuario

class UsuarioRepository:
    @staticmethod
    def obtener_usuarios():
        return Usuario.objects.all()

    @staticmethod
    def crear_usuario(datos):
        return Usuario.objects.create(**datos)
