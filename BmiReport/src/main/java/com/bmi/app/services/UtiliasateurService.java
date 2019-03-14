package com.bmi.app.services;

import com.bmi.app.model.bmi_app.Utilisateur;

import java.util.List;
import java.util.Optional;


public interface UtiliasateurService {
Utilisateur createUtilisateur(Utilisateur utilisateur);
Optional<Utilisateur>  getUtilisateur(long id);
Utilisateur editUtilisateur(Utilisateur utilisateur);
void deleteUtilisateur(Utilisateur utilisateur);
void deleteUtilisateur(long utilisateurId);
List<Utilisateur> getAllUtilisateur(int pageNumber ,int pageSize);
List<Utilisateur> getAllUtilisateur();


}
