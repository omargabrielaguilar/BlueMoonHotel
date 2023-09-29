package Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class LeerJson {
	public Docente readJson() throws FileNotFoundException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		BufferedReader reader = new BufferedReader(new FileReader("docente.json"));
		
		return gson.fromJson(reader, Docente.class);
	}
}
