package com.nareshit.collection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.collection.entity.Person;
import com.nareshit.collection.model.PersonList;
import com.nareshit.collection.service.PersonService;

@RestController
@RequestMapping(value="/persons")
public class PersonController {
	
	@Autowired
	private PersonService  personservice;
	
	
	@PostMapping(value="/create")
	public Iterable<Person> saveAllPersons(PersonList prsnlist){
		System.out.println("createmethod");
		System.out.println("createmethodbefore");
		return personservice.saveAllPersons(prsnlist.getPerson());
		
		
		
		
	}
	
	@GetMapping(value="/all")
	public Iterable<Person> findAllPersons(Iterable<Integer> personIds){
		return personservice.findAllPersons(personIds);
	}

}
