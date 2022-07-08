package com.qa.runner;

import com.qa.domain.Person;
import com.qa.domain.Pet;
import com.qa.handler.PersonHandler;

public class Runner {
	public static void main(String[] args) {

	PersonHandler handle = new PersonHandler();
	
	Person person1 = new Person("Jordan", 25, "Trainer");
	Person person2 = new Person("Brad", 21, "Retail");
	Person person3 = new Person("Michelle", 32, "Developer");
	Person person4 = new Person("Jamie", 46, "Streamer");
	Person person5 = new Person("Bridget", 19, "Dog groomer");
	
	handle.addPerson(person5);
	handle.addPerson(person4);
	handle.addPerson(person3);
	handle.addPerson(person2);
	handle.addPerson(person1);
	
//	handle.print();
	
//	System.out.println(handle.findByName("John"));
	
	
	//Pet extension
	Pet pet1 = new Pet("Cat", "Catty", 5); 
	Pet pet2 = new Pet("Dog", "Doggy", 4); 
	Pet pet3 = new Pet("Tiger", "Tigger", 1); 
	Pet pet4 = new Pet("Fish", "Fishy", 6); 
	Pet pet5 = new Pet("Monkey", "Monky", 3); 
	
	person1.addPet(pet5);
	person1.addPet(pet1);
	
	person2.addPet(pet3);
	
	person3.addPet(pet2);
	
	person4.addPet(pet4);
	person4.addPet(pet3);
	person4.addPet(pet2);
	
	person5.addPetDifferent("Crocodile", "Croc", 40);
	
	handle.print();
	
	
	}
}
