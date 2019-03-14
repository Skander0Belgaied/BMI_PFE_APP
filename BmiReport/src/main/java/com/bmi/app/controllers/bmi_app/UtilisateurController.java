package com.bmi.app.controllers.bmi_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmi.app.model.bmi_app.Utilisateur;
import com.bmi.app.services.UtiliasateurService;
import com.bmi.app.services.UtilisateurServiceImpl;

@Controller
public class UtilisateurController {
	private final UtiliasateurService utilisateurService;
	@Autowired
	
	public UtilisateurController(UtiliasateurService utilisateurService) {
	this.utilisateurService = utilisateurService;
	}
	
	@RequestMapping(value = "/compte", method = RequestMethod.POST)
	public String addPagePerson(@ModelAttribute Utilisateur utilisateur, Model model) {
	utilisateurService.createUtilisateur(utilisateur);
	model.addAttribute("persons", utilisateurService.getAllUtilisateur());
	return "result";
	}
	
}
