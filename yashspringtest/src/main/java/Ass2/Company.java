package Ass2;

public class Company {

	String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void showCompany() {
		System.out.println("Company of item:-" + cname);
	}
}
