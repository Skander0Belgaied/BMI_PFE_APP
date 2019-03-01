package com.bmi.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bmi.app.model.bmi_app.Sujet;
public interface SujetRepository extends JpaRepository<Sujet, String> {

}
