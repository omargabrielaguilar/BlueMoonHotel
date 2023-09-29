package Clases;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirJson {
	public void writeJson(Docente docente) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		
		System.out.println("gson = " + gson.toJson(docente));
		
		FileWriter writer = new FileWriter("docente.json");
	
		writer.write(gson.toJson(docente));
		writer.close();
	}
}

