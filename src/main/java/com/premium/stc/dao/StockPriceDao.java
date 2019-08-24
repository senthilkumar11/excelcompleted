package com.premium.stc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer> {
	
	List<StockPrice> findByCompanyCode(int companyCode);

   
}
