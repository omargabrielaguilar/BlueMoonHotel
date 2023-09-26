package Clases;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="biblioteca")
@XmlType(propOrder={"autor","nombre","publicacion"})

public class BookStore {
	private ArrayList<Book> listarLibros;
	private String nombre;
	private String ubicación;
	
	public ArrayList<Book> getListarLibros() {
		return listarLibros;
	}
	public void setListarLibros(ArrayList<Book> listarLibros) {
		this.listarLibros = listarLibros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicación() {
		return ubicación;
	}
	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}
}
