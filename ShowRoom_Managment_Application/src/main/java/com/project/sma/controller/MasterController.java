package com.project.sma.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.sma.model.Bill;
import com.project.sma.model.Employee;
import com.project.sma.model.Offers;
import com.project.sma.model.Stock;
import com.project.sma.model.User;
import com.project.sma.service.BillService;
import com.project.sma.service.EmployeeService;
import com.project.sma.service.OfferService;
import com.project.sma.service.StockService;
import com.project.sma.service.UserService;

@Controller
public class MasterController {

	@Autowired
	StockService objservice;

	@Autowired
	BillService objBill;

	@Autowired
	UserService objUservice;

	@Autowired
	OfferService objOffer;

	@Autowired
	EmployeeService eservice;
	@Autowired
	JdbcTemplate objjdbc;

	int update_id;

	// ------------------Mapping ----------------------------

	@RequestMapping("/")
	public String home() {
		return "index1";       // home add one another page and try with security..? done
	}

	//-------------------------------------Security-------------------------------- // not done problem in index page
//		@RequestMapping("/")
//		public String home1()
//		{		
//			return "home1"; //home1 trail
//		}	
//		
//		
//		@RequestMapping("/homes")
//		public String m2()
//		{
//			return "home";
//		}
//		
//		@RequestMapping("/index")  //admin
//		public String m3()
//		{
//			return "index1";
//		}

// ------------------------------Employee Controller-----------------------------------------------

	@RequestMapping("/employee")
	public String employee(Employee employee) {
		return "addEmployee";
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.GET)
	public String addEmployee(@ModelAttribute Employee objemployee) {
		eservice.addEmployee(objemployee);
		return "redirect:/showEmployee";
	}

// ------------------- Display list of emp------------------------------------------------------

	@RequestMapping("/showEmployee")
	public ModelAndView showEmployee() {
		ModelAndView objview = new ModelAndView();
		objview.setViewName("employeelist");
		objview.addObject("elist", eservice.allEmployee());
		return objview;
	}

//------------------------------User Controller---------------- 
	@RequestMapping("/addUser")
	public String newUser() {
		return "addUser";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.GET) // mapping error solved 
	public String adduser(@ModelAttribute User objuser) {

		// System.out.println("im in save user");  //done
		objUservice.saveUser(objuser);
		return "redirect:/showUser";
	}

	@RequestMapping("/showUser")
	public ModelAndView viewAllUser() {
		ModelAndView objmv = new ModelAndView();
		objmv.setViewName("userlist");
		objmv.addObject("ulist", objUservice.showAllUser());
		return objmv;
	}

// changes-------------------------------------------
	@RequestMapping("/enterStock")
	public String enterStockDetails(Stock stock) {
		return "addStock";
	}

	@RequestMapping("/viewAllItem")
	public ModelAndView viewAllItems() {
		ModelAndView objmv = new ModelAndView();
		objmv.setViewName("itemlist");
		objmv.addObject("ilist", objservice.getAllitems());
		return objmv;
	}

	// ------------------------------------------------------
	@RequestMapping(value = "/saveItem", method = RequestMethod.GET)
	public String saveItemdetails(Stock objstock) 
	{
		objstock.setTotalPrice(objstock.getPrice() * objstock.getQuantity());   // totalprice in stock tables and
																				// getQuantity of your product
		objstock.setTotalSalePrice(objstock.getSalePrice() * objstock.getQuantity());

			objservice.saveStock(objstock);
			return "redirect:/viewAllItem";
		
	}

//ok -------------------------------
	
	int before_quantity;
	
	@GetMapping("/updateItem/{id}")
	public String updateItem(@PathVariable(value = "id") int id, Model m) {
		Stock objStock = objservice.getItemById(id);
		before_quantity = objStock.getQuantity();       // store one by one id variable for update and store in before
													                                                        // quantity....
		m.addAttribute("stock", objStock);
		return "updateItem";
	}

// update	Stocks  #task add validation  not done*****
	
	@PostMapping("/updateStock")
	public String addItem(@ModelAttribute("stock") Stock objStock)
	{
		int quan = objStock.getQuantity();
		int totalquan = quan + before_quantity;

		objStock.setQuantity(totalquan);
		objStock.setTotalSalePrice(objStock.getQuantity() * objStock.getSalePrice()); //
		
		objStock.setTotalPrice(objStock.getQuantity() * objStock.getPrice());

		objservice.saveStock(objStock);
		return "redirect:/viewAllItem";  //and update item... by id
	}

	
	
	@RequestMapping("/showStock")
	public String showStock() {
		return "showStock";
	}
	
	@RequestMapping("/purchase")
	public ModelAndView puchaseStock(Model m)
	{
		String sql="select SUM(total_price) from stock";		
		  long total=objjdbc.queryForObject(sql, Integer.class);   //jdbc template class
		  m.addAttribute("totalprice", total);
		
		  ModelAndView objmv = new ModelAndView();
		objmv.setViewName("purchaseTotal");
		objmv.addObject("ilist",objservice.getAllitems());
		
		return objmv;		
	}	
	
