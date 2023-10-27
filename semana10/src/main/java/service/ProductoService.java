package service;

import java.util.List;

import model.Producto;

public interface ProductoService {
	public String insertarProductos(String nombre, double precio, int cantidad);
	
	public List<Producto> listarProductos();
	
	public Producto listarProducto(int id);
	
	public String actualizarProducto(int id, String nombre, double precio, int cantidad);
	
	public String eliminarProducto(int id);
}
