package cliente_servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ServidorHilo extends Thread{
	private DataInputStream in;
	private DataOutputStream out;
	
	private String nombreCliente;

	public ServidorHilo(DataInputStream in, DataOutputStream out, String nombreCliente) {
		super();
		this.in = in;
		this.out = out;
		this.nombreCliente = nombreCliente;
	}
	
	@Override
	public void run() {
		System.out.println("Hola: " + nombreCliente);
	}
}
