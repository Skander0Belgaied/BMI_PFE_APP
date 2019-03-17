package com.bmi.app.controllers.bmi_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bmi.app.model.bmi_app.Utilisateur;
import com.bmi.app.repository.UtilisateurRepository;

@Controller
public class TestController {

	@Autowired
	UtilisateurRepository u;
	@RequestMapping("/t")
	@ResponseBody
	String test() throws UsernameNotFoundException {
		Utilisateur utilisateur=u.findByUtilisateurEmail("skander@a");
		return utilisateur.getUtilisateurPassword();

	}
	
}
