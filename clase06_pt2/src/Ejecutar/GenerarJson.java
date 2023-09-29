package Ejecutar;

import java.io.FileWriter;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Clases.Cliente;

public class GenerarJson {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Omar");
		cliente.setEdad(21);
		cliente.setCiudad("Trux");
		cliente.setPreferencias(Arrays.asList("Deportes","Peliculas","Comida"));
	
		try(FileWriter writer = new FileWriter("cliente.json")) {
			gson.toJson(cliente, writer);
			System.out.println("Archivo creado correctamente");
		} catch(Exception e ) {
			
		}
	
	}
}
