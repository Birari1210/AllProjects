package jdbcAss.Test;


import org.springframework.jdbc.core.JdbcTemplate;

import jdbcAss.Company;

public class CompanyDao {
	
	private JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}

	public int insertCompanyDetails(Company c) {
		String query = "insert into Company (compID, comName, comProduct, productReleaseon) values ('" + c.getCompID() + "','"+ c.getComName()+"','" + c.getComProduct() + "','"+ c.getProductReleaseon() + "')";
		return objJDBC.update(query);
	}
	
	
	public int updateCompany(Company c) {
		String query = "update Company set comName='" + c.getComName() + "',comProduct='" + c.getComProduct() + "',productReleaseon='" + c.getProductReleaseon()
				+ "' where compID=" + c.getCompID();
		return objJDBC.update(query);
	}
	
	public int DeleteCompany(int compID) {
		String query = "delete from company where compID=" + compID;
		return objJDBC.update(query);
	}

	
}
