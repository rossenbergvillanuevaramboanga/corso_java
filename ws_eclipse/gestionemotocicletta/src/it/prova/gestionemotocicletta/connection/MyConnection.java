package it.prova.gestionemotocicletta.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String CONNECT_STR = "jdbc:mysql://localhost:3306/gestionemotocicletta?user=root&password=eissenberg&allowPublicKeyRetrieval=true&useSSL=FALSE&serverTimezone=UTC";
	
	public static Connection getConnection() {

		Connection connection = null;
		
		try {
			//questa riga di codice post java 8 risulta opzionale!!!
			Class.forName(DRIVER_NAME);
			
			connection = DriverManager.getConnection(CONNECT_STR);

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		return connection;
	}

}
