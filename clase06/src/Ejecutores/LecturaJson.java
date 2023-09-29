package Ejecutores;

import java.io.FileNotFoundException;

import Clases.Docente;
import Clases.LeerJson;

public class LecturaJson {
	public static void main(String[] args) throws FileNotFoundException {
		LeerJson leerJson = new LeerJson();
		
		Docente obDocente = leerJson.readJson();
		System.out.println(obDocente);
		
		System.out.println("Lectura concluida con exito");

	}
}
