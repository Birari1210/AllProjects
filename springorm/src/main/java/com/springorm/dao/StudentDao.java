package com.springorm.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springorm.model.Result;
import com.springorm.model.Student;

public class StudentDao {

	private JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
	public int saveStudent(Student stud)
	{
		String query = "insert into student (sid, sname,fatherName,motherName,classid,address1,address2,pincode,aadharno,dob,doa) values ("+stud.getSid()+",'"+stud.getSname()+"','"+stud.getFather_name() +"','"+stud.getMother_name()+"',"
				+ ""+stud.getClassid()+",'"+stud.getAddress1()+"','"+stud.getAddress2()+"','"+stud.getPincode()+"',"+stud.getAadharno()+",'"+stud.getDob()+"','"+stud.getDate_of_addmission()+"')";
		
				return objJDBC.update(query);		
	}
	
//	public List<Student>  getStudent()
//	{
//		//System.out.println("id print");
//		return objJDBC.query("select * from student",new RowMapper<Student>()
//		{
//
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				
//				Student sobj = new Student();
//				sobj.setSid(rs.getInt("sid"));
//				sobj.setSname(rs.getString("sname"));
//				sobj.setFather_name(rs.getString("fathername"));
//				sobj.setAddress1(rs.getString("address1"));
//				return sobj;
//				
//			}
//		
//		});
//	}

	public List<Student> getId(int id)
	{
		return objJDBC.query("select * from student where sid="+id,new RowMapper<Student>()
		{

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	
				
				Student sobj = new Student();
				sobj.setSid(rs.getInt("sid"));
				sobj.setSname(rs.getString("sname"));
				sobj.setFather_name(rs.getString("fatherName"));
				sobj.setAddress1(rs.getString("address1"));
				return sobj;
				
			}
			
		});
	
	}	
}
