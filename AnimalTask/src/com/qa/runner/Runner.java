package com.qa.runner;

import com.qa.domain.Animal;
import com.qa.domain.Bear;

public class Runner {

	public static void main(String[] args) {
		Animal animalBear = new Bear();
		Bear bear = new Bear(4, "Woods", 6, "Black Bear", 100);
		
		//printing bear
		System.out.println(bear);
		
		
		System.out.println(((Bear)animalBear).hello());
	}

}
