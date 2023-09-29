package Pruebas;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Clases.Book;
import Clases.BookStore;

public class GenerarArchivoXML {
	private static final String PATH_XML = "config/bookstore.xml";
	public static void main(String[] args) throws JAXBException {
		
		ArrayList<Book> listaLibros = new ArrayList<>();
		
		Book libro1 = new Book();
		libro1.setAutor("Omar Gabriel");
		libro1.setNombre("Libro A");
		libro1.setPublicacion("Publicado en 2021");
		
		listaLibros.add(libro1);
		
		Book libro2 = new Book();
		libro2.setAutor("Jeso Gualiar");
		libro2.setNombre("Libro B");
		libro2.setPublicacion("Publicado en 2017");
		
		listaLibros.add(libro2);
		
		Book libro3 = new Book();
		libro3.setAutor("Belgrad Reos");
		libro3.setNombre("Libro C");
		libro3.setPublicacion("Publicado en 1956");
		
		listaLibros.add(libro3);
		
		
		// -------------------------------------------------------------------------
		
		BookStore bookStore = new BookStore();
		bookStore.setListarLibros(listaLibros);
		bookStore.setNombre("Libro General");
		bookStore.setUbicación("Perú");
		
		JAXBContext context = JAXBContext.newInstance(BookStore.class);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(bookStore, System.out);
		
		marshaller.marshal(bookStore, new File(PATH_XML));
		
	}

}
