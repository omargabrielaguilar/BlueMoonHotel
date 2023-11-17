package com.cibertec.edu.servicios.business;

import java.util.List;
import java.util.Optional;
import com.cibertec.edu.servicios.modelo.Cliente;

public interface ClienteService {
	List<Cliente> listaClientes();
	Optional<Cliente> listaClientePorId(Integer id);
	void guardar(Cliente cliente);
	void actualizar(Integer id, Cliente cliente);
	void eliminar(Integer id);
}