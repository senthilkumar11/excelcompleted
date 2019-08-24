package com.premium.stc.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.premium.stc.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{
	List<Company> findBySectorId( int sectorId);
	
	Company findByCompanyName(String companyName);
	
	@Query("SELECT c.companyName FROM Company c WHERE c.companyName LIKE %:name% ")
	List<String> getPattern(@Param("name") String name);

}
