package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Company;
import com.premium.stc.model.StockPrice;
import com.premium.stc.service.CompanyService;
import com.premium.stc.service.StockPriceService;

@RestController
public class CompanyRestController {

	@Autowired
	CompanyService companyService;
	@Autowired
	StockPriceService stockPriceService;
	@GetMapping("/companieslist/{sectorName}")
	public List<Company> getCompaniesList(@PathVariable String sectorName) throws Exception
	{
		
		return companyService.getCompanyListSector(sectorName);
		
	}
	@GetMapping("/matchingcompanies/{pattern}")
	public List<String> companyPatternMatching(@PathVariable("pattern") String pattern) throws Exception
	{
		
			return companyService.getPattern(pattern);
		
	}
	@GetMapping("/companystockprice/{companyname}")
	public List<StockPrice> getCompanyStockPice(@PathVariable("companyname") String companyName  ) throws Exception
	{
		return stockPriceService.getStockPriceByCompany(companyName);
	}
	
	
}
