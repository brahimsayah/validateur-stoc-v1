package com.axione.validateur.stoc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.axione.validateur.stoc.model.TPrisePri;

public interface PriseRepository extends CrudRepository<TPrisePri, Integer> {
	
	
	List<TPrisePri> findByStatutNetDesigner(String statutNetDesigner);
}
