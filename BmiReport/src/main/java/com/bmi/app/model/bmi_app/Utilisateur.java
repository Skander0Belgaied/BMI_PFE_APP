package com.bmi.app.model.bmi_app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue
	private Long utilisateurId;
	private String utilisateurNom;
	private String utilisateurPrenom;
	private String utilisateurPassword;
	private String utilisateurEmail;
	private Boolean utilisateurType;

	public Long getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(Long utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	public String getUtilisateurNom() {
		return utilisateurNom;
	}

	public void setUtilisateurNom(String utilisateurNom) {
		this.utilisateurNom = utilisateurNom;
	}

	public String getUtilisateurPrenom() {
		return utilisateurPrenom;
	}

	public void setUtilisateurPrenom(String utilisateurPrenom) {
		this.utilisateurPrenom = utilisateurPrenom;
	}

	public String getUtilisateurPassword() {
		return utilisateurPassword;
	}

	public void setUtilisateurPassword(String utilisateurPassword) {
		this.utilisateurPassword = utilisateurPassword;
	}

	public String getUtilisateurEmail() {
		return utilisateurEmail;
	}

	public void setUtilisateurEmail(String utilisateurEmail) {
		this.utilisateurEmail = utilisateurEmail;
	}

	public Boolean getUtilisateurType() {
		return utilisateurType;
	}

	public void setUtilisateurType(Boolean utilisateurType) {
		this.utilisateurType = utilisateurType;
	}

}
