package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.jdbc.ConnectionMaster;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(" select ename, Max(salary) from employee where salary < (select Max(salary) from Employee)");

			System.out.println("Second maximum salary of employee ");
			while(rs.next())
				System.out.println(rs.getString(1)+"  "+rs.getInt(2));
					
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
