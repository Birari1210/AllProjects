package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Irm {

	@Id
	int irmid;
	String irmname;
	
	@OneToMany(mappedBy="project",cascade = CascadeType.ALL)
	private List <Employee> employee;

	
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
	
	
}
