package com.bmi.app.controllers.bmi_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/t")
	String test() {
		return "update";
	}
}
