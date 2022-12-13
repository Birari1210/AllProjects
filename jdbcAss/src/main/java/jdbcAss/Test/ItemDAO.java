package jdbcAss.Test;

import java.sql.PreparedStatement;


import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import jdbcAss.Item;

public class ItemDAO {
	
	private JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	//itemNo; iname;category,company
	
	 public int addItem(Item i) {
			String query = "insert into Item (iname, category, company)values ('" + i.getIname() + "','" + i.getCategory() + "','" + i.getCompany() + "')";
			return objJDBC.update(query);
		}
	
	public int updateItem(Item i) {
	String query = "update Item set iname='" + i.getIname() + "',category='" + i.getCategory() + "',company= '" + i.getCompany() + "' where itemNo=" + i.getItemNo();
	return objJDBC.update(query);
}
	
	
	public int DeleteItem(int itemNo) {
		String query = "delete from item where itemNo=" + itemNo;
		return objJDBC.update(query);
	}
	
	
	// example using  prepared statement; 	//itemNo; iname;category,company

	 	 public Boolean insertItemByPS(final Item i) 
	 	{
	 		String query ="insert into item (iname,category,company) values(?,?,?)";
	 		
	 		return objJDBC.execute(query, new PreparedStatementCallback<Boolean>() {
	 			public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException,DataAccessException
	 			{
	 				//ps.setInt(1, i.getItemNo() );
	 				ps.setString(1, i.getIname());
	 				ps.setString(2, i.getCategory());
	 				ps.setString(3,i.getCompany());
	 				return ps.execute();
	 			} 			
	 		});
	 }
	 	 
	 	 public Integer updateItemPS(final Item i)
	 	 {
	  		String query="update item set iname=?,category=?,company=? where itemNo=?";
	  	
	  		return objJDBC.execute(query, new PreparedStatementCallback<Integer>() {
	  			
	  			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException,DataAccessException
	  			{
	 				ps.setString(1, i.getIname());
	 				ps.setString(2, i.getCategory());
	 				ps.setString(3,i.getCompany());
	 				ps.setInt(4, i.getItemNo());
	 				return ps.executeUpdate();	
	  			}
			});
	 	 }
}
