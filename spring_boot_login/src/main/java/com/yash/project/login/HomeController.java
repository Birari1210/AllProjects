package com.yash.project.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

		@GetMapping("/")
		public String m1()
		{
			return "index";
		}
		@GetMapping("/user")
		public String m2()
		{
			System.out.println("userpage");
			return "user";
		}
		@GetMapping("/admin")
		public String m3()
		{
			return "admin";
		}

}
