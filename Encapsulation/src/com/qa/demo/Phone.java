package com.qa.demo;

public class Phone {
	
	//Attributes
	private String make;
	private int weight;
	private String phoneSize;
	
	//constructors
	//default constructor
	public Phone() {
		
	}
	//everything constructor
	public Phone(String make, int weight, String phoneSize) {
		this.make = make;
		this.weight = weight;
		this.phoneSize = phoneSize;
	}
	
	//getters & setters
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getPhoneSize() {
		return this.phoneSize;
	}
	
	public void setPhoneSize(String phoneSize) {
		this.phoneSize = phoneSize;
	}
	
	//toString
	@Override
	public String toString() {
		return "Phone: make: " + make + ", weight: " + weight + ", phoneSize: " + phoneSize;
	}
	
	//random methods
	public void hello() {
		setPhoneSize("This phone is big");
	}
	
}
