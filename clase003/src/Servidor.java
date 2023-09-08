import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		// TODO
		ServerSocket servidor = null;
		Socket ConexionEntrante = null;
		DataInputStream in;
		DataOutputStream out;
		
		
		int puerto = 3099;
		
		try {
			servidor = new ServerSocket(puerto);
			System.out.println("Servidor en escucha");
			
			
			while(true) {
				ConexionEntrante = servidor.accept();
				System.out.println("Cliente conectado");
				
				in = new DataInputStream(ConexionEntrante.getInputStream());
				
				out = new DataOutputStream(ConexionEntrante.getOutputStream());
				
				
				String mensaje = in.readUTF();
				System.out.println(mensaje);
				
				out.writeUTF("Mensaje desde el servidor");
				ConexionEntrante.close();
				
				System.out.println("Cliente desconectado");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
