package com.premium.stc.service;

import com.premium.stc.model.IPOPlaned;

public interface IPOservice {
	public IPOPlaned getIPOBycompanyName(String companyName);
	public void insertIPO(IPOPlaned ipoPlaned)throws Exception;
	
}
