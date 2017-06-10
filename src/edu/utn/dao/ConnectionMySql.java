package edu.utn.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectionMySql {
	// Datos para la conección
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/test";
	private static final String ID = "root";
	private static final String PASS = "";
	
	
	public void conexionDB(){
		try {
			//jdbc:mysql://servidor:puerto/baseDeDatos o esquema
			Connection con = (Connection)DriverManager.getConnection(DB_URL, ID, PASS);
			
			System.out.println("Conección exitosa!!");
			System.out.println("Ahora a llenar la BD");
			
//			Statement st = (Statement)con.createStatement();
//			st.execute("Select * from personas ");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
//	private Connection getConnection() {
//		try {
//			Class.forName(DRIVER_NAME);
//			// jdbc:mysql://servidor:puerto/baseDeDatos o esquema
//			return (Connection)DriverManager.getConnection(DB_URL, ID, PASS);
//		} catch (Exception e) {
//			// e.printStackTrace();
//			throw new RuntimeException(e);
//		}
//	}
//	
//	private static void close(Connection con) {
//		if (con != null) {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				// e.printStackTrace();
//				throw new RuntimeException(e);
//			}
//		}
//	}
//	
//	private static void close(Statement stmt) {
//		if (stmt != null) {
//			try {
//				stmt.close();
//			} catch (SQLException e) {
//				// e.printStackTrace();
//				throw new RuntimeException(e);
//			}
//		}
//	}
}
