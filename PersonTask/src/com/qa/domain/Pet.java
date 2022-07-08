package com.qa.domain;

public class Pet {

	private String typePet;
	private String name;
	private int age;
	
	public Pet() {}

	public Pet(String typePet, String name, int age) {
		this.typePet = typePet;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nPet: \ntypePet = " + typePet + "\nname = " + name + "\nage = " + age + "\n";
	}
	
	
}
