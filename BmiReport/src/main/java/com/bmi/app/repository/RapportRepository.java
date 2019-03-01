package com.bmi.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bmi.app.model.bmi_app.Rapport;
public interface RapportRepository extends JpaRepository<Rapport, Long> {

}
