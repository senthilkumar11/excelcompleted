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
import com.premium.stc.model.StockExchange;
import com.premium.stc.service.StockExchangeService;
@Controller
public class StockController {
	@Autowired
	StockExchangeService stockExchangeService;
	@RequestMapping(path="/stocklist")
	public ModelAndView getStockList() throws Exception {
		List<StockExchange> list=stockExchangeService.getStockList();
		for(StockExchange stock:list)
		{
			System.out.println(stock);
		}
		ModelAndView mv=new ModelAndView();
		mv.setViewName("listStockExchange");
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping(path="/insertstock",method = RequestMethod.GET )
	public String insertStock(Model model)
	
	{
		
		StockExchange stockex=new StockExchange();
		model.addAttribute("stockex",stockex);
		return "insertStockExchange";
		
	}
	@RequestMapping(path="/insertstock",method = RequestMethod.POST)
	public String insert(StockExchange stockex )
	{
		
		System.out.println(stockex);
		
		return "redirect:stocklist";
		
	}
	
	
}
