package com.springAss2.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springAss2.model.Category;
import com.springAss2.model.Customer;
import com.springAss2.model.Item;
import com.springAss2.model.Subcategory;

////Item :- itemid, iname, subcatid, price, dom (not null), date_of_expiry(null allowed), instock, discount

public class ItemDao {
	
	private JdbcTemplate ijdbcobj;

	
	public void setIjdbcobj(JdbcTemplate ijdbcobj) {
		this.ijdbcobj = ijdbcobj;
	
	}
	
//	public int addItem(Item iObj)
//	{
//		String query = "insert into item(itemid, itemname, subcatid, price, dom, doe, instock,discount) values("+iObj.getItemid()+",'"+iObj.getItemName()+"',"+iObj.getSubcatid()+" ,"+iObj.getPrice()+" ,'"+iObj.getDom()+"', '"+iObj.getDoe()+"', "+iObj.getInstock()+", "+iObj.getDiscount()+")";
//		return ijdbcobj.update(query);	
//	}


//	public List<Item> getDataByResultSetExtractor()
//	{ 
//		//                select * from item  join subcatgory on item.subcatid=subcatgory.subcatid;
//		String myquery = " select * from item inner join subcatgory on item.subcatid=subcatgory.subcatid;";
//		return ijdbcobj.query(myquery, new ResultSetExtractor<List<Item>>() 
//		{
//			public List<Item> extractData(ResultSet rs) throws SQLException {
//				List<Item> ilist = new ArrayList<Item>();
//				while (rs.next()) {
//					
//		        Item i = new Item();
//		        Subcategory s = new Subcategory();
//		        Category cat = new Category();
//		        
//		        i.setItemid(rs.getInt("itemid"));
//		        i.setItemName(rs.getString("itemname"));
//		        i.setSubcatid(rs.getInt("subcatid"));
//		        i.setPrice(rs.getDouble("price"));
//		        i.setInstock(rs.getInt("instock"));
//		        i.setDoe(rs.getDate("doe"));
//		        i.setDom(rs.getDate("dom"));
//		        i.setDiscount(rs.getInt("discount"));
//		        
//		        s.setSubcatid(rs.getInt("subcatid "));
//		        s.setSubcatname(rs.getString("subcatname"));
//		        s.setCatid(rs.getInt("catid"));
//		 
//		        i.setSb(s);
//		        
//		        ilist.add(i);
//		        
//	     }
//				return ilist;		
//	   }
//	});
//
//	}
	
public Map<String, Integer> ass1() {
		
		String myquery = "select subcatgory.subcatname,count(*) from item inner join subcatgory on item.subcatid=subcatgory.subcatid group by item.subcatid;";
		return ijdbcobj.query(myquery, new ResultSetExtractor<Map<String, Integer>>() {
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
				Map<String, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getString("subcatname"), rs.getInt("count(*)"));
				}
				return slist;
			}
		});

	}

public Map<String, Integer> ass2() {
	String sqlquery = "select category.catname,count(*) from item inner join subcatgory on item.subcatid=subcatgory.subcatid inner join category on category.catid=subcatgory.catid group by category.catname;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
		public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
			Map<String, Integer> slist = new HashMap<>();
			while (rs.next()) {

				slist.put(rs.getString("catname"), rs.getInt("count(*)"));
			}
			return slist;
		}
	});

}


public List<Integer> que3() {
	
	String sqlquery = "select count(*)from item where instock=0;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<List<Integer>>() {
		public List<Integer> extractData(ResultSet rs) throws SQLException {
			List<Integer> slist = new ArrayList<>();
			while (rs.next()) {

				slist.add(rs.getInt("count(*)"));
			}
			return slist;
		}
	});
}


public Map<String, Integer> ass4() {
	String sqlquery = "select category.catname, count(*) from item inner join subcatgory on item.subcatid=subcatgory.subcatid inner join category on category.catid=subcatgory.catid where instock=0 group by category.catname;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
		public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
			Map<String, Integer> slist = new HashMap<>();
			while (rs.next()) {

				slist.put(rs.getString("catname"), rs.getInt("count(*)"));
			}
			return slist;
		}
	});

}


public List<Item> ass5() {
	
	String sqlquery = "select*from item where instock=0;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<List<Item>>() {
		public List<Item> extractData(ResultSet rs) throws SQLException {
			List<Item> elist = new ArrayList<Item>();
			while (rs.next()) {
				Item i = new Item();
				i.setItemid(rs.getInt("itemid"));
		        i.setItemName(rs.getString("itemname"));
		        i.setSubcatid(rs.getInt("subcatid"));
		        i.setPrice(rs.getDouble("price"));
		        i.setInstock(rs.getInt("instock"));
		        i.setDoe(rs.getDate("doe"));
		        i.setDom(rs.getDate("dom"));
		        i.setDiscount(rs.getInt("discount"));
		        
				
				elist.add(i);

			}
			return elist;
		}
	});
}



public List<Item> ass6() {
	String sqlquery = " select*from item where (select avg(price) from item)<price;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<List<Item>>() {
		public List<Item> extractData(ResultSet rs) throws SQLException {
			List<Item> elist = new ArrayList<Item>();
			while (rs.next()) {
				Item i = new Item();
				
				i.setItemid(rs.getInt("itemid"));
		        i.setItemName(rs.getString("itemname"));
		        i.setSubcatid(rs.getInt("subcatid"));
		        i.setPrice(rs.getDouble("price"));
		        i.setInstock(rs.getInt("instock"));
		        i.setDoe(rs.getDate("doe"));
		        i.setDom(rs.getDate("dom"));
		        i.setDiscount(rs.getInt("discount"));
		        
				elist.add(i);

			}
			return elist;
		}
	});
}


