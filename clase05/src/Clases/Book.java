package Clases;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="libro")
@XmlType(propOrder={"autor","nombre","publicacion"})
public class Book {
	private String nombre;
	private String autor;
	private String publicacion;
	
	@XmlElement(name = "titulo")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}
	@Override
	public String toString() {
		return "Book [nombre=" + nombre + ", autor=" + autor + ", publicacion=" + publicacion + "]";
	}
	
	
	
}
