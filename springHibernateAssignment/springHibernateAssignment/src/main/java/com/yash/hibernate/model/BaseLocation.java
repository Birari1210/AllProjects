package com.yash.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BaseLocation {
@Id
@Column(name="base_id")
	private int blocid;
 
	private String blocname;
	
	@OneToMany(mappedBy="baselocation",cascade = CascadeType.ALL)
	private List <Employee> employee;
	
	 public BaseLocation() {
		 
	 }
	 
    public BaseLocation(int blocid, String blocname) {
		super();
		this.blocid = blocid;
		this.blocname = blocname;
	}

	public int getBlocid() {
		return blocid;
	}

	public void setBlocid(int blocid) {
		this.blocid = blocid;
	}

	public String getBlocname() {
		return blocname;
	}

	public void setBlocname(String blocname) {
		this.blocname = blocname;
	}

	
	

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "BaseLocation [blocid=" + blocid + ", blocname=" + blocname + "]";
	}
    
}
