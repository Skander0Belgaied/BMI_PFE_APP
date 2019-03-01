package com.bmi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmi.app.model.bmi_app.Etat;

public interface EtatRepository extends JpaRepository<Etat, Long>{

}
