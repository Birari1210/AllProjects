package com.yash.jdbcdemo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.jdbcdemo.model.Emp;

public class EmpDAO {

	private JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}

//	public int saveEmp(Emp e) {
//		String query = "insert into emp (ename,salary,dob)values ('" + e.getEname() + "'," + e.getSal() + ",'"
//				+ e.getDob() + "')";
//		return objJDBC.update(query);
//	}

//	public int updateEmp(Emp e) {
//		String query = "update emp set ename='" + e.getEname() + "',salary=" + e.getSal() + ",dob='" + e.getDob()
//				+ "' where empid=" + e.getEid();
//		return objJDBC.update(query);
//	}

	public int delEmp(int eid) {
		String query = "delete from emp where empid=" + eid;
		return objJDBC.update(query);
	}

}
