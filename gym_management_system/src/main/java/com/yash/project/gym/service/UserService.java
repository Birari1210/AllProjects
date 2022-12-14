package com.yash.project.gym.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.yash.project.gym.model.Acessory;
import com.yash.project.gym.model.User;
import com.yash.project.gym.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepoObj;
	
	@Autowired
	JdbcTemplate objJdbc; // for payment
 
	public void addUser(User objUser) {
		// TODO Auto-generated method stub
		
		userRepoObj.save(objUser);
		
	}
	
	public List<User> getAllUsersList() {
		
	   return (List<User>) userRepoObj.findAll();
	}

	
	public Object getAllUsersListforTrainer() {
		return userRepoObj.findAll();
	}

	//payMent*************
	
/*	
	public List<User> getAllPayments(String name)
	{	
		return objJdbc.query("select * from user where fname='"+name+"'" ,new RowMapper<User>()
	    {
			//select * from Attendance where t_id=7;
			public User mapRow(ResultSet rs, int row) throws SQLException
			{
				User obj = new User();
				obj.setFname(rs.getString("fname"));
				obj.setCourseName(rs.getString("course_name"));
				obj.setCourseFees(rs.getInt("course_fees"));
				obj.setCourseDuration(rs.getInt("course_duration"));				
				return obj;
			}
		});	
	}

	public List<User> showAlldetails()
	{
		List<User> ilist= new ArrayList<User>();
		userRepoObj.findAll().forEach(ilist::add);
		return ilist;		
	}
*/
}