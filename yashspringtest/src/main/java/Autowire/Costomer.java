package Autowire;

public class Costomer {
	String Cname;
	int MobNo;
	String address;
	
	
	public Costomer() {
		super();
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getMobNo() {
		return MobNo;
	}
	public void setMobNo(int mobNo) {
		MobNo = mobNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Costomer(String cname, int mobNo, String address) {
		super();
		Cname = cname;
		MobNo = mobNo;
		this.address = address;
	}
	public void cDetails()
	{
		System.out.println("Costomer Name - "+Cname);
		System.out.println("costomer Mobile Num. - "+MobNo);
		System.out.println("Costomer Address - "+address);
	}
	
}
