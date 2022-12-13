package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	        Scanner sc = new Scanner(System.in);
	        Connection conn = ConnectionMaster.getConnection();
		    PreparedStatement pst = conn.prepareStatement("delete from employee where eid=?");
		    
		    System.out.println("enter id");
		    pst.setInt(1, Integer.parseInt(sc.nextLine()));
		    
		    pst.executeUpdate();
		    conn.close();
		    
		}catch (Exception e) 
		{
			System.out.println( e.getMessage());
			// TODO: handle exception
		}
	}

}
