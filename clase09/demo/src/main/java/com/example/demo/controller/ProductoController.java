package com.example.demo.controller;

import com.example.demo.dao.ProductoRepository;
import com.example.demo.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    @Autowired
    private ProductoRepository repository;

    @PostMapping("/producto")
    public Producto crear(@Validated @RequestBody Producto producto){
        return repository.insert(producto);
    }

    @GetMapping("/")
    public List<Producto> listar(){
        return repository.findAll();
    }

    @PutMapping("/producto/{id}")
    public Producto actualizar(@PathVariable String id, Producto producto){
        return repository.save(producto);
    }

    @DeleteMapping("/producto/{id}")
    public void eliminar(@PathVariable String id) {
        repository.deleteById(id);
    }
}
