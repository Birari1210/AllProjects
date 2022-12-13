package com.demotest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMaster {
	
	String URL ="jdbc:mysql://localhost:3306/jdbcmaster";  //"jdbc:mysql://localhost:3306/jdbcmaster"
	String USERNAME="root";
	String PASSWORD ="1243";
	
	public static Connection Statement;
	
	public static Connection getConnection()
	{
		try {
               Class.forName("com.mysql.cj.jdbc.Drive");
			Connection conn = DriverManager.getConnection("URL","USERNAME","PASSWORD");
			return conn;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	

	

}
