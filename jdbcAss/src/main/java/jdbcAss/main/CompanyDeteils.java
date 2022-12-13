package jdbcAss.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbcAss.Company;
import jdbcAss.Test.CompanyDao;


public class CompanyDeteils {

	public static void main(String[] args) {

		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
		  
		  CompanyDao cDaoobj = (CompanyDao) objAC.getBean("CompanyDaobean");
		   Company compObj = new Company();
		
//		   //compObj.setCompID(2);
//		   compObj.setComName("Cadbury");
//		   compObj.setComProduct("Dairy Milk");
//		   compObj.setProductReleaseon("2010-10-10");
//		   
//		   System.out.println("Item table Row are inseted  ="+cDaoobj.insertCompanyDetails(compObj));
		   
		   
		   
		   compObj.setCompID(5);
		   compObj.setComName("Unicorn");
		   compObj.setComProduct("Honda");
		   compObj.setProductReleaseon("2003-05-20");
		   
		  System.out.println("company update  : "+cDaoobj.updateCompany(compObj));
//			  

//		  System.out.println("record deleted count :- "+cDaoobj.DeleteCompany(1));

	}

}
