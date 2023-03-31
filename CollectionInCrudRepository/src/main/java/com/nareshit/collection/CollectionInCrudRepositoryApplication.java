package com.nareshit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nareshit.collection.entity.Person;
import com.nareshit.collection.model.PersonList;
import com.nareshit.collection.service.PersonService;

@SpringBootApplication
public class CollectionInCrudRepositoryApplication implements CommandLineRunner{
	
	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(CollectionInCrudRepositoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createPersons();
		//getPersons();
		
		
		//PersonList prsnlist = new PersonList();
		
		//personService.saveAllPersons())

	}
	
	



}
