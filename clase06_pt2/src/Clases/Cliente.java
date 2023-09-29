package Clases;

import java.util.List;

public class Cliente {
	private String nombre;
	private String ciudad;
	private int edad;
	private List<String>preferencias;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<String> getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(List<String> preferencias) {
		this.preferencias = preferencias;
	}
}
