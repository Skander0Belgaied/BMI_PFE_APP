package com.bmi.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bmi.app.model.bmi_app.Filter;
public interface FilterRepository extends JpaRepository<Filter, Long> {

}
