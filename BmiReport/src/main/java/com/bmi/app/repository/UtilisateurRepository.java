package com.bmi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmi.app.model.bmi_app.Utilisateur;
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	Utilisateur findByUtilisateurEmail(String email);
}
