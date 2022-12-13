package com.yash.webjdbcass.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.webjdbcass.model.Item;

public class ItemDao {
	JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	 public int addItem(Item iobj)
	 {	 
		 String query ="insert into item (iname,price,quantity,discount,total) values('"+iobj.getIname()+"',"+iobj.getPrice()+","+iobj.getQuantity()+","+iobj.getDiscount()+","+iobj.getTotal()+")";  
		 return objJDBC.update(query);
	 }
	 
	 public List<Item> getAllItem()
	 {
		 return objJDBC.query("select * from item", new RowMapper<Item>() { //give all value in list 
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  {
				  Item iobj = new Item();
				  iobj.setId(rs.getInt("id"));
				  iobj.setIname(rs.getString("iname"));
				  iobj.setPrice(rs.getFloat("price"));
				  iobj.setQuantity(rs.getInt("quantity"));
				  iobj.setDiscount(rs.getFloat("discount"));
				  iobj.setTotal(rs.getDouble("total"));
				  return iobj;
			  }
		 });
	 }
	 
	 
	 public int updateItem(Item objItem)
	 {
		 String query ="update item set iname='"+objItem.getIname()+"',price="+objItem.getPrice()+",quantity="+objItem.getQuantity()+",discount="+objItem.getDiscount()+",total="+objItem.getTotal()+" where id="+objItem.getId();
		 return objJDBC.update(query);
				 
	 }	 
	 public List<Item> getItemById(int itemid)
	 {
		 return objJDBC.query("select * from item where id="+itemid, new RowMapper<Item>() {
			 public Item mapRow(ResultSet rs,int rowno) throws SQLException
			 {
				
				  Item itm = new Item();

				  itm.setId(rs.getInt("id"));
				  itm.setIname(rs.getString("iname"));
				  itm.setPrice(rs.getFloat("price"));
				  itm.setQuantity(rs.getInt("quantity"));
				  itm.setDiscount(rs.getFloat("discount"));
				  itm.setTotal(rs.getDouble("total"));

				  return itm;
			 } 
		 });	 
	 }
	 public int deleteItem(int itemid)
	 {
		return objJDBC.update("delete from item where id="+itemid); 	 
	 }

}
