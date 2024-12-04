from django.urls import path
from .views import UsuarioAPI

urlpatterns = [
    path('usuarios/', UsuarioAPI.as_view(), name='usuarios'),
]
