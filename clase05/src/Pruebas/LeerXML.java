package Pruebas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Clases.Book;
import Clases.BookStore;

public class LeerXML {
	private static final String PATH_XML = "config/bookstore.xml";
	public static void main(String[] args) throws JAXBException, FileNotFoundException{
		
		JAXBContext context = JAXBContext.newInstance(BookStore.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		BookStore bookStore = (BookStore) unmarshaller
				.unmarshal(new InputStreamReader(new FileInputStream(PATH_XML), 
						StandardCharsets.UTF_8));	
		
		ArrayList<Book> lista = bookStore.getListarLibros();
		lista.forEach(objeto -> {
			System.out.println(objeto);
		});
		
	}
}
