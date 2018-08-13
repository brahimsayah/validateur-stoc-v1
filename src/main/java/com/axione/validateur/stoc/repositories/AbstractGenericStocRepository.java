package com.axione.validateur.stoc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public abstract class AbstractGenericStocRepository<T> implements CrudRepository<T, Integer>{
	
	public abstract List<? extends T> chercherParCriteres(T t);

}
