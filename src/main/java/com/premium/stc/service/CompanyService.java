package com.premium.stc.service;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.model.Company;

public interface CompanyService {
	public Company insertCompany(Company company) throws Exception;

	public Company updateCompany(Company company) throws Exception;

	public List<Company> getCompanyList() throws Exception;

	public List<Company> getCompanyListSector(String sectorName)throws Exception;
	
	public List<String> getPattern(String pattern)throws Exception;
	
}
