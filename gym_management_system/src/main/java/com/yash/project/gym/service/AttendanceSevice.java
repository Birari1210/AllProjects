package com.yash.project.gym.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.yash.project.gym.model.Attendance;
import com.yash.project.gym.repository.AttendanceRepo;

@Service
public class AttendanceSevice {

	@Autowired
	AttendanceRepo AttendRepoObj;
   
	@Autowired
	JdbcTemplate objJdbc; 
 
	public void addAttendance(Attendance atObj) {
		
		AttendRepoObj.save(atObj);
		
	}

	public Object attendanceforAdmin() {
		// TODO Auto-generated method stub
		
		return AttendRepoObj.findAll();
	}

	public Attendance approveAttendance(int id) {
		
		Optional<Attendance> optional = AttendRepoObj.findById(id);
		Attendance atdObj = optional.get();
		return atdObj;
	}

	public void saveApproveAttendance(Attendance atdObj) {

		AttendRepoObj.save(atdObj);
	}

	public Object attendanceforTrainer() {
		
		return AttendRepoObj.findAll();
	}
	
	
	public List<Attendance> getAllAttendance(int id)
	{	
		return objJdbc.query("select * from Attendance where t_id="+id+"",new RowMapper<Attendance>()
	    {
			//select * from Attendance where t_id=7; "select * from user where fname='"+name+"'"
			public Attendance mapRow(ResultSet rs, int row) throws SQLException
			{
				Attendance obj = new Attendance();
				
				obj.setName(rs.getString("name"));
				obj.settId(rs.getInt("t_id"));
				obj.setDate(rs.getString("date"));
				obj.setApprove(rs.getString("approve"));
				
//				obj.setFname(rs.getString("fname"));
//				obj.setCourseName(rs.getString("course_name"));
//				obj.setCourseFees(rs.getInt("course_fees"));
//				obj.setCourseDuration(rs.getInt("course_duration"));				
           			return obj;
			}
		});	
	}

	
}
