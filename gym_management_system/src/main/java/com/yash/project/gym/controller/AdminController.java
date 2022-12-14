package com.yash.project.gym.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yash.project.gym.model.Acessory;
import com.yash.project.gym.model.Admin;
import com.yash.project.gym.model.Attendance;
import com.yash.project.gym.model.Coursess;
import com.yash.project.gym.model.DietPlan;
import com.yash.project.gym.model.Payment;
import com.yash.project.gym.model.Trainer;
import com.yash.project.gym.model.User;
import com.yash.project.gym.model.UserName;
import com.yash.project.gym.service.AcessoryService;
import com.yash.project.gym.service.AdminService;
import com.yash.project.gym.service.AttendanceSevice;
import com.yash.project.gym.service.CoursessService;
import com.yash.project.gym.service.DietService;
import com.yash.project.gym.service.PaymentService;
import com.yash.project.gym.service.TrainerService;
import com.yash.project.gym.service.UserService;

@Controller
public class AdminController {

	@Autowired
	AdminService ASobj;

	@Autowired
	UserService userServiceObj;

	@Autowired
	TrainerService trainerserviceObj;
	
	@Autowired
	CoursessService coServiceObj;
	
	@Autowired
	AcessoryService aServiceObj;

	@Autowired
	DietService dietServiceObj;
	
	@Autowired
	PaymentService payServiceObj;
	
	@Autowired
	JdbcTemplate objJdbc;
	
	@Autowired
	AttendanceSevice attendServiceOjb;
	
	
	/* Home Page admin controller */

	@RequestMapping("/")
	public String Home() {
		return "homepage"; // index.html
	}

	@RequestMapping("/adminRegister")
	public String adminRegister()
	{
		return "adminregister";
	}

	@RequestMapping("/saveadmin")
	public String saveAdmin(@ModelAttribute Admin objAdmin)
	{
		ASobj.saveAdminData(objAdmin);
		return "homepage";

	}

	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminlogin";
	}

//login after call viewall

	@RequestMapping("/viewall")
	public String viewForAdmin() {
		return "viewAlldata";
	}
	
// ************Accesory Controller****************
	
	@GetMapping("/viewAcessory")
	public ModelAndView geAllAcessoryList() 
	{
		// System.out.println("Accessoryhhhh");
		ModelAndView MVobj = new ModelAndView();
		MVobj.setViewName("accesory"); // html page
		MVobj.addObject("Display", aServiceObj.getAllAcessoryList());
		return MVobj;
	}
	
//	@RequestMapping("/addAcessoryForm")
//	public String myadd()
//	{
//		return "demo";
//	}

	@RequestMapping("/addAcessoryForm")
	public String showAddAcessoryForm(Model mobject)
	{
		Acessory AcessoryObj = new Acessory();
		mobject.addAttribute("ace", AcessoryObj); // Ace is Thymleaf temp. object acess empty data
		return "add_Accesory";
	}

	@RequestMapping("/addAccessory")
	public String addAccessory(@ModelAttribute Acessory AcesoryObj)
	{
		aServiceObj.AddAccessory(AcesoryObj);
		return "redirect:/viewAcessory";
	}

	/******** Edit Form Hot nahi ahe ***************/

	@GetMapping("/EditForm/{id}")
	public String showEditform(@PathVariable(value = "id") int id, Model mObject)
	{
		Acessory AcessoryObj = aServiceObj.getAcessoryById(id);
		mObject.addAttribute("ace", AcessoryObj);
		return "edit_Accesory";
	}
	
// delete Accessory
	
	@GetMapping("/removeAccessory/{id}")
	public String removeAccessory(@PathVariable(value = "id") int id) 
	{
		
		this.aServiceObj.removeAccessoryById(id);

		return "redirect:/viewall";
	}

	/************* user controller *******************/

	@RequestMapping("/userRegister")
	public String userRegister() {
		// System.out.println("user register");
		return "userregisters";
	}

	@RequestMapping("/Saveuser")
	public String SaveUser(@ModelAttribute User objUser) {
		userServiceObj.addUser(objUser);
		return "homepage";
	}

	@RequestMapping("/userLogin")
	public String UserLogin() {
		return "userlogin";
	}

	@RequestMapping("/courses")
	public String dataviewforuser() {
		return "userSee";
	}
	
	/*** Print all user Data for Admin ************/

	@GetMapping("/ShowAllUsers")
	public ModelAndView getAllUserList() {
		ModelAndView obj = new ModelAndView();
		obj.setViewName("userlist"); // html page
		obj.addObject("Show", userServiceObj.getAllUsersList());
		return obj;
	}

	/******** Trainer Controller ************/

	@RequestMapping("/TrainerRegister")
	public String trainerRegister() {
		// System.out.println("user register");
		return "trainerregister"; // html file
	}

	@RequestMapping("/SaveTrainer")
	public String SaveTrainer(@ModelAttribute Trainer trainerObj) {
		trainerserviceObj.addTrainer(trainerObj);
		return "homepage";
	}

	@RequestMapping("/TrainerLogin")
	public String trainerLogin() {
		return "trainerlogin";
	}

	@RequestMapping("/userData") // form Action name in trainer Login
	public String alldataViewforTrainer() {
		return "Trainersee";
	}

	/*** Print all Trainer Data for Admin *******************/

	@RequestMapping("/ShowAllTrainers")
	public ModelAndView getAllTrainerList() {
		//System.out.println("success******************");
		ModelAndView obj = new ModelAndView();
		obj.setViewName("trainerdetailslist"); // html page
		obj.addObject("ViewTrainer", trainerserviceObj.getAllTrainerData());
		return obj;
	}

	/*** Print all user Data for Trainer************/
	
	@RequestMapping("/ShowUser")  
	public String UserDataForTrainer() {
		return "Trainersee";
	}

	@GetMapping("/ShowAllUser")
	public ModelAndView getUserListforTrainer() {
		ModelAndView obj = new ModelAndView();
		
	      obj.setViewName("userListTrainer");
		obj.addObject("Show", userServiceObj.getAllUsersListforTrainer());
		return obj;
	}	
