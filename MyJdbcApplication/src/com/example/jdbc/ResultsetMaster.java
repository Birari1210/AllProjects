package com.example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
public class ResultsetMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee ");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
					
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
