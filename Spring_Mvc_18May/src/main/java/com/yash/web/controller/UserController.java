package com.yash.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	 @RequestMapping("/slogin")
	 public String simple_login()
	 {		 
		 return "simple_form";
	 }
	 
	 @RequestMapping("/slogin_sbt")
	 public String sloignSubmit(HttpServletRequest req,Model mobj)
	 {
		 String name =req.getParameter("name");// name is the textbox name, here it is use to fetch the textbox value
		 String email=req.getParameter("email");// email is the textbox name, here it is use to fetch the textbox value.
		 System.out.println(name);
		 System.out.println(email);
		 mobj.addAttribute("name",name);
		 mobj.addAttribute("e",email);
		 return "slogin_home";
	 }
	 @RequestMapping("/login2")
	 public String login2()
	 {		 
		 return "login2";
	 }
	 @RequestMapping("/login_sbt2")
	 public String login_sbt_reqparam(@RequestParam("name") String name, @RequestParam("pass") String pass,Model m)
	 {
		 System.out.println(name);
		 System.out.println(pass);
		 m.addAttribute("name",name);
		 return "home2";
	 }
	 @GetMapping("login_post")
	 public String loginPost()
	 {
		 return "login_post_form";
	 }
	 //@RequestMapping(method=RequestMethod.POST)
	 @PostMapping("/login_sbt_post")
	 public String login_sbt_post(String name, String pass,Model m)
	 {
		 System.out.println(name);
		 System.out.println(pass);
		 m.addAttribute("name", name);
		 return "posthome";
	 }
}
