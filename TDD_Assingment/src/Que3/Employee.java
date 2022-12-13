package Que3;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
	
	

	public static void main(String[] args) //throws Exception
	{
		
		
		try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdd","root","1234");
		//System.out.println("Connection sucessfull");
		Statement st = conect.createStatement();

		String query = "select email, password from employee";
	      System.out.println("yes");

        ResultSet result = st.executeQuery(query);
	      while(result.next()){
		      System.out.println("ok");

	    	  String email = result.getString("email");
	    	  String pass = result.getString("password");
		      System.out.println(email);
		      System.out.println(pass);

	      }
		}
	      catch(Exception ex){

	    	  ex.printStackTrace();
	    	  
	      }
	     
		
		//ResultSet rs = st.executeQuery("select * from employee");
		 //rs.next();
        //	String email = rs.getString("email");
       //	String pass = rs.getString("password");
      //System.out.println(email);
       //  System.out.println(result);
		
		}
}



