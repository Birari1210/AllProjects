package com.yash.project.gym.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Acessory {
	
	@Id
	int aid;
	String aname;
	String dofAdd;
	
	public int getAid() {
		return aid;
	}
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getDofAdd() {
		return dofAdd;
	}
	public void setDofAdd(String dofAdd) {
		this.dofAdd = dofAdd;
	}
}
