package com.qa.handler;

import java.util.ArrayList;
import java.util.List;

import com.qa.domain.Person;

public class PersonHandler {
	
	List<Person> people = new ArrayList<>();
	
	public PersonHandler() {}

	public PersonHandler(List<Person> people) {
		this.people = people;
	}
	
	public void addPerson(Person person) {
		this.people.add(person);
	}
	
	public void removePerson(Person person) {
		this.people.remove(person);
	}
	
	//find by name method
	public Person findByName(String name) {
		for(Person p : people) {
			if(p.getName().equalsIgnoreCase(name)) {
				return p;
			} 
		}
		System.out.println("There is noone with the name " + name + " in this list");
		return null;
	}
	
	//print all people in the list
	public void print() {
		for(Person p : people) {
			System.out.println(p);
		}
	}

}
