package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
	
	public Connection getConnection() {
		Connection cn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cibertec?characterEncoding=latinserverTimezone=UTC", "omar", "mypass");
			
			
		}catch (Exception e) {
			System.out.println("Error MySQL" + e.getMessage());
		}
		
		return cn;
		
	}

}
