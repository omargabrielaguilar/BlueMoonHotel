package Ejecutores;

import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class LeerJson {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try(Reader reader = new FileReader("empleado.json")){
			JsonElement jsonelement = gson.fromJson(reader, JsonElement.class);
			
			System.out.println("Lectura correcta del archivo");
			System.out.println(gson.toJson(jsonelement));
	
		}catch(Exception e) {
			System.out.println("Archivo no encontrado");
		}
	}
}
