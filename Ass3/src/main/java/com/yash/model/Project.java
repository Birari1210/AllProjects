package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {
	
	// Projectid, projectname, project_manager_id(empid). 
	
	    @Id
		int projectid;
		String projectName;
		int empid;
		int pmid;
		
		
		@OneToMany(mappedBy="irm",cascade = CascadeType.ALL)
		private List <Employee> employee;


		public Project() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public List<Employee> getEmployee() {
			return employee;
		}
		public void setEmployee(List<Employee> employee) {
			this.employee = employee;
		}
		
		
		public int getProjectid() {
			return projectid;
		}
		public void setProjectid(int projectid) {
			this.projectid = projectid;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public int getPmid() {
			return pmid;
		}
		public void setPmid(int pmid) {
			this.pmid = pmid;
		}

		
		
	
}
