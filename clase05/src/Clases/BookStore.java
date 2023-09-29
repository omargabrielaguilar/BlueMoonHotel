package Clases;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Biblioteca")
@XmlType(propOrder = {"ubicación", "nombre", "listarLibros"})
public class BookStore {

    private ArrayList<Book> listarLibros;
    private String nombre;
    private String ubicación;

    @XmlElementWrapper(name = "ListaLibros")
    @XmlElement(name = "libro")
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
