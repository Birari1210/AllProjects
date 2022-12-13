package Que2;

import java.sql.Date;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class IteamDao {
	private JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}

	public List<Iteam> getDataByResultSetExtractor() {
		String sqlquery = "select * from iteam inner join subcatagory on iteam.subcatid=subcatagory.subcatid";
		return objJDBC.query(sqlquery, new ResultSetExtractor<List<Iteam>>() {
			public List<Iteam> extractData(ResultSet rs) throws SQLException {
				List<Iteam> elist = new ArrayList<Iteam>();
				while (rs.next()) {
					Iteam e = new Iteam();
					Subcatagory s = new Subcatagory();
					Catagory c1 = new Catagory();
					e.setIteamid(rs.getInt("iteamid"));
					e.setIname(rs.getString("iname"));
					e.setSubcatid(rs.getInt("subcatid"));
					e.setPrice(rs.getInt("price"));
					e.setDom(rs.getDate("dom"));

					e.setInstock(rs.getInt("instock"));
					e.setDiscount(rs.getFloat("discount"));
					e.setDoe(rs.getDate("doe"));

					s.setSubcatid(rs.getInt("subcatid"));
					s.setSubcatname(rs.getString("subcatname"));
					s.setCatid(rs.getInt("catid"));

					e.setS(s);

					elist.add(e);
				}
				return elist;
			}
		});

	}

	public Map<String, Integer> getDataByResultSetExtractor1() {
		
		String sqlquery = "select subcatagory.subcatname,count(*) from iteam inner join subcatagory on iteam.subcatid=subcatagory.subcatid group by iteam.subcatid;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
				Map<String, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getString("subcatname"), rs.getInt("count(*)"));
				}
				return slist;
			}
		});

	}

	public Map<String, Integer> que2() {
		String sqlquery = "select catagory.catname,count(*) from iteam inner join subcatagory on iteam.subcatid=subcatagory.subcatid inner join catagory on catagory.catid=subcatagory.catid group by catagory.catname;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
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
		String sqlquery = "select count(*)from iteam where instock=0;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<List<Integer>>() {
			public List<Integer> extractData(ResultSet rs) throws SQLException {
				List<Integer> slist = new ArrayList<>();
				while (rs.next()) {

					slist.add(rs.getInt("count(*)"));
				}
				return slist;
			}
		});

	}

	public Map<String, Integer> que4() {
		String sqlquery = "select catagory.catname, count(*) from iteam inner join subcatagory on iteam.subcatid=subcatagory.subcatid inner join catagory on catagory.catid=subcatagory.catid where instock=0 group by catagory.catname;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
				Map<String, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getString("catname"), rs.getInt("count(*)"));
				}
				return slist;
			}
		});

	}

	public List<Iteam> que5() {
		String sqlquery = "select*from iteam where instock=0;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<List<Iteam>>() {
			public List<Iteam> extractData(ResultSet rs) throws SQLException {
				List<Iteam> elist = new ArrayList<Iteam>();
				while (rs.next()) {
					Iteam e = new Iteam();
					e.setIteamid(rs.getInt("iteamid"));
					e.setIname(rs.getString("iname"));
					e.setSubcatid(rs.getInt("subcatid"));
					e.setPrice(rs.getInt("price"));
					e.setDom(rs.getDate("dom"));
					e.setInstock(rs.getInt("instock"));
					e.setDiscount(rs.getFloat("discount"));
					e.setDoe(rs.getDate("doe"));
					elist.add(e);

				}
				return elist;
			}
		});
	}

	public List<Iteam> que6() {
		String sqlquery = " select*from iteam where (select avg(price) from iteam)<price;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<List<Iteam>>() {
			public List<Iteam> extractData(ResultSet rs) throws SQLException {
				List<Iteam> elist = new ArrayList<Iteam>();
				while (rs.next()) {
					Iteam e = new Iteam();
					e.setIteamid(rs.getInt("iteamid"));
					e.setIname(rs.getString("iname"));
					e.setSubcatid(rs.getInt("subcatid"));
					e.setPrice(rs.getInt("price"));
					e.setDom(rs.getDate("dom"));
					e.setInstock(rs.getInt("instock"));
					e.setDiscount(rs.getFloat("discount"));
                     e.setDoe(rs.getDate("doe"));
					elist.add(e);

				}
				return elist;
			}
		});
	}

	public List<Float> que7() {
		String sqlquery = "select max(discount) as largestdiscount from iteam;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<List<Float>>() {
			public List<Float> extractData(ResultSet rs) throws SQLException {
				List<Float> slist = new ArrayList<>();
				while (rs.next()) {

					slist.add(rs.getFloat("largestdiscount"));
				}
				return slist;
			}
		});

	}

	public Map<String, Integer> que8() {
		String sqlquery = "select iteam.iname,sum(bill_iteam.qty) from iteam inner join bill_iteam on iteam.iteamid=bill_iteam.iteamid group by bill_iteam.iteamid order by sum(bill_iteam.qty)  limit 1 ;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
				Map<String, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getString("iname"), rs.getInt("sum(bill_iteam.qty)"));
				}
				return slist;
			}
		});
	}

	public Map<String, Integer> que9() {
		String sqlquery = "select iteam.iname,sum(bill_iteam.qty) from iteam inner join bill_iteam on iteam.iteamid=bill_iteam.iteamid group by bill_iteam.iteamid order by sum(bill_iteam.qty) desc limit 1 ;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
				Map<String, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getString("iname"), rs.getInt("sum(bill_iteam.qty)"));
				}
				return slist;
			}
		});
	}

	public Map<String, Integer> que10() {
		String sqlquery = "select customername,count(*) from bill inner join customer on bill.customerid=customer.customerid group by customer.customerid order by count(*) desc limit 1;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
				Map<String, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getString("customername"), rs.getInt("count(*)"));
				}
				return slist;
			}
		});
	}

	public Map<String, Integer> que11() {
		String sqlquery = "select customername,count(*) from bill inner join customer on bill.customerid=customer.customerid group by customer.customerid order by count(*)<=1 desc limit 1;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
				Map<String, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getString("customername"), rs.getInt("count(*)"));
				}
				return slist;
			}
		});
	}

	public List<Customer> que12() {
		String sqlquery = "select * from customer inner join bill on customer.customerid=bill.customerid inner join bill_iteam on bill_iteam.billid= bill.billid where price>(select avg(price) from bill_iteam) ;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<List<Customer>>() {
			public List<Customer> extractData(ResultSet rs) throws SQLException {
				List<Customer> elist = new ArrayList<Customer>();
				while (rs.next()) {
					Customer e = new Customer();
					e.setCustomerid(rs.getInt("customerid"));
					e.setCustomername(rs.getString("customername"));
					e.setEmail(rs.getString("email"));
					e.setAdd1(rs.getString("add1"));
					e.setAdd2(rs.getString("add2"));
					e.setPincode(rs.getString("pincode"));

					elist.add(e);
				}
				return elist;
			}
		});
	}
	public List<Iteam> que13() {
		String sqlquery = "  select iteam.* from iteam inner join bill_iteam on bill_iteam.iteamid=iteam.iteamid inner join bill on bill.billid=bill_iteam.billid where dobill between '2022-02-02' and '2022-3-1' group by bill_iteam.biid;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<List<Iteam>>() {
			public List<Iteam> extractData(ResultSet rs) throws SQLException {
				List<Iteam> elist = new ArrayList<Iteam>();
				while (rs.next()) {
					Iteam e = new Iteam();
					e.setIteamid(rs.getInt("iteamid"));
					e.setIname(rs.getString("iname"));
					e.setSubcatid(rs.getInt("subcatid"));
					e.setPrice(rs.getInt("price"));
					e.setDom(rs.getDate("dom"));
					e.setInstock(rs.getInt("instock"));
					e.setDiscount(rs.getFloat("discount"));
                     e.setDoe(rs.getDate("doe"));
					elist.add(e);

				}
				return elist;
			}
		});
	}
	
	public Map<Date, Integer> que14() {
		String sqlquery = "select dobill,sum(price) from bill inner join bill_iteam on bill.billid=bill_iteam.billid group by dobill;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<Date, Integer>>() {
			public Map<Date, Integer> extractData(ResultSet rs) throws SQLException {
				Map<Date, Integer> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getDate("dobill"), rs.getInt("sum(price)"));
				}
				return slist;
			}
		});
	}
	public Map<Date,Float> que15() {
		String sqlquery = "select dobill ,avg(price) from bill inner join bill_iteam on bill.billid=bill_iteam.billid group by dobill;";
		return objJDBC.query(sqlquery, new ResultSetExtractor<Map<Date, Float>>() {
			public Map<Date, Float> extractData(ResultSet rs) throws SQLException {
				Map<Date, Float> slist = new HashMap<>();
				while (rs.next()) {

					slist.put(rs.getDate("dobill"), rs.getFloat("avg(price)"));
					
				}
				return slist;
			}
		});
	}
}
