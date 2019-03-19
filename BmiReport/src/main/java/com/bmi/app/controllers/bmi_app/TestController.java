package com.bmi.app.controllers.bmi_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	List<Utilisateur> test() {
		return u.findLikeMailOrFirstNameOrLastName("s");
	}
}
