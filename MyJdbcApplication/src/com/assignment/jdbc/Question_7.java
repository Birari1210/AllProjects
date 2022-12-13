package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.jdbc.ConnectionMaster;

public class Question_7 {

	public static void main(String[] args) {

        try {
			
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select gender,AVG(salary) AS AVERAGE_SALARY FROM employee GROUP BY gender");
			System.out.println("Average salary of employee ");
			while(rs.next())
				//System.out.println(rs.getString(2)+" "+rs.getInt(1));
			System.out.println("average salary "+rs.getString(1)+"   "+rs.getInt(2));

					
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
