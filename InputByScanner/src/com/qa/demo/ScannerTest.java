package com.qa.demo;

import java.util.Scanner;

public class ScannerTest {

	public void tryMe() {
		//creating the scanner object
		Scanner scan = new Scanner(System.in);
		
		//Asking the user a question
		System.out.println("What is your favourite food");
		//user inputs their answer
		String food = scan.nextLine();
		
		System.out.println("How many drinks have you had today");
		int drinks = scan.nextInt();
		
		System.out.println("What would you rate your meal out of 10");
		int rating = scan.nextInt();
		
		//We add a nextLine() when we are done with nextInt() (or any other type of next() method)
		//So that it starts a new line when we come to use the "What is your name" part
		//This allows it to start from a fresh line, rather than the newline character
		scan.nextLine();
		
		System.out.println("What is your name");
		String name = scan.nextLine();
		
		System.out.println("Hello " + name + ", your favourite food is " + food + ", you have had " + 
		drinks + " drinks today and rate your meal a " + rating + "/10");
		
		//This closes/terminates the program from running (console will stay the same)
		scan.close();

	}
}
