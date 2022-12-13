package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyJdbcClass {
	
	static String URL="jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="1234";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner sc = new Scanner(System.in);
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
		    PreparedStatement pst = conn.prepareStatement("insert into employee(eid, ename, salary, deptid, designation) values(?,?,?,?,? )");
		    
		    System.out.println("please enter id");
		    pst.setInt(1, Integer.parseInt(sc.nextLine()));
		    
		    System.out.println("please Enter emp name");
		    pst.setString(2, sc.nextLine());
		    
		    System.out.println("please Enter Emp salary");
		    pst.setInt(3, Integer.parseInt(sc.nextLine()));
		    
		    System.out.println("please Enter Emp depatemet id");
		    pst.setInt(4, Integer.parseInt(sc.nextLine()));
		    
		    System.out.println("please Enter Emp designtion");
		    pst.setString(5, sc.nextLine());
	        
		    pst.executeUpdate();
		    conn.close();
		    
		}catch (Exception e) 
		{
			System.out.println( e.getMessage());
			// TODO: handle exception
		}
	}

}
