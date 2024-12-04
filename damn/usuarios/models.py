from django.db import models

class Rol(models.Model):
    nombre = models.CharField(max_length=50)

class Usuario(models.Model):
    nombre = models.CharField(max_length=100)
    rol = models.ForeignKey(Rol, on_delete=models.CASCADE)
    estado = models.BooleanField(default=True)
