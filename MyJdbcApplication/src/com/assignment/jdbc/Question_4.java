package com.assignment.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.jdbc.ConnectionMaster;

public class Question_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();
	     	ResultSet rs = st.executeQuery(" select eid, ename ,designation from employee where designation='manager'");

			System.out.println("manager of an employee table ");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
					
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
