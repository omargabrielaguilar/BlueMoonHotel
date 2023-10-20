package com.example.demo.controller;

import com.example.demo.dao.EmpleadoRepository;
import com.example.demo.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Empleado actualizar(@PathVariable String id, @Validated @RequestBody Empleado empleado){
        empleado.setId(id);
        return repository.save(empleado);
    }

    @DeleteMapping("/empleado/{id}")
    public void eliminar(@PathVariable String id) {
        repository.deleteById(id);
    }


    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleado> buscarPorId(@PathVariable String id) {
        Optional<Empleado> empleado = repository.findById(id);
        if (empleado.isPresent()) {
            return ResponseEntity.ok(empleado.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
