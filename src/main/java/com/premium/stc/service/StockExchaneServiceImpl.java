package com.premium.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.StockExchangeDao;
import com.premium.stc.model.StockExchange;

@Service
public class StockExchaneServiceImpl implements StockExchangeService {
	@Autowired
	StockExchangeDao  stockExchangeDao;
	@Override
	public List<StockExchange> getStockList() {
				return stockExchangeDao.findAll();
	}

}
