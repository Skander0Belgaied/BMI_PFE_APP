package com.bmi.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	String home () {
	return "index";
	}
	@RequestMapping("/test")
	String show () {
	return "settings";
	}
}
	