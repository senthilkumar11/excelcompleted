package com.premium.stc.service;

import java.util.List;

import com.premium.stc.model.StockPrice;

public interface StockPriceService {
	public List<StockPrice> getStockPriceByCompany(String companyName)throws Exception;
}
