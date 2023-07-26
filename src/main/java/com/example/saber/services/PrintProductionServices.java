package com.example.saber.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.saber.models.PrintBonProduction;
import com.example.saber.reopsitories.PrintProRepositoies;



@Service
public class PrintProductionServices {
	@Autowired
	private PrintProRepositoies PrintProRepo;
	// return all the PrintProductionServices
		public List<PrintBonProduction> allProdect(){
			return PrintProRepo.findAll();
			}
		
		// create a prod
		public PrintBonProduction createprod(PrintBonProduction s) {
			return PrintProRepo.save(s);
		}
		// retrieves a Prod by ID
		public PrintBonProduction findProd(Long id) {
			Optional<PrintBonProduction> optionalProd = PrintProRepo.findById(id);
			if (optionalProd.isPresent()) {
				return optionalProd.get();
			} else {
				return null;
			}
		}
		
		
		
}
