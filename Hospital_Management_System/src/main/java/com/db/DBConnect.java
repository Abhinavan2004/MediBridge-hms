package com.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {

	private static Connection conn ;
	
	public static Connection getConn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12804131";
            String user = "sql12804131";
            String pass = "gL7Rju8KKr";
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Connected to Remote MySQL (freemysqlhosting.net)");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}
