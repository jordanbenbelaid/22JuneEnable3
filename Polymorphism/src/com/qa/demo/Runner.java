package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		cow.sleep();
		cow.speak();

		Animal animal = new Cow();
		animal.sleep();
		((Cow)animal).speak();
		
		Object object = new Cow();
		((Cow)object).sleep();
		((Cow)object).speak();
	}

}
