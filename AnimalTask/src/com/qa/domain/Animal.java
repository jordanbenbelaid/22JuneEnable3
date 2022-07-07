package com.qa.domain;

import com.qa.interfaces.LifeExpectancy;
import com.qa.interfaces.Speed;

public abstract class Animal implements LifeExpectancy, Speed{
	
	//attributes
	private int legs;
	private String habitat;
	private int age;
	
	//constructors
	public Animal() {}
	
	public Animal(int legs, String habitat, int age) {
		this.legs = legs;
		this.habitat = habitat;
		this.age = age;
	}

	//getters and setters
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//toString which determines how the objects data is returned to us in the console
	@Override
	public String toString() {
		return "Animal \nNumber of legs: " + legs + ", habitat: " + habitat + ", age: " + age;
	}
	
	//custom methods
	public String sleep(int x) {
		return "This animal sleeps for " + x + " hours";
	}
	
	public void children(int x) {
		System.out.println("This animal has " + x + " children");
	}
	
}
