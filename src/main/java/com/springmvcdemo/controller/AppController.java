package com.springmvcdemo.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	/**
	 * rest API to get current date and time
	 */
	@GetMapping("/gettime")
	public String getTime(Model model) {
		model.addAttribute("current_time", new Date());
		return "welcome";
	}
}
