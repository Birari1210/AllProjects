package com.example.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;


public class EmployeeDao {

	public static void insetEmployee(Employee e) throws Exception
	{
		// TODO Auto-generated method stub
		
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst =conn.prepareStatement("insert into employee(eid, ename, salary, deptid, designation) value(?,?,?,?,?) ");
		
		pst.setInt(1,e.getEid());
	
		pst.setString(2, e.getEname());
		pst.setInt(3, e.getSalary());
		pst.setInt(4, e.getDeptid());
		pst.setString(5, e.getDesignation());
		pst.executeUpdate();
		conn.close();
		
		}
	
	public static void UpdateEmployee(Employee e) throws Exception
	{
		try {
			
			Scanner sc = new Scanner(System.in);
	       Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn =ConnectionMaster.getConnection();
		    PreparedStatement pst = conn.prepareStatement("update employee set  ename=? , salary=? , deptid=? ,  designation=?, gender=?  where eid=?");	    
		    
		    pst.setInt(6,e.getEid());
			
			pst.setString(1, e.getEname());
			pst.setInt(2, e.getSalary());
			pst.setInt(3, e.getDeptid());
			pst.setString(4, e.getDesignation());
		    pst.setString(5, e.getGender()); // add gender;
			
	        
		    pst.executeUpdate();
		    conn.close();
		    
		}catch (Exception e1) 
		{
			System.out.println( e1.getMessage());
			// TODO: handle exception
		}
			
	}
	
	
	public  static List<Employee> getAllEmployee() throws Exception
	{
		List<Employee> emp = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next())
			emp.add(new Employee(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),rs.getString(6)));
		
		
		return emp;
		
		
	}
	
	public  static Employee getEmployeeById(int id) throws Exception
	{
		List<Employee> emp = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement st = conn.prepareStatement("select * from employee where eid =? ");
		st.setInt(1, id);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
			return  new Employee(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),rs.getString(6));
		else
		{
			System.out.println("Employee not found");
			return null;
		}
		
		
		//return emp;
		
	}
	
	public  static Employee getEmployeeByName(String ename) throws Exception
	{
		List<Employee> emp = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement st = conn.prepareStatement("select * from employee where ename = ? ");
		st.setString(1, ename);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
			return new Employee(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),rs.getString(6));
		else
		{
			System.out.println("Employee not found");
			return null;
		}
		
		
	}
	public  static  Employee deleteEmp(int eid) throws Exception
	{
		
	        Scanner sc = new Scanner(System.in);
	        Connection conn = ConnectionMaster.getConnection();
		    PreparedStatement pst = conn.prepareStatement("delete from employee where eid=?");
		    
		    pst.setInt(1, eid);

			ResultSet rs = pst.executeQuery();
		    
              if(rs.next())
              {
            	  System.out.println("Employee deleted succsesfully..");
              }
              else
              {
            	  System.out.println("not found..");
            	  
              }
              return null ; 
           	
              
	}
	
	public static List<Employee> getEmployeeByDepartment(String dname) throws Exception
	{
		List<Employee> emp = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement st = conn.prepareStatement(" select * from employee where deptid=(select deptid from  department where dname=?");
		st.setString(1, dname);
		
		ResultSet rs = st.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <=rsmd.getColumnCount(); i++) //not
		{
			System.out.println(rsmd.getColumnName(i)+" has the type "+ rsmd.getColumnTypeName(i));
			
		}
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3)+" "+ rs.getInt(4)+" "+ rs.getString(5)+" "+rs.getString(6));
		}
		
		return emp;
		
	}
	
	public static void deleteEmployee(int eid) throws Exception
	{
		Connection conn = ConnectionMaster.getConnection();
	    CallableStatement st = conn.prepareCall("{ call delete_employee(?)}");  //callable statement with out parameter study?
	    
	    st.setInt(1, eid);
        st.execute();
	    conn.close();
	}
	
}
