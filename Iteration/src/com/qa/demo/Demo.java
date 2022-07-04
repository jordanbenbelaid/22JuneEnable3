package com.qa.demo;

public class Demo {

	public static void main(String[] args) {
		
		//while Loop
		int counter = 0;
		
		while(counter < 10) {
			System.out.println("This has printed " + counter + " many times");
			counter++;
		}
		
		//do while loop
		boolean hasEleven = true;
		int playerCount = 0;
		
		do {
			System.out.println("There are " + playerCount + " players on your team so far");
			playerCount++;
			
			if(playerCount > 11) {
				hasEleven = false;
			}
			
		} while(hasEleven);
	
		
		//for loop
		//int i = 0 - This is the start point for the loop
		//i < 11 - This is the end point of the loop
		//i++ - This is i increasing after each iteration of the loop by 1
		for(int i = 0; i < 11; i++) {
			System.out.println(i * 2);
		}
	
	}

}
