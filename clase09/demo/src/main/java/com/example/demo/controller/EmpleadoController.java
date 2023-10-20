package com.example.demo.controller;

import com.example.demo.dao.EmpleadoRepository;
import com.example.demo.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoRepository repository;

    @PostMapping("/empleado")
    public Empleado crear(@Validated @RequestBody Empleado empleado){
        return repository.insert(empleado);
    }

    @GetMapping("/")
    public List<Empleado> listar(){
        return repository.findAll();
    }

    @PutMapping("/empleado/{id}")
    public Empleado actualizar(@PathVariable String id, Empleado empleado){
        empleado.setId(id);  // Asignar el ID al objeto Empleado
        return repository.save(empleado);
    }

    @DeleteMapping("/empleado/{id}")
    public void eliminar(@PathVariable String id) {
        repository.deleteById(id);
    }
}
