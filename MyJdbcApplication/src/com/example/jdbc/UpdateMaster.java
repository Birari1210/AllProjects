package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateMaster {
	
	public static void main(String[] args) {
		
		
try {
			
			Scanner sc = new Scanner(System.in);
	     //   Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn =ConnectionMaster.getConnection();
		    PreparedStatement pst = conn.prepareStatement("update employee set ename=? , salary=? , deptid=? ,  designation=? where eid=?");	    
		   
		    
		    System.out.println("please Enter emp name");
		    pst.setString(1, sc.nextLine());
		    
		    System.out.println("please Enter Emp salary");
		    pst.setInt(2, Integer.parseInt(sc.nextLine()));
		    
		    System.out.println("please Enter Emp depatemet id");
		    pst.setInt(3, Integer.parseInt(sc.nextLine()));
		    
		    System.out.println("please Enter Emp designtion");
		    pst.setString(4, sc.nextLine());
		    
		    System.out.println("please enter id");
		    pst.setInt(5, Integer.parseInt(sc.nextLine()));
	        
		    pst.executeUpdate();
		    conn.close();
		    
		}catch (Exception e) 
		{
			System.out.println( e.getMessage());
			// TODO: handle exception
		}
		
	}

}
