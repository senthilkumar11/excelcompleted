package com.premium.stc.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.premium.stc.model.Company;
import com.premium.stc.service.*;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping(path="/insertcompany",method = RequestMethod.GET )
	public String insertCompany(Model model)
	
	{
		
		Company company=new Company();
		model.addAttribute("company",company);
		return "insertCompanyPage";
		
	}
	@RequestMapping(path="/insert",method = RequestMethod.POST)
	public String insert(@Valid @ModelAttribute("company") Company company ,BindingResult br)
	{
		if(br.hasErrors())
		{
		return 	"insertCompanyPage";
		}
		else
		{
		System.out.println(company);
		try {
			companyService.insertCompany(company);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:companylist";
		}
	}
	
	
	@RequestMapping(path="/admin")
	public String admin()
	{
		return "adminLandingPage";
	}
	
	


	
	public Company updateCompany(Company company) throws Exception {
		return companyService.updateCompany(company);
	}

	@RequestMapping(path="/companylist")
	public ModelAndView getCompanyList() throws Exception {
		List<Company> list=companyService.getCompanyList();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("listCompanyDetails");
		mv.addObject("list", list);
		return mv;
	}


	

	

}
