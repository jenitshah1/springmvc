package com.springmvcdemo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvcdemo.model.Employee;

@Controller
public class AppController {
	@Autowired
	Employee employee1;
	/**
	 * rest API to get current date and time
	 */
	@GetMapping("/gettime")
	public String getTime(Model model) {

		model.addAttribute("current_time", new Date());
		model.addAttribute("emp", employee1);
		
		return "welcome";
	}
}
