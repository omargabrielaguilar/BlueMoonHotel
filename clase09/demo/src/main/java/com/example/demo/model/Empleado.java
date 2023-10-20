package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "empleados")
public class Empleado {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private Double salario;
    private LocalDate fecha_registro;
}
