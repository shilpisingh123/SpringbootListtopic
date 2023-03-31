package com.nareshit.collection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.collection.dao.PersonDao;
import com.nareshit.collection.entity.Person;
import com.nareshit.collection.model.PersonList;

@Service
public class PersonService {
	
	
	@Autowired
	private PersonDao personDao;
	
	
	//saveAll
	
	/*
	 * public Iterable<Person> saveAllPersons(Iterable<Person> personsList){ return
	 * personDao.saveAll(personsList); }
	 */
	
	
	
	//saveAll
	
	public Iterable<Person> saveAllPersons(Iterable<Person> personsList){
		return personDao.saveAll(personsList);
	}
	
	
	
	//findAllById
	public Iterable<Person> findAllPersons(Iterable<Integer> personIds){
		return personDao.findAllById(personIds);
	}

}
