package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {
	private static Connection con = null;
	private static String url = "jdbc:mysql://localhost/biblioteca";
	private static String user = "root";
	private static String senha = "lab02";
	
	public static Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, senha);

			} catch (ClassNotFoundException | SQLException e) {
				((Throwable) e).printStackTrace();
			}
		}

		return con;
	}
	
	public static void main(String[] args) {
		Connection con = ConexaoBanco.getConnection();
		
		System.out.println(con);
	}
}