package com.yash.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Irm {
@Id
@Column(name="irm_id")
	private int irmid;
	private String irmname;
	
	@OneToMany(mappedBy="irm",cascade = CascadeType.ALL)
	private  List<Employee> employee;
	
	
	public Irm() {
		super();
	}


	public Irm(int irmid, String irmname) {
	
		this.irmid = irmid;
		this.irmname = irmname;
	}


	public int getIrmid() {
		return irmid;
	}


	public void setIrmid(int irmid) {
		this.irmid = irmid;
	}


	public String getIrmname() {
		return irmname;
	}


	public void setIrmname(String irmname) {
		this.irmname = irmname;
	}





	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Irm [irmid=" + irmid + ", irmname=" + irmname + "]";
	}
	
	
}
