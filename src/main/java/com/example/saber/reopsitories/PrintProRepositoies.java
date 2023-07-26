package com.example.saber.reopsitories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.saber.models.PrintBonProduction;

@Repository
public interface PrintProRepositoies extends CrudRepository<PrintBonProduction, Long> {
public List<PrintBonProduction> findAll();
List <PrintBonProduction> findAllByOrderByPieceDesc();

List <PrintBonProduction> findByArticleIgnoreCase(String article);
	
}
