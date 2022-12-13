package com.yash.hibernate.dao;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

public class HbmHqlDAO {

	@Autowired
	private HibernateTransactionManager objHTM;
	
	
	public void MaxSalaryWithbaselocation() {
		SessionFactory sf = objHTM.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		//Query q = objSession.createQuery("select max(salary) from Employee");
		//Query q =objSession.createQuery("select base_id ,max(salary) as max_salary from Employee group by base_id");
		System.out.println("====Print maximum salary of each base location====");
		String HQL ="SELECT bloc.blocname,bloc.blocid,MAX(emp.salary) FROM BaseLocation bloc "
				+ "LEFT JOIN  bloc.employee emp GROUP BY bloc";
//		List<Float> maxlist = q.getResultList();
//		System.out.println(maxlist.get(0));
		Query query= objSession.createQuery(HQL, Object[].class);
		//Query<Object[]>query = objSession.createQuery(HQL, Object[].class);
		List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
		for(Object[] objects : list) {
			String blocname=(String)objects[0];
			Integer blocid =(Integer)objects[1];
			Float  maxsalary =(Float)objects[2];
			System.out.println("BaseLoaction:"+blocname);
			System.out.println("Baselocatio id:"+blocid);
			System.out.println("maximum salary by dept:"+maxsalary);
		}
		
		}
	public void MinSalarywithbaselocation() {
		SessionFactory sf = objHTM.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		
		System.out.println("====Print minimum salary of each base location====");
		
		String HQL ="SELECT bloc.blocname,Min(emp.salary) FROM BaseLocation bloc LEFT JOIN  bloc.employee emp GROUP BY bloc";
		
		Query query= objSession.createQuery(HQL, Object[].class);
		List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
		
		for(Object[] objects : list) {
			String blocname=(String)objects[0];
			Float  minsalary =(Float)objects[1];
			System.out.println("BaseLoaction:"+blocname);
			System.out.println("minimum salary by dept:"+minsalary);
		}
		
		//Query q = objSession.createQuery("select min(salary) from Employee");
//		// Query q = objSession.createQuery("select BaseLocation ,min(salary) as min_salary from Employee group by BaseLocation");
//		List<Float> minlist = q.getResultList();
//		System.out.println(minlist.get(0));
		
		}
	
	public void MinSalarywithProject() {
		SessionFactory sf = objHTM.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		
		System.out.println("====Print minimum salary of each Project====");
		
		String HQL ="SELECT pro.projectname,Min(emp.salary) FROM Project pro "
				+ "LEFT JOIN  pro.employee emp GROUP BY pro";
		
		Query query= objSession.createQuery(HQL, Object[].class);
		List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
		
		for(Object[] objects : list) {
			String projectname=(String)objects[0];
			Float  minsalary =(Float)objects[1];
			System.out.println("project_name:"+projectname);
			System.out.println("minimum salary by project:"+minsalary);
		}
	}
	
	public void MaxSalarywithProject() {
		SessionFactory sf = objHTM.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		
		System.out.println("====Print maximum salary of each Project====");
		
		String HQL ="SELECT pro.projectname,Max(emp.salary) FROM Project pro "
				+ "LEFT JOIN  pro.employee emp GROUP BY pro";
		
		Query query= objSession.createQuery(HQL, Object[].class);
		List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
		
		for(Object[] objects : list) {
			String projectname=(String)objects[0];
			Float  maxsalary =(Float)objects[1];
			System.out.println("project_name:"+projectname);
			System.out.println("maximum salary by project:"+maxsalary);
		}
	}
	
//	public void getDeprtmentWithAvg()
//	{
//		SessionFactory sf = objHTM.getSessionFactory();
//		Session objSession = sf.openSession();
//		Transaction t = objSession.beginTransaction();
//		//Query q = objSession.createQuery("select deptid,count(*),avg(salary) from Employee group by deptid");
//		Query q =  objSession.createQuery("select dept.deptid,avg(salary) as average_salary from Employee group by dept_id");
//		List<Float> avglist = q.getResultList();
//		System.out.println(avglist.get(0));
//	}
	public void getDepartmentWithAvgSalary() {
		SessionFactory sf = objHTM.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		
		System.out.println("====Print Average salary of each Department====");
		
		String HQL ="SELECT dept.deptid,dept.deptname,Avg(emp.salary) FROM Department dept "
				+ "LEFT JOIN  dept.employee emp GROUP BY dept";
		
		Query query= objSession.createQuery(HQL, Object[].class);
		List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
		
		for(Object[] objects : list) {
			Integer deptid=(Integer)objects[0];
			String deptname=(String)objects[1];
			Double  avgsalary=(Double)objects[2];
			System.out.println("Department_Id:"+deptid);
			System.out.println("Department_Name:"+deptname);
			System.out.println("Average of  salary by Department:"+avgsalary);
		}
	}
	
          public void getProjectNameWithEmployee() {
        	  System.out.println("====Find out number of employee working on different project. ====");
        	  System.out.println("====Print project name with total number of employee working on it====");
        	SessionFactory sf = objHTM.getSessionFactory();
      		Session objSession = sf.openSession();
      		Transaction t = objSession.beginTransaction();
      		
      		String HQL ="SELECT pro.projectname,Count(empid) FROM Project pro "
    				+ "LEFT JOIN  pro.employee emp GROUP BY pro";
    		
    		Query query= objSession.createQuery(HQL, Object[].class);
    		List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
    		
    		for(Object[] objects : list) {
    			
    			String projectname=(String)objects[0];
    			Long countemp=(Long)objects[1];
    			//System.out.println("Department_Id:"+deptid);
    			System.out.println("Project_Name:"+projectname);
    			System.out.println("Total No Of Emplyee:"+countemp);
    		}
          }
}
