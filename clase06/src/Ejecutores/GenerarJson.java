package Ejecutores;

import java.io.IOException;

import Clases.EscribirJson;
import Clases.Docente;

public class GenerarJson {
	public static void main(String[] args) throws IOException {
		
		Docente docente = new Docente();
		docente.setNombres("Omar");
		docente.setApellidos("Aguilar");
		docente.setEdad(21);
		docente.setCurso("Biologia");
		docente.setSueldo(4500.45);
		
		EscribirJson escribirJson = new EscribirJson();
		escribirJson.writeJson(docente);
		
		System.out.println("Json creado correctamente");
	}
}
