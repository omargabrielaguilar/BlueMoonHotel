package service.serviceImpl;

import java.util.List;

import dao.ProductoDao;
import dao.daoImpl.ProductoDaoImpl;
import model.Producto;
import service.ProductoService;

public class ProductoServiceImpl implements ProductoService{

	@Override
	public String insertarProductos(String nombre, double precio, int cantidad) {
		Producto producto = new Producto();
		
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setCantidad(cantidad);
		
		ProductoDao dao = new ProductoDaoImpl();
		
		return dao.insertarProducto(producto);
	}

	@Override
	public List<Producto> listarProductos() {
		ProductoDao dao = new ProductoDaoImpl();
		return dao.listarProductos();
	}

	@Override
	public Producto listarProducto(int id) {
		ProductoDao dao = new ProductoDaoImpl();
		return dao.listarProducto(id);
	}

	@Override
	public String actualizarProducto(int id, String nombre, double precio, int cantidad) {
		Producto producto = new Producto();
		
		producto.setId(id);
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setCantidad(cantidad);
		
		ProductoDao dao = new ProductoDaoImpl();
		
		return dao.actualizarProducto(producto);
	}

	@Override
	public String eliminarProducto(int id) {
		Producto producto = new Producto();
		producto.setId(id);
		
		ProductoDao dao = new ProductoDaoImpl();
		return dao.eliminarProducto(producto);
	}

}
