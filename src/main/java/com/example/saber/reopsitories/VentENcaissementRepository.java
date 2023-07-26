package com.example.saber.reopsitories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.saber.models.VenteEncaissement;


@Repository
public interface VentENcaissementRepository extends CrudRepository<VenteEncaissement,Long> {
	public List<VenteEncaissement> findAll();
}
