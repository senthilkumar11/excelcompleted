package com.premium.stc.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.premium.stc.model.Company;
import com.premium.stc.model.IPOPlaned;
import com.premium.stc.service.IPOservice;

@Controller
public class IPORestController {
	@Autowired
	IPOservice ipoService;
	@GetMapping("/ipodetails/{companyname}")
	public IPOPlaned getIPODetailsByCompany(@PathVariable("companyname") String companyName) throws Exception
	{
		
		return ipoService.getIPOBycompanyName(companyName);
		
	}
	@RequestMapping(path="/insertipo",method = RequestMethod.GET )
	public String insertCompany(Model model)
	{
		
		IPOPlaned ipoPlaned=new IPOPlaned();
		model.addAttribute("ipo",ipoPlaned);
		return "IPO";
		
	}
	@RequestMapping(value="/insertipo",method = RequestMethod.POST)
	public String setIPOPlaned( IPOPlaned ipoPlaned ) throws Exception
	{
		 ipoService.insertIPO(ipoPlaned);
		 return "success";
	}
}
