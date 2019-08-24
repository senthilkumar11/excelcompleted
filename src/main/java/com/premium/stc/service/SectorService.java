package com.premium.stc.service;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.model.Sector;
import com.premium.stc.model.StockPrice;

public interface SectorService {
	public Sector insert (Sector sector)throws ClassNotFoundException, SQLException;
	public List<Sector> getAllSector()throws ClassNotFoundException, SQLException;

	public List<StockPrice> getSectorPrice(String Sector)throws ClassNotFoundException, SQLException;
}
