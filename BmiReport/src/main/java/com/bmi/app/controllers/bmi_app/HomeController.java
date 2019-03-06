package com.bmi.app.controllers.bmi_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmi.app.model.bmi_app.Utilisateur;
import com.bmi.app.repository.UtilisateurRepository;

@Controller
public class HomeController {
	@Autowired
	UtilisateurRepository U_R;
	
	@RequestMapping("/login")
	String login() {
		return "login";
	}
	
	@RequestMapping("/check")
	String cheking() {
		return "redirect:/";
	}

	@RequestMapping("/")
	String home() {
		return "index";
	}

	@RequestMapping("/sujet")
	String sujet() {
		return "sujet";
	}

	@RequestMapping(path = "/Add/Account", method = RequestMethod.GET)
	@ResponseBody
	String addAccount() {
		return "work succssuffly";
	}

	@RequestMapping("/test")
	@ResponseBody
	List<Utilisateur> test() {
		return U_R.findAll();
	}

}
