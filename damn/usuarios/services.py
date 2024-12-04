from .repositories import UsuarioRepository

class UsuarioService:
    @staticmethod
    def listar_usuarios():
        return UsuarioRepository.obtener_usuarios()

    @staticmethod
    def registrar_usuario(datos):
        return UsuarioRepository.crear_usuario(datos)
