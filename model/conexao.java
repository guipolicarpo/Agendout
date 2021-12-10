package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
		
		// Modulo de Conexão

		// Parâmetros de conexão
		private String driver = "com.mysql.cj.jdbc.Driver";
		private String url = "jdbc:mysql://127.0.0.1:3306/dbagendout?useTimezone=true&serverTimezone=UTC";
		private String user = "root";
		private String password = "P@ssw0rd";

		// Metodo abrir Conexão
		public Connection conectar() {
			Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				return con;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
	
	
	/* Modulo de Conexão
		Connection con;
		// Metodo de Conexão
		public Connection conectar() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbagendout", "root", "P@ssw0rd");			
			} catch (Exception e) {
			}
			return con;
		}
		
	*/
}
