package com.bmi.app.controllers.bmi_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmi.app.repository.UtilisateurRepository;

@Controller
public class HomeController {
	@Autowired
	UtilisateurRepository U_R;
	
	@RequestMapping("/")
	String home() {
		return "index";
	}

	@RequestMapping(path = "/Add/Account", method = RequestMethod.GET)
	@ResponseBody
	String addAccount() {
		return "work succssuffly";
	}

	@RequestMapping("/sujet")
	String sujet() {
		return "sujet";
	}
	
	@RequestMapping("/cfguser")
	String cfguser() {
		return "cfguser";
	}
	
}
