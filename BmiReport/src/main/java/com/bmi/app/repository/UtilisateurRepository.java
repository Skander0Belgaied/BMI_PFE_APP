package com.bmi.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bmi.app.model.bmi_app.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	Utilisateur findByUtilisateurEmail(String utilisateurEmail);

	@Query(value = "SELECT * FROM utilisateur WHERE utilisateur_email LIKE CONCAT('%',?1,'%') OR utilisateur_nom LIKE CONCAT('%',?1,'%') OR utilisateur_prenom LIKE CONCAT('%',?1,'%')"
			, nativeQuery = true)
	List<Utilisateur> findLikeMailOrFirstNameOrLastName(String utilisateurEmail);
}
