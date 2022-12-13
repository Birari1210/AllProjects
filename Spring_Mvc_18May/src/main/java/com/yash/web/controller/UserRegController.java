package com.yash.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yash.web.model.User;

@Controller
public class UserRegController {

	 @GetMapping("/userreg")
	 public String userReg(Model objm)
	 {
		 User objUser = new User();
		 objm.addAttribute("obju", objUser);
		 return "user_signup";
	 }
	 @PostMapping("/user_reg_submit")
	 public String user_signup_submit(@Valid @ModelAttribute("obju") User objuser, BindingResult bsr)
	 {
		 if(bsr.hasErrors())
		 return "user_signup";
		 else
		  return "user_success";
	 }
	 
}
