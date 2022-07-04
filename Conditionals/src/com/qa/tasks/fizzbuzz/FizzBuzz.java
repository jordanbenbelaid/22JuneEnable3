package com.qa.tasks.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(30);

	}
	
	public static void fizzBuzz(int x) {
		if(x % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if (x % 5 == 0) {
			System.out.println("Buzz");
		} else if (x % 3 == 0){
			System.out.println("Fizz");
		} else {
			System.out.println(x);
		}
	}

}
