package com.nareshit.collection.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.collection.entity.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {
	
	
	
	/*
	 * 
	 * saveall ==> CrudRepository
	 * findAllById ==> CrudRepository
	 */

}
