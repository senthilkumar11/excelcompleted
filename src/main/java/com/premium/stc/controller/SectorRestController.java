package com.premium.stc.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.StockPrice;
import com.premium.stc.service.SectorService;
@RestController
public class SectorRestController {
	@Autowired
	SectorService sectorService;		
	@GetMapping("/sectorprice/{sectorname}")
	List<StockPrice> getSectorPrice(@PathVariable("sectorname") String sector) throws ClassNotFoundException, SQLException
	{
		return sectorService.getSectorPrice(sector);
		
	}
}
