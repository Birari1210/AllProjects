package com.assignment.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;

public class ConnectionMaster {
	
	static String URL="jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="1234";
	public static Connection Statement;
	
	public static Connection getConnection()
	{
		try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
	        return conn;
	}catch (Exception e) {
		// TODO: handle exception
		return null;
	}
 }

}
