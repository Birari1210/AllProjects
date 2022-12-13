package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BaseLocation {
	
	@Id
	int baseLocationId;
	String baseLocationName;
	
	@OneToMany(mappedBy="baselocation",cascade = CascadeType.ALL)
	private List <Employee> employee;
	
	
	
//	public BaseLocation(int baseLocationId, String baseLocationName, List<Employee> employee) {
//		super();
//		this.baseLocationId = baseLocationId;
//		this.baseLocationName = baseLocationName;
//		this.employee = employee;
//	}
//	
	public BaseLocation() {
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	public int getBaseLocationId() {
		return baseLocationId;
	}
	public void setBaseLocationId(int baseLocationId) {
		this.baseLocationId = baseLocationId;
	}
	public String getBaseLocationName() {
		return baseLocationName;
	}
	public void setBaseLocationName(String baseLocationName) {
		this.baseLocationName = baseLocationName;
	}
	
	
	@Override
	public String toString() {
		return "BaseLocation [baseLocationId=" + baseLocationId + ", baseLocationName=" + baseLocationName
				+ ", employee=" + employee + "]";
	}
	
	

}
