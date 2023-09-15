package cliente_servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		int port = 4000;
		
		try {
			ServerSocket server = new ServerSocket(port);
			Socket socket;
			
			System.out.println("Servidor initialize");
			
			
			while(true) {
				socket = server.accept();
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				
				
				out.writeUTF("Indica tu nombre: ");
				
				String nombreCliente = in.readUTF();
				
				ServidorHilo hilo = new ServidorHilo(in, out, nombreCliente);
				hilo.start();
				
				System.out.println("Conexión creada con el cliente " + nombreCliente);
			}
			
		}catch (Exception ex)
		{
			//TODO
		}
	}
}
