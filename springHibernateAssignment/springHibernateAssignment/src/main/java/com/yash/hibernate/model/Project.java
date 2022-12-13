package com.yash.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Project {
@Id
@Column(name="pro_id")
	private int projectid;
	private String projectname;
	
	@OneToMany(mappedBy="project",cascade = CascadeType.ALL)
	private  List<Employee> employee;
	
	public Project() {
		
	}

	
	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	

	public List<Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}



	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectname=" + projectname + "]";
	}



	
	
}
