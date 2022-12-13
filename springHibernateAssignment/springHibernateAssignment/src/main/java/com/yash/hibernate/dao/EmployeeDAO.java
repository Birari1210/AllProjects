package com.yash.hibernate.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.yash.hibernate.model.BaseLocation;
import com.yash.hibernate.model.Department;
import com.yash.hibernate.model.Employee;
import com.yash.hibernate.model.Irm;
import com.yash.hibernate.model.Project;

public class EmployeeDAO {
	

		
		private org.springframework.orm.hibernate5.HibernateTransactionManager hbmObj;

		public void setHbmObj(org.springframework.orm.hibernate5.HibernateTransactionManager hbmObj) {
			this.hbmObj=hbmObj;
		}
		
		
		
		
		public void save(Employee e,Irm i,Department d,Project p,BaseLocation bl) {
			
			SessionFactory sf = hbmObj.getSessionFactory();
			Session objSession = sf.openSession();
			Transaction t = objSession.beginTransaction();
			objSession.save(e);
//			objSession.save(e2);
//			objSession.save(e3);
			objSession.save(i);
			objSession.save(d);
			objSession.save(p);
			objSession.save(bl);
			t.commit();
			System.out.println("Data is Saved..");
			objSession.close();
	}
		
		public List<Irm> getdAllIrm() {
			System.out.println("====Print only IRM details.====");
			SessionFactory sf = hbmObj.getSessionFactory();
			Session objSession = sf.openSession();
			Transaction t = objSession.beginTransaction();
			List<Irm> ilist = new ArrayList<Irm>();
			Criteria ctr = objSession.createCriteria(Irm.class);
			ilist = ctr.list();
			return ilist;
		}
		
		public List<Employee> getEmployeeAndIrmName()
		{
			SessionFactory sf = hbmObj.getSessionFactory();
			Session objSession = sf.openSession();
			Transaction t = objSession.beginTransaction();
			List<Employee> clist = new ArrayList<Employee>();
			Criteria ctr = objSession.createCriteria(Employee.class);
			clist = ctr.list();
			return clist;
			
			
		}
		
		public List<Project> getProjrctDetailWithEmployee(){

			SessionFactory sf = hbmObj.getSessionFactory();
			Session objSession = sf.openSession();
			Transaction t = objSession.beginTransaction();
			List<Project> plist = new ArrayList<Project>();
			Criteria ctr = objSession.createCriteria(Project.class);
			plist = ctr.list();
			return plist;
			
		}
		
//		public List<Employee> saveEmployee(){
//			SessionFactory sf = hbmObj.getSessionFactory();
//			Session objSession = sf.openSession();
//			Transaction t = objSession.beginTransaction();
//			
//		}
//		
}
