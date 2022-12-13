package com.springorm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springorm.model.JoinClass;
import com.springorm.model.Result;

public class ResultDao {
	
	private JdbcTemplate RobjJDBC;

	public void setRobjJDBC(JdbcTemplate robjJDBC) {
		RobjJDBC = robjJDBC;
		
	}
  //   rid, Maths, Hindi,English, science, Sanskrit, sid, datetime
	public int addResult(Result rObj)
	{
		String query = "insert into result(rid, math, hindi, english,science, Sanskrit, sid, DateTime) values("+rObj.getRid()+","+rObj.getMaths()+","+rObj.getHindi()+","+rObj.getEnglish()+
				","+rObj.getScience()+","+rObj.getSanskrit()+","+rObj.getSid()+",'"+rObj.getDatetime()+"')";
		
		return RobjJDBC.update(query);	
	}			
	  
	public List<Result>  getresultDetails()
	{
		return RobjJDBC.query("Select * from result",new RowMapper<Result>()
		{

			@Override
			public Result mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Result rObj = new Result();
				rObj.setSid(rs.getInt("sid"));
				rObj.setMaths(rs.getInt("math"));
				rObj.setHindi(rs.getInt("hindi"));
				rObj.setEnglish(rs.getInt("english"));
				return rObj;
				
			}
				
		});
	}
	public List<JoinClass> joinData() {
		
		return RobjJDBC.query("select result.sid,student.classid,result.math,result.english ,result.hindi,result.science,result.Sanskrit,class1.sectionName ,class1.className from result JOIN student on student.sid=result.sid join class1 on class1.classid=student.classid;\r\n"
				+ "",new RowMapper<JoinClass>()
				{

					@Override
					public JoinClass mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						JoinClass jc = new JoinClass();
						jc.setSid(rs.getInt("sid"));
						jc.setMath(rs.getInt("math"));
						jc.setHindi(rs.getInt("hindi"));
						jc.setEnglish(rs.getInt("english"));
						jc.setScience(rs.getInt("science"));
						jc.setSanskrit(rs.getInt("Sanskrit"));
						jc.setSectioname(rs.getString("sectionName"));
						jc.setClassName(rs.getString("className"));
						
						
						
						return jc;
					}
			
				});
	
		
	}
	
}
