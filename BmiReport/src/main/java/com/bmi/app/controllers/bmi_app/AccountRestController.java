package com.bmi.app.controllers.bmi_app;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmi.app.model.bmi_app.Utilisateur;
import com.bmi.app.repository.UtilisateurRepository;
import com.bmi.app.services.UtilisateurServiceImpl;

@Controller
public class AccountRestController {
	@Autowired
	UtilisateurRepository utilisateurRepository;
	@Autowired
	UtilisateurServiceImpl utilisateurServiceImpl;
	
	@RequestMapping(path = "/cfg-account/add", method = RequestMethod.GET)
	Utilisateur addAccount(Utilisateur utilisateur) {
		return utilisateurRepository.findByUtilisateurEmail("skander@a");
	}
	
	@GetMapping("/cfg-account/delete/{id}")
	String deleteAccount(@PathVariable(name="id"/*, required=true*/) long utilisateur)
	{ String s="trouvé";
		if(utilisateurServiceImpl.deleteUtilisateur(utilisateur)==false) {
			s="not found";
		}
		
		return s;
	}
	@RequestMapping(path= {"/cfg-account/accounts/{email}","/cfg-account/accounts/"},method=RequestMethod.GET,produces={"application/json"})
	@ResponseBody
	List<Utilisateur> getAccounts(@PathVariable(name="email",required=false) Optional<String> email )
	{
		String newEmail = "ALL";  
		if(email.isPresent()) {
			newEmail = email.get();
		}
		
		return utilisateurServiceImpl.getUtilisateurByMail(newEmail);
	}
	
}
