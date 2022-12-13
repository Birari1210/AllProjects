package com.springorm.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springorm.model.Classes;

public class ClassesDao {

	private JdbcTemplate classobjJDBC;

	public void setClassobjJDBC(JdbcTemplate classobjJDBC) {
		this.classobjJDBC = classobjJDBC;
	}
	
	public int addClassData(Classes cobj)
	{
		String query = "insert into class1(classId, className, sectionName) values("+cobj.getClassId()+",'"+cobj.getClassName()+"','"+cobj.getSection()+"')";
	   
		return classobjJDBC.update(query);		

		
	}
	
}