// ***********update ***********************************

	@GetMapping("/editTrainer/{id}")  // button link
	public String updateTrainer(@PathVariable(value = "id") int id, Model modelObj) 
	{
		Trainer trainerOjb = trainerserviceObj.getTrainerById(id);
		modelObj.addAttribute("trainer", trainerOjb);
		return "update_trainer";
	}

	@RequestMapping("/updatetrainer")
	public String save_Trainer(@ModelAttribute("trainer") Trainer trainerOjb)
	{
		trainerserviceObj.save_Trainer(trainerOjb);
		return "redirect:/ShowAllTrainers";
	}

  /*********************courses Controller*****************/
	
	@RequestMapping("/addCoursess")
	public String showAddCoursessForm(Model modelObj) {
		Coursess coursessObj = new Coursess();
		modelObj.addAttribute("course", coursessObj); // course is Thymleaf temp. object form empty data
		return "add_Coursess";
	}

	@RequestMapping("/saveCoursess")
	public String saveCoursess(@ModelAttribute Coursess coursessObj) {
        coServiceObj.SaveCoursess(coursessObj);
		return "redirect:/CourseDetail"; // redirect hot nahi aahe...?
	}

/**********Admin see and edit all course table data*************/
	
	@RequestMapping("/CourseDetail")  
	public ModelAndView geAllCoursessList() {
		ModelAndView MVobj = new ModelAndView();
		MVobj.setViewName("courseDetailsAdmin"); //userSee
		MVobj.addObject("Display", coServiceObj.getAllCoursessDetails());
		return MVobj;
	}
	
/*****************update & delete  Course table*******************/
	
	@GetMapping("/editCourses/{id}")  // button link
	public String updateCourses(@PathVariable(value = "id") int id, Model modelObj) 
	{
		Coursess coursessObj = coServiceObj.getCoursessById(id);
		modelObj.addAttribute("course", coursessObj);
		return "update_courses";
	}
	
	@RequestMapping("/updateCourses")
	public String saveCourses(@ModelAttribute("course") Coursess coursesObj)
	{
		coServiceObj.saveCoursesUpdate(coursesObj);
		return "redirect:/CourseDetail";
	}

	@GetMapping("/delete/{id}")
	public String deleteCourse(@PathVariable(value = "id") int id) {
		coServiceObj.deleteCourseById(id);
		return "redirect:/CourseDetail";
	}
	
	// User See All data of Coursess....	
		@RequestMapping("/Showcourses")  // user Login form link....
		public String coursesDataForUser() {
			return "userSeeAllData";
		}
		
		@RequestMapping("/CourseDetails")
		public ModelAndView geAllCoursesList() {
			ModelAndView MVobj = new ModelAndView();
			MVobj.setViewName("userSee"); 
			MVobj.addObject("Display", coServiceObj.getAllCoursesDetails());
			return MVobj;
		}
		
/*********** DietPlan Controller******************/
		
		@RequestMapping("/addDiet")
		public String addDietPlan(Model modelObj) {
			DietPlan dietObj = new DietPlan();
			modelObj.addAttribute("diet", dietObj); 
			return "dietAdd";
		}

		@RequestMapping("/saveDietPlan")
		public String save_DietPlan(@ModelAttribute DietPlan DpObjct) {
			dietServiceObj.SaveDiet(DpObjct);
			return "redirect:/showDietPlan"; 
		}
		
		
		@RequestMapping("/showDietPlan")  
		public ModelAndView geAllDietPlan() {
			ModelAndView mvobj = new ModelAndView();
			mvobj.setViewName("showdietTrainer"); 
			mvobj.addObject("show", dietServiceObj.getDietPlanDetails());
			return mvobj;
		}	
		
