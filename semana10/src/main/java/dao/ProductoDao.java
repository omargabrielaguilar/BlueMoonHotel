package dao;

import java.util.List;

import model.Producto;

public interface ProductoDao {
	public String insertarProducto(Producto producto);
	
	public List<Producto> listarProductos();
	
	public Producto listarProducto(int id);
	
	public String actualizarProducto(Producto producto);
	
	public String eliminarProducto(Producto producto);
}
