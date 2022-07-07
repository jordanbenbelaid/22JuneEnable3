package com.qa.person;

public class Person {

	private String name = "Stew";
	private String eyeColour;
	private int age;
	
	//default constructor
	public Person() {	}
	
	//everything constructor
	public Person(String name, String eyeColour, int age) {
		this.name = name;
		this.eyeColour = eyeColour;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", eyeColour=" + eyeColour + ", age=" + age + "]";
	}
	
	
	
}
