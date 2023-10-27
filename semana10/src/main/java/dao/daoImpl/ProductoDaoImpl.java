package dao.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexion.Conectar;
import dao.ProductoDao;
import model.Producto;

public class ProductoDaoImpl implements ProductoDao{
	private Conectar sql;
	
	public ProductoDaoImpl() {
		super();
		this.sql = new Conectar();
	}

	@Override
	public String insertarProducto(Producto producto) {
		
		String resultado = null;
		
		Connection cn = sql.getConnection();
		
		try {
			CallableStatement cs = cn.prepareCall("{call spInsertarProducto(?,?,?)}");
			cs.setString(1,producto.getNombre());
			cs.setDouble(2,producto.getPrecio());
			cs.setInt(3,producto.getCantidad());
			
			int res = cs.executeUpdate();
			
			if(res == 0) {
				resultado = "0 filas registradas";
			} else {
				resultado = "Se registro correctamente";
			}
			
		} catch (Exception e) {
			resultado = e.getMessage();
		}
		
		return resultado;
		
	}

	@Override
	public List<Producto> listarProductos() {
		List<Producto> lista = new ArrayList<>();
		
		Connection cn = sql.getConnection();
		
		
		try {
			CallableStatement cs = cn.prepareCall("{call spListarProductos()}");
			
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				Producto producto = new Producto();
				producto.setNombre(rs.getString(1));
				producto.setPrecio(rs.getDouble(2));
				producto.setCantidad(rs.getInt(3));
			}
			
			rs.close();
			cs.close();
			cn.close();
			
			
		} catch (Exception e) {
			System.out.println("Error lista: " + e.getMessage());
		}
		return lista;
		
	}

	@Override
	public String actualizarProducto(Producto producto) {
		String resultado = null;
		
		Connection cn = sql.getConnection();
		
		try {
			CallableStatement cs = cn.prepareCall("{call spActualizarProducto(?,?,?,?)}");
			cs.setInt(1, producto.getId());
			cs.setString(2,producto.getNombre());
			cs.setDouble(3,producto.getPrecio());
			cs.setInt(4,producto.getCantidad());
			
			int res = cs.executeUpdate();
			
			if(res == 0) {
				resultado = "0 filas actualizo";
			} else {
				resultado = "Se actualizo correctamente";
			}
			
		} catch (Exception e) {
			resultado = e.getMessage();
		}
		
		return resultado;
	}

	@Override
	public String eliminarProducto(Producto producto) {
		String resultado = null;
		
		Connection cn = sql.getConnection();
		
		
		try {
			CallableStatement cs = cn.prepareCall("{call spEliminarProducto(?)}");
			cs.setInt(1, producto.getId());
			
			int res = cs.executeUpdate();
			
			if(res == 0) {
				resultado = "0 filas eliminados";
			} else {
				resultado = "Se elimino correctamente";
			}
			
		} catch (Exception e) {
			resultado = e.getMessage();
		}
		
		return resultado;
	}
	
	@Override
	public Producto listarProducto(int id) {
		Connection cn = sql.getConnection();
		Producto producto = null;
		
		
		try {
			CallableStatement cs = cn.prepareCall("{call spListarProductoPorId(?)}");
			cs.setInt(1, id);
			
			ResultSet rs = cs.executeQuery();
			
			if(rs.next()) {
				producto = new Producto();
				producto.setNombre(rs.getString(1));
				producto.setPrecio(rs.getDouble(2));
				producto.setCantidad(rs.getInt(3));
			}
			
			rs.close();
			cs.close();
			cn.close();
			
		} catch (Exception e) {
			System.out.println("Error al mostrar productos" + e.getMessage());
		}
		
		
		return producto;
	}
	
}
