package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.jdbc.ConnectionMaster;

public class Question_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select count(*) ,dname from employee  join department on department.deptid = employee.deptid group by dname");
			System.out.println("number of employee in each department ");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
					
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
