package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.example.jdbc.ConnectionMaster;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner sc = new Scanner(System.in);

			Connection conn = ConnectionMaster.getConnection();
			PreparedStatement st = conn.prepareStatement("select * from employee where ename = ?");
			
			ResultSet rs = st.executeQuery();
			System.out.println("Enter User name ");//
			
			st.setString(1, sc.nextLine());
			
			if(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
		
		   else
		    {
			System.out.println("user not found");
		    }
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
	
