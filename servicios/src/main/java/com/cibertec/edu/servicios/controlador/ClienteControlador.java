package com.cibertec.edu.servicios.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cibertec.edu.servicios.business.ClienteService;
import com.cibertec.edu.servicios.modelo.Cliente;

@RestController
@RequestMapping("/cibertec")
public class ClienteControlador {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/clientes")
	public List<Cliente> listaClientes() {
		return service.listaClientes();
	}
	
	@GetMapping("/clientes/{id}")
	public Optional<Cliente> listaClientesPorId(@PathVariable Integer id) {
		return service.listaClientePorId(id);
	}
	
	@PostMapping("/guardar")
	public void guardarCliente(@RequestBody Cliente cliente) {
		service.guardar(cliente);
	}
	
	@PutMapping("/actualizar/{id}")
	public void actualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
		service.actualizar(id, cliente);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarrCliente(@PathVariable Integer id) {
		service.eliminar(id);
	}
}