//Update delete Diet for Trainer 
		@GetMapping("/AddDietChart/{id}")  // button link
		public String updateDietChart(@PathVariable(value = "id") int id, Model modelObj) 
		{
			DietPlan dpObj = dietServiceObj.getAllDietById(id);
			modelObj.addAttribute("diet", dpObj);
			return "updateDiet";
		}
		
		@RequestMapping("/updateDiets")
		public String saveDiteChart(@ModelAttribute("diet") DietPlan dpObj)
		{
			dietServiceObj.saveDietChartUpdate(dpObj);
			return "redirect:/showDietPlan";
		}

		@GetMapping("/deleteDiet/{id}")
		public String deleteDietChart(@PathVariable(value = "id") int id) {
			dietServiceObj.deleteDietChartById(id);
			return "redirect:/showDietPlan";
		}
		
//******** Diet display for User  *******		
		@RequestMapping("/DietChart")
		public ModelAndView geAllDietChart() {
			ModelAndView objmv = new ModelAndView();
			objmv.setViewName("userSeeDiet"); 
			objmv.addObject("view", dietServiceObj.getDietChart());
			return objmv;
		}				
/*************Payment Controller*****************/	
		
		@RequestMapping("/PaymentSave")
		public String addPayments(Model modelObj) {
		
			Payment payObj = new Payment();
			modelObj.addAttribute("pay", payObj);
     		return "savePayment"; //
		}

		@RequestMapping("/savepayment")
		public String savePaymentDetail(@ModelAttribute Payment payObj) {
	        payServiceObj.save_Payment(payObj);
			return "redirect:/courses"; 
		}

/*---------------------	payment details show for admin------------------------*/
		
		@RequestMapping("/showPayment")  
		public ModelAndView getPaymentDetails() {
			ModelAndView MVobj = new ModelAndView();
			MVobj.setViewName("paymentDetailsAdmin"); 
			MVobj.addObject("pay", payServiceObj.getPaymentforAdmin());
			return MVobj;
		}
		
//----------------------------a-------------------------------------------
/*
		@RequestMapping("/payement")
		public String payNow()
		{
			return "payfees";
		}
		@RequestMapping("/fetchusername")
		public ModelAndView savePayement(UserName obj7)
		{
			String name=obj7.getUsername();
			ModelAndView objmv = new  ModelAndView();
			objmv.setViewName("showPayment");
			
			List<User> ulist = userServiceObj.getAllPayments(name);
			objmv.addObject("ulist",ulist);
			return objmv;
	    }
		@RequestMapping("/savepayement")
		public String addpayement(@ModelAttribute Payment objpayment)
		{			
			payServiceObj.addpayement(objpayment);		
			return "homepage"; //show page
			
		}
*/		

/*_______________Attendance Controller______________________*/

		@RequestMapping("/MarkAttendance")
		public String MarkAttendance() {
			return "attendanceMark"; 
		}
		
		@RequestMapping("/saveAttendance")
		public String SaveAttedance(@ModelAttribute Attendance atObj) {
			attendServiceOjb.addAttendance(atObj);
			return "Trainersee";
		}
//Admin view 
		@RequestMapping("/viewAttendance")  
		public ModelAndView attendanceDetails() {
			ModelAndView MVobj = new ModelAndView();
			MVobj.setViewName("showAttendance"); 
			MVobj.addObject("attend", attendServiceOjb.attendanceforAdmin());
			return MVobj;
		}
//update
		@GetMapping("approveAttend/{id}")  // button link
		public String attendanceAprove(@PathVariable(value = "id") int id, Model modelObj) 
		{
			Attendance atdObj = attendServiceOjb.approveAttendance(id);
			modelObj.addAttribute("attends", atdObj);
			return "approveAttendance";
		}
		
		@RequestMapping("/attendSave")
		public String AttendSave(@ModelAttribute("attends") Attendance atdObj)
		{
			attendServiceOjb.saveApproveAttendance(atdObj);
			return "redirect:/viewAttendance";
		}
		
//trainer
/*	
		@RequestMapping("/approveAttendance")  
		public ModelAndView trainnerAttendanceDetails() {
			ModelAndView MVobj = new ModelAndView();
			MVobj.setViewName("showAttendanceTrainer"); 
			MVobj.addObject("attend", attendServiceOjb.attendanceforTrainer());
			return MVobj;
		}
*/		
		
//		@RequestMapping("/fetchusername")
//		public ModelAndView savePayement(UserName obj7)
//		{
//			String name=obj7.getUsername();
//			ModelAndView objmv = new  ModelAndView();
//			objmv.setViewName("showPayment");
//			
//			List<User> ulist = userServiceObj.getAllPayments(name);
//			objmv.addObject("ulist",ulist);
//			return objmv;
//	    }
		
		@RequestMapping("/payement")
		public String payNow()
		{
			return "attendanceFees";
		}
	
		
		@RequestMapping("/fetchusername")
		public ModelAndView saveTrainerAttendance(UserName obj7) // user name obj...?
		{
			int id =obj7.getId();     //.....?
			ModelAndView objmv = new  ModelAndView();
			objmv.setViewName("displayAttendance");
			
			List<Attendance> alist = attendServiceOjb.getAllAttendance(id);//getAllAttendance(int id)
			objmv.addObject("alist",alist);
			return objmv;
	    }
}
