package com.example.saber.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.saber.models.PrintBonProduction;
import com.example.saber.services.PrintProductionServices;


import jakarta.validation.Valid;

@Controller

public class PrintProController {
	@Autowired
	private PrintProductionServices ProductionServ;
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/dashboard")
	public String renderDashboard(Model model) {
		List<PrintBonProduction> prods = ProductionServ.allProdect();
		model.addAttribute("prods", prods);
		return "dashboard.jsp";
}
	@GetMapping("/prod/new")
	public String songForm(@ModelAttribute("prod") PrintBonProduction prod) {
		
		return "/prods/new.jsp";
	}
	@PostMapping("/products/new")
	public String submitSong(@Valid @ModelAttribute("prod") PrintBonProduction prod, BindingResult result)
	{
		if(result.hasErrors()) {
			return "/prods/new.jsp";
		} else {
			ProductionServ.createprod(prod);
			return "redirect:/dashboard";
		}
		
	}
	@GetMapping("/sortDas")
	public String soetDashboard(Model model) {
		List<PrintBonProduction> prods = ProductionServ.allProdect();
		model.addAttribute("prods", prods);
		return "sortDas.jsp";
	
	}
	@GetMapping("/sort/new")
	public String newsort(@ModelAttribute("Production") PrintBonProduction Production,Model model) {
		model.addAttribute("prod",ProductionServ.allProdect());
		return "/prods/sort.jsp";
	}
	
	



}
