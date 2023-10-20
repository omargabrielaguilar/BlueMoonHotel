package com.example.demo.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productos")
public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private LocalDate fecha_expiracion;
}