public List<Integer> ass7() {
	String myquery = "select max(discount) as largestdiscount from item;";
	return ijdbcobj.query(myquery, new ResultSetExtractor<List<Integer>>() {
		public List<Integer> extractData(ResultSet rs) throws SQLException {
			List<Integer> slist = new ArrayList<>();
			while (rs.next()) {

				slist.add(rs.getInt("largestdiscount"));
			}
			return slist;
		}
	});

}
//public List<Item> ass71() {
//	
//	String myquery = "select max(discount) as largestdiscount from item;";
//	return ijdbcobj.query(myquery, new ResultSetExtractor<List<Item>>() {
//		public List<Item> extractData(ResultSet rs) throws SQLException {
//			List<Item> slist = new ArrayList<>();
//			while (rs.next()) {
//
//				slist.addAll(rs.getInt("largestdiscount"), slist);
//			}
//			return slist;
//		}
//	});
//}

public Map<String, Integer> Ass8() {
	
	String myquery = " select item.itemname,sum(bill_item.quantity) from item inner join bill_item on item.itemid=bill_item.itemid group by bill_item.itemid order by sum(bill_item.quantity)  limit 1;";
	return ijdbcobj.query(myquery, new ResultSetExtractor<Map<String, Integer>>() {
		public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
			Map<String, Integer> slist = new HashMap<>();
			while (rs.next()) {
				slist.put(rs.getString("itemname"), rs.getInt("sum(bill_item.quantity)"));
			}
			return slist;
		}
	});
}


public Map<String, Integer> ass9() {
	
	String sqlquery = "select item.itemname,sum(bill_item.quantity) from item inner join bill_item on item.itemid=bill_item.itemid group by bill_item.itemid order by sum(bill_item.quantity) desc limit 1 ";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
		public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
			Map<String, Integer> slist = new HashMap<>();
			while (rs.next()) {

				slist.put(rs.getString("itemname"), rs.getInt("sum(bill_item.quantity)"));
			}
			return slist;
		}
	});
}


public Map<String, Integer> ass10() {
	
	String sqlquery = "select customername,count(*) from bill  join customer on bill.customerid=customer.customerid group by customer.customerid order by count(*) desc limit 2";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
		public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
			Map<String, Integer> slist = new HashMap<>();
			while (rs.next()) {

				slist.put(rs.getString("customername"), rs.getInt("count(*)"));
			}
			return slist;
		}
	});
}


public Map<String, Integer> ass11() {
	
	
	String sqlquery = "select customername,count(*) from bill inner join customer on bill.customerid=customer.customerid group by customer.customerid order by count(*)<=1;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
		public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
			Map<String, Integer> slist = new HashMap<>();
			while (rs.next()) {

				slist.put(rs.getString("customername"), rs.getInt("count(*)"));
			}
			return slist;
		}
	});
}


public List<Customer> ass12() {
	String sqlquery = "select * from customer inner join bill on customer.customerid=bill.customerid inner join bill_item on bill_item.billid= bill.billid where price>(select avg(price) from bill_item) ;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<List<Customer>>() {
		public List<Customer> extractData(ResultSet rs) throws SQLException {
			List<Customer> elist = new ArrayList<Customer>();
			while (rs.next()) {
				Customer e = new Customer();
				e.setCustomerid(rs.getInt("customerid"));
				e.setCustomerName(rs.getString("customername"));
				e.setEmail(rs.getString("email"));
				e.setDob(rs.getDate("dob"));
				e.setAddress1(rs.getString("address1"));
				e.setAddress2(rs.getString("address2"));
				e.setPincode(rs.getInt("pincode"));

				elist.add(e);
			}
			return elist;
		}
	});
	
	
	
}


public List<Item> ass13() {
	
	String sqlquery = "  select item.* from item  join bill_item on bill_item.itemid=item.itemid inner join bill on bill.billid=bill_item.billid where dateofbill between '2020-10-10' and '2021-06-07' group by bill_item.billItemid;";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<List<Item>>() {
		public List<Item> extractData(ResultSet rs) throws SQLException {
			List<Item> elist = new ArrayList<Item>();
			while (rs.next()) {
				Item e = new Item();
				e.setItemid(rs.getInt("itemid"));
				e.setItemName(rs.getString("itemname"));
				e.setSubcatid(rs.getInt("subcatid"));
				e.setPrice(rs.getInt("price"));
				e.setDom(rs.getDate("dom"));
				e.setInstock(rs.getInt("instock"));
				e.setDiscount(rs.getInt("discount"));
                 e.setDoe(rs.getDate("doe"));
				elist.add(e);

			}
			return elist;
		}
	});
	
}


public Map<Date, Integer> ass14() {
	
		String sqlquery = "select dateofbill ,sum(price) from bill inner join bill_item on bill.billid=bill_item.billid group by dateofbill";
		return ijdbcobj.query(sqlquery, new ResultSetExtractor<Map<Date, Integer>>() {
			public Map<Date, Integer> extractData(ResultSet rs) throws SQLException {
				Map<Date, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getDate("dateofbill"), rs.getInt("sum(price)"));
				}
				return slist;
			}
			
		});
	
}


public Map<Date, Integer> ass15() {
	String sqlquery = "select dateofbill ,avg(price) from bill join bill_item on bill.billid=bill_item.billid group by dateofbill";
	return ijdbcobj.query(sqlquery, new ResultSetExtractor<Map<Date, Integer>>() {
		public Map<Date, Integer> extractData(ResultSet rs) throws SQLException {
			Map<Date, Integer> slist = new HashMap<>();
			while (rs.next()) {

				slist.put(rs.getDate("dateofbill"), rs.getInt("avg(price)"));
	
			}
			return slist;
		}
	});
	
}



	
	
}




