package com.premium.stc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.Sector;

public interface SectorDao extends JpaRepository<Sector, Integer>{
	Sector findByName(String sector);

}
