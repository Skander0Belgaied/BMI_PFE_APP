package com.bmi.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.bmi.app.model.bmi_app.Utilisateur;
import com.bmi.app.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtiliasateurService {
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur createUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public Optional<Utilisateur> getUtilisateur(long utilisateurId) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(utilisateurId);
	}

	@Override
	public Utilisateur editUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		utilisateurRepository.delete(utilisateur);
	}

	@Override
	public void deleteUtilisateur(long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);
	}

	@Override
	public List<Utilisateur> getAllUtilisateur(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
	}

	@Override
	public List<Utilisateur> getAllUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}
	
}
