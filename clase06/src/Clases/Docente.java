package Clases;

public class Docente {
	private String nombres;
	private String apellidos;
	private int edad;
	private String curso;
	private double sueldo;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String correo) {
		this.curso = correo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Docente [nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", curso=" + curso
				+ ", sueldo=" + sueldo + "]";
	}
}
