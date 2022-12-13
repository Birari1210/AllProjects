package com.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JoinClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
				//select employee.ename,department.dname from employee JOIN department on department.deptid = employee.deptid ;
				Connection conn = ConnectionMaster.getConnection();
				Statement st = conn.createStatement();
				//ResultSet rs = st.executeQuery(" select department.*,employee.ename from department JOIN employee on department.deptid = employee.deptid  group by dname");
				
				
				//q_1
				//ResultSet rs = st.executeQuery("select employee.ename,department.dname from employee JOIN department on department.deptid = employee.deptid");
				
				//q_2
				//ResultSet rs = st.executeQuery("SELECT ename, salary from employee WHERE salary = (SELECT Max(Salary) FROM Employee)");
				
				//q_3 
				//ResultSet rs = st.executeQuery(" select ename, Max(salary) from employee where salary < (select Max(salary) from Employee)");

				//q_4
				
			//	ResultSet rs = st.executeQuery(" select eid, ename ,designation from employee where designation='manager'");
				
				
				//Q_6 count no of employee
				//ResultSet rs = st.executeQuery("select count(*) ,dname from employee  join department on department.deptid = employee.deptid group by dname");
				
				
				//Q_7 avarage salary 
				
				ResultSet rs = st.executeQuery("select gender,AVG(salary) AS AVERAGE_SALARY FROM employee GROUP BY gender");
				
				while(rs.next())
				{
					//System.out.println("count number of employee in each department "+rs.getInt(1)+"  "+rs.getString(2));
					
				//	System.out.println("max salary "+rs.getString(1)+"   "+rs.getInt(2));
					
					System.out.println("second max salary "+rs.getString(1)+"   "+rs.getInt(2));
					
				//	System.out.println("Employee this department is manager "+rs.getInt(1)+" "+rs.getString(2)+"   "+rs.getString(3));
					
				
						
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		
	}
}

//SELECT ename, salary from employee WHERE salary = (SELECT Max(Salary) FROM Employee)

//SELECT ename, MAX(salary) AS salary FROM employee WHERE salary IN(SELECT salary FROM employee MINUS SELECT MAX(salary) FROM employee);
//
//SELECT MAX(SALARY) FROM Employee WHERE SALARY < (SELECT MAX(SALARY) FROM Employee);


//select gender,AVG(salary) AS AVERAGE_SALARY FROM employee GROUP BY gender;
