package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.jdbc.ConnectionMaster;
//2)Write a jdbc program to display the name of the employee with the highest salary

public class Question_2 {

		public static void main(String[] args) {

			try {
				
				Connection conn = ConnectionMaster.getConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT ename, salary from employee WHERE salary = (SELECT Max(Salary) FROM Employee)");

				System.out.println("maximum salary of employee ");
				while(rs.next())
					System.out.println(rs.getString(1)+"  "+rs.getInt(2));
						
						
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
}
