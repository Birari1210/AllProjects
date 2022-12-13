package com.yash.webjdbcass.Dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.webjdbcass.model.Student;

public class StudentDao {
	
	JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	public int addStudent(Student sobj)
	{
		String query = "insert into student (roll_no,fristname,lastname,fathername,mothername,classname,section,dob,date_of_admission,gender,add1,add2,city,student_phoneno,parent_phoneno,email_parent) values("+sobj.getRoll_no()+",'"+sobj.getFristname()+"','"+sobj.getLastname()+"','"+sobj.getFathername()+"','"+sobj.getMothername()+"','"+sobj.getClassname()+"','"+sobj.getSection()+"','"+sobj.getDob()+"','"+sobj.getDate_of_admission()+"','"+sobj.getGender()+"','"+sobj.getAdd1()+"','"+sobj.getAdd2()+"','"+sobj.getCity()+"','"+sobj.getStudent_phoneno()+"','"+sobj.getParent_phoneno()+"','"+sobj.getEmail_parent()+"')";
		 return objJDBC.update(query);
	}
	
	 public List<Student> getAllStudent()
	 {
		 return objJDBC.query("select * from student", new RowMapper<Student>() { 
			  public Student mapRow(ResultSet rs, int row) throws SQLException
			  {
				  Student sobj = new Student();
				  sobj.setId(rs.getInt("id"));
				  sobj.setRoll_no(rs.getInt("roll_no"));
				  sobj.setFristname(rs.getString("fristname"));
				  sobj.setLastname(rs.getString("lastname"));
				  sobj.setFathername(rs.getString("fathername"));
				  sobj.setMothername(rs.getString("mothername"));
				  sobj.setClassname(rs.getString("classname"));
				  sobj.setSection(rs.getString("section"));
				  sobj.setDob(rs.getString("dob"));
				  sobj.setDate_of_admission(rs.getString("date_of_admission"));
				  sobj.setGender(rs.getString("gender"));
				  sobj.setAdd1(rs.getString("add1"));
				  sobj.setAdd2(rs.getString("add2"));
				  sobj.setCity(rs.getString("city"));
				  sobj.setStudent_phoneno(rs.getString("student_phoneno"));
				  sobj.setParent_phoneno(rs.getString("parent_phoneno"));
				  sobj.setEmail_parent(rs.getString("email_parent"));
				  
				  return sobj;
			  }
		 });
	 }
	 
	 public int updateStudent(Student objStudent)
   {
		 String query ="update student set roll_no="+objStudent.getRoll_no()+",fristname='"+objStudent.getFristname()+"',lastname='"+objStudent.getLastname()+"',fathername='"+objStudent.getFathername()+"',mothername='"+objStudent.getMothername()+"',classname='"+objStudent.getClassname()+"',section='"+objStudent.getSection()+"',dob='"+objStudent.getDob()+"',date_of_admission='"+objStudent.getDate_of_admission()+"',gender='"+objStudent.getGender()+"',add1='"+objStudent.getAdd1()+"',add2='"+objStudent.getAdd2()+"',city='"+objStudent.getCity()+"',student_phoneno='"+objStudent.getStudent_phoneno()+"',parent_phoneno='"+objStudent.getParent_phoneno()+"',email_parent='"+objStudent.getEmail_parent()+"' where id="+objStudent.getId();
		 return objJDBC.update(query);
				 
	 }	 
	 public List<Student> getStudentById(int studentid)
	 {
		 return objJDBC.query("select * from student where id="+studentid, new RowMapper<Student>() {
			 public Student mapRow(ResultSet rs,int rowno) throws SQLException
			 {
				 
				 Student st = new Student();

				 st.setId(rs.getInt("id"));
				 st.setRoll_no(rs.getInt("roll_no"));
				 st.setFristname(rs.getString("fristname"));
				 st.setLastname(rs.getString("lastname"));
				 st.setFathername(rs.getString("fathername"));
				 st.setMothername(rs.getString("mothername"));
				 st.setClassname(rs.getString("classname"));
				 st.setSection(rs.getString("section"));
				 st.setDob(rs.getString("dob"));
				 st.setDate_of_admission(rs.getString("date_of_admission"));
				 st.setGender(rs.getString("gender"));
				 st.setAdd1(rs.getString("add1"));
				 st.setAdd2(rs.getString("add2"));
				 st.setCity(rs.getString("city"));
				 st.setStudent_phoneno(rs.getString("student_phoneno"));
				 st.setParent_phoneno(rs.getString("parent_phoneno"));
				 st.setEmail_parent(rs.getString("email_parent"));
				 return st;
			 } 
		 });	 
	 }

	 public int deleteStudentRecord(int studentid)
	 {
		return objJDBC.update("delete from student where id="+studentid); 	 
	 }
}
