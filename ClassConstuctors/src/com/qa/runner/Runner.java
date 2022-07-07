package com.qa.runner;

import java.util.ArrayList;
import java.util.List;

import com.qa.person.Person;

public class Runner {

	public static void main(String[] args) {
		Person jordan = new Person("Jordan", "Hazel", 25);
		Person annie = new Person("Annie", "Green", 28);
		Person jake = new Person("Jake", "Blue", 25);
		
		//adding objects of the type Person to this list
		List<Person> people = new ArrayList<>();
		
		people.add(jake);
		people.add(jordan);
		people.add(annie);
		
		for(Person p : people) {
			System.out.println(p);
		}
	}

}
