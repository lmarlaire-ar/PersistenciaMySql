package edu.utn.view;

import edu.utn.dao.ConnectionMySql;

public class Prueba {

	public static void main(String[] args) {
		
		ConnectionMySql conexion = new ConnectionMySql();
		
		conexion.conexionDB();
		
	}

}
