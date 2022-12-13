package com.yash.webjdbcass.Dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.webjdbcass.model.UserProfile;

public class ProfileDao {
	
JdbcTemplate objJDBC;
	
	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}

	public int saveUserProfile(UserProfile up) 
	{
		String query="insert into userProfile (uid,name,address,mobileno)values("+up.getUid()+",'"+up.getName()+"','"+up.getAddress()+"','"+up.getMobileno()+"')";
		return objJDBC.update(query);
	}
	
	public List<UserProfile> getAllUser() 
	{
		 return objJDBC.query("select * from userProfile",new RowMapper<UserProfile>()
		 {
			  public UserProfile mapRow(ResultSet rs, int row) throws SQLException
			  {
			  
				  UserProfile obj = new UserProfile();	
				 obj.setUid(rs.getInt("uid"));
				 obj.setName(rs.getString("name"));
				 obj.setAddress(rs.getString("address"));
				 obj.setMobileno(rs.getString("mobileno"));
				  return obj;
			  }
		 });
	}
	
	public int updateUser(UserProfile objp)
	 {
		 String query ="update userProfile set name='"+objp.getName()+"',address='"+objp.getAddress()+"',mobileno='"+objp.getMobileno()+"' where uid="+objp.getUid();
		 return objJDBC.update(query);
				 
	 }

	 public List<UserProfile> getUserById(int userid)
	 {
		 return objJDBC.query("select * from userProfile where uid="+userid, new RowMapper<UserProfile>() {
			 public UserProfile mapRow(ResultSet rs,int rowno) throws SQLException
			 {
				 UserProfile obj = new UserProfile();
				 obj.setUid(rs.getInt("uid"));
				 obj.setName(rs.getString("name"));
				 obj.setAddress(rs.getString("address"));
				 obj.setMobileno(rs.getString("mobileno"));
				return obj;
			 }
			 
		 });
		 
	 }
	 
	 public int deleteUser(int userid)
	 {
		return objJDBC.update("delete from userProfile where uid="+userid); 	 
	 }
	
}
