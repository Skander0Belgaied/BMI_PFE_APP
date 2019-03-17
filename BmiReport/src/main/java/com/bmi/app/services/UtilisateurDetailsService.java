package com.bmi.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bmi.app.model.bmi_app.Utilisateur;
import com.bmi.app.repository.UtilisateurRepository;
@Service
public class UtilisateurDetailsService implements UserDetailsService{
	@Autowired
 private UtilisateurRepository utilisateurRepository;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Utilisateur utilisateur=utilisateurRepository.findByUtilisateurEmail(email);
		if(utilisateur==null)
			throw new UsernameNotFoundException("utilisateur n'exist pas ");
		return new UtilisateurDetails(utilisateur);
	}

}
