package com.cibertec.edu.servicios.business.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.edu.servicios.business.ClienteService;
import com.cibertec.edu.servicios.modelo.Cliente;
import com.cibertec.edu.servicios.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listaClientes() {
		return clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> listaClientePorId(Integer id) {
		return clienteRepository.findById(id);
	}

	@Override
	public void guardar(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	public void actualizar(Integer id, Cliente cliente) {
		Cliente clienteById = clienteRepository.findById(id).orElse(null);
		
		if(clienteById != null) {
			clienteById.setNombre(cliente.getNombre());
			clienteById.setApellidos(cliente.getApellidos());
			clienteById.setEdad(cliente.getEdad());
			clienteById.setEstado(cliente.getEstado());
			
			clienteRepository.save(clienteById);
		}
	}

	@Override
	public void eliminar(Integer id) {
		Cliente clienteById = clienteRepository.findById(id).orElse(null);
		if(clienteById != null) {
			clienteRepository.delete(clienteById);
		}
	}
	
}