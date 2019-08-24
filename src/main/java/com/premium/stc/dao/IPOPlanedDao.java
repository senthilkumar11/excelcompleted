package com.premium.stc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.IPOPlaned;

public interface IPOPlanedDao extends JpaRepository<IPOPlaned, Integer>{
	IPOPlaned findByCompanyName(String companyName);
}
