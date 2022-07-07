package com.qa.domain;

public class Bear extends Animal {

	private String type;
	private int weight;
	
	public Bear() {	}

	public Bear(int legs, String habitat, int age, String type, int weight) {
		super(legs, habitat, age);
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Bear \nType of Bear: " + type + ", Bear weight: " + weight + ", Number of legs: " + 
				getLegs() + ", Bear habitat: " + getHabitat() + ", Bear age: " + getAge() ;
	}

	@Override
	public String life(int x) {
		return "The life expectancy of this animal is " + x + " years";
	}

	@Override
	public String howFast(int x) {
		return "This animal can move at speeds of " + x + " kph";
	}
	
	public String hello() {
		return "Hello, I am a bear";
	}

	
}
