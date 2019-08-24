package com.premium.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.CompanyDao;
import com.premium.stc.dao.StockPriceDao;
import com.premium.stc.model.Company;
import com.premium.stc.model.StockPrice;
@Service
public class StockPriceServiceImpl implements StockPriceService{
	@Autowired
	StockPriceDao stockPriceDao;
	@Autowired
	CompanyDao companyDao;
	
	public List<StockPrice> getStockPriceByCompany(String companyName) throws Exception {
		Company company=companyDao.findByCompanyName(companyName);
		return stockPriceDao.findByCompanyCode(company.getId());
	}
	
}
