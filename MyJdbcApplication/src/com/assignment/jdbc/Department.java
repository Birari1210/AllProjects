package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Department {
	
	static String URL="jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="1234";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner sc = new Scanner(System.in);
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
		    PreparedStatement pst = conn.prepareStatement("insert into department(deptid, dname) values(?,? )");
		    
		    System.out.println("please enter department id");
		    pst.setInt(1, Integer.parseInt(sc.nextLine()));
		    
		    System.out.println("please enter department name");
		    pst.setString(2, sc.nextLine());
		  
	        
		    pst.executeUpdate();
		    conn.close();
		    
		}catch (Exception e) 
		{
			System.out.println( e.getMessage());
			// TODO: handle exception
		}

	}


}
