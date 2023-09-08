import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Cliente {
	public static void main(String[] args) {
		String host = "127.0.0.1";
		
		int puerto = 3099;
		
		DataInputStream in;
		DataOutputStream out;
		
		try {
			Socket conexion = new Socket(host, puerto);
			
			in = new DataInputStream(conexion.getInputStream());
			out = new DataOutputStream(conexion.getOutputStream());
			
			out.writeUTF("Te saludo desde el lado del cliente");
			
			String mensaje = in.readUTF();
			System.out.println(mensaje);
			
			conexion.close();
						
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
