package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.jdbc.ConnectionMaster;
//1)Write a jdbc program to display the employees corresponding to respective department
public class Question_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select employee.ename,department.dname from employee JOIN department on department.deptid = employee.deptid");
			System.out.println("Employee name and his department ");
			while(rs.next())
				System.out.println(rs.getString(1)+"  "+rs.getString(2));
					
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
