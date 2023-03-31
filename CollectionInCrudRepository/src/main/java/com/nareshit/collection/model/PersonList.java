package com.nareshit.collection.model;

import com.nareshit.collection.entity.Person;

public class PersonList {
	
	private Iterable<Person> Persons;
	public Iterable<Person> getPerson(){
		return Persons;
		
		
	}
	
	public void setPersons(Iterable<Person> Persons) {
		this.Persons= Persons;
	}

}
