package com.bmi.app.controllers.bmi_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/logout-success")
	String logout() {
		return "login";
	}

	@RequestMapping("/login")
	String login() {
		return "login";
	}

}
