package Ejecutores;

import java.io.FileWriter;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Clases.Empleado;

public class GenerarJson {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Omar");
		empleado.setSalario(4500.50);
		empleado.setCargo("Programador Go");
		empleado.setEdad(21);
		empleado.setHabilidades(Arrays.asList("Golang","PostgreSQL","Docker"));
	
		try(FileWriter writer = new FileWriter("empleado.json")) {
			gson.toJson(empleado, writer);
			System.out.println("Archivo creado correctamente");
		} catch(Exception e ) {
			
		}
	
	}
}
