package com.yash.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
	@Controller
	public class FirstController {
		@RequestMapping("/")
		public String m1() {

			return "index"; // it returns name of page that should be loaded
		}
		
		@RequestMapping("/test")
		public String m2()
		{
			return "test";		
		}

	}
}
