package com.premium.stc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.IPOPlanedDao;
import com.premium.stc.model.IPOPlaned;
@Service
public class IPOServiceImpl implements IPOservice {
	@Autowired
	IPOPlanedDao ipoPlanedDao;
	public IPOPlaned getIPOBycompanyName(String companyName) {
		
		return ipoPlanedDao.findByCompanyName(companyName);
	}
	public void insertIPO(IPOPlaned ipoPlaned) throws Exception {
		ipoPlanedDao.save(ipoPlaned);
		
	}

}
