package com.premium.stc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.StockExchange;


public interface StockExchangeDao extends JpaRepository<StockExchange, Integer>{

}
