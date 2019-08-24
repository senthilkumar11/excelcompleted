package com.premium.stc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.premium.stc.dao.*;
import com.premium.stc.model.Company;
import com.premium.stc.model.Sector;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;
	@Autowired
	private SectorDao sectorDao;
	public Company insertCompany(Company company) throws Exception {
		return companyDao.save(company);
		
	}


	public Company updateCompany(Company company) throws Exception {
		return companyDao.save(company);
	
	}

	public List<Company> getCompanyList() throws Exception {
	
		return companyDao.findAll();
	}


	@Override
	public List<Company> getCompanyListSector(String sectorName) throws Exception {
		
		Sector sector=sectorDao.findByName(sectorName);
		return companyDao.findBySectorId(sector.getId());
	}


	@Override
	public List<String> getPattern(String pattern) throws Exception {
	
		return companyDao.getPattern(pattern);
	}

}