	@RequestMapping("/sale_price")	
	public ModelAndView salesStock(Model m)
	{
		String sql="select SUM(total_sale_price) from stock";	
		
		long total=objjdbc.queryForObject(sql, Integer.class);
		m.addAttribute("totalprice", total);
//------------------------show all-------------------------------------------------------------------------
		ModelAndView objmv = new ModelAndView();
		objmv.setViewName("saleprice");
		objmv.addObject("ilist",objservice.getAllitems());		
		return objmv;
	}
	

// -------------------- bills controller totals --------------------------------

	@RequestMapping("/showallbills")
	public ModelAndView showAllBills()
	{
		ModelAndView objmv = new ModelAndView();
		
		objmv.setViewName("allBills");       //all bills.html are returning to show bills
		objmv.addObject("allbill", objBill.getAllBills());
		return objmv;

	}

	@GetMapping("/viewBill/{id}")
	public String viewAllBills(@PathVariable(value = "id") int id, Model m) {

		m.addAttribute("bills", objBill.showbillbyId(id));
		return "showbiilbyId";
	}

	// ---------------------------sale item--------------------------------
	@GetMapping("/saleItem/{id}")
	public String saleItem(@PathVariable(value = "id") int id, Model m) 
	{
		update_id = id;// used for update
		Stock objStock = objservice.getItemById(id);
		m.addAttribute("stock", objStock);
		return "Bill";
	}
	
	@GetMapping("/updateBill/{id}")
	public String updateBill(@PathVariable(value = "id") int id, Model m) {
		Bill obj1 = objBill.getBillDetails(id);
		m.addAttribute("mybill", obj1);
	//	System.out.println("in update billl ........."+id);
		return "update_bill";
		
	}
	
	
	@PostMapping("/updatBill")
	public String updateBillDetails(@ModelAttribute("mybill") Bill obj1)
	{
		objBill.generateBill(obj1);
		 return "redirect:/showallbills";
	}	
	
//-------------------------------------Offers controller----------------------------------------------------

	@RequestMapping("/enterOffer")
	public String enterOfferDetails(Offers offers)
	{
		return "addOffers";
	}
	
	  @RequestMapping(value="/saveOffer" ,method=RequestMethod.GET) 
	public String saveOffertails(@ModelAttribute  Offers offers )
	{				
			objOffer.saveOffer(offers);
			return "redirect:/viewAllOffers";
	
	}
	@RequestMapping("/viewAllOffers")
	public ModelAndView viewOffers()
	{
		  ModelAndView objmv = new ModelAndView();
		   objmv.setViewName("alloffers");
		objmv.addObject("alloffer", objOffer.getAllOffers());
		return objmv;
	}
	
	
	@GetMapping("/deleteoffer/{id}")
	public String deleteOffer(@PathVariable(value="id") int id )
	
	{
		    objOffer.deleteOfferById(id);
		   return "redirect:/viewAllOffers";
	}
	
	
	@GetMapping("/updateoffer/{id}")
	public String updateoffer(@PathVariable(value="id") int id,Model m)
	{
		Offers obj1=objOffer.getofferById(id);	
		m.addAttribute("offer", obj1);
		return "update_Offer";
	}
	
	
	@PostMapping("/updatOffer") //action
	public String updateOfferDetails(@ModelAttribute("offer") Offers obj1)
	{
		objOffer.saveOffer(obj1);
		return "redirect:/viewAllOffers";
	}
	
//---------------------------------------------Trail-----------------------------
	@RequestMapping("/viewAllOffersUser")
	public ModelAndView viewOffersUser()
	{
		ModelAndView objmv = new ModelAndView();
		objmv.setViewName("home");
		objmv.addObject("all", objOffer.getAllOffers());
		return objmv;
		
	}
	
	
// -------------------------Bill Controller -------------------------------------ok
	// work done
	@PostMapping("/generateBill")
	public String generateBill(@ModelAttribute Bill objbill, Model m) {
		
		Stock obj1 = objservice.getItemById(update_id);
		obj1.setQuantity(obj1.getQuantity() - objbill.getQuantity()); // updating quantity
		
		obj1.setTotalPrice(obj1.getPrice() * obj1.getQuantity());
		
		obj1.setTotalSalePrice(obj1.getSalePrice() * obj1.getQuantity());
		objservice.saveStock(obj1);

		// System.out.println("********************My Quantity is updated and try to add in my db ************* ");
		objbill.setBillDate(LocalDate.now());
		objbill.setTotalValue(objbill.getFinalPrice() * objbill.getQuantity());
		objBill.generateBill(objbill);

		
		int billId = objbill.getBilNo();
		Bill obj2 = objBill.getBillByNo(billId);   // all table bill data show in html format
		m.addAttribute("bill", obj2);
		return "showBill";    
		                                  
	}

}