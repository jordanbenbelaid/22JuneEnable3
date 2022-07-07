package com.qa.solution;

import java.util.Scanner;

public class CalcScanner {

	public double sum;

	public double add(double x, double y) {
		sum = x + y;
		return sum;
	}

	public double subtraction(double x, double y) {
		sum = x - y;
		return sum;
	}

	public double multiplication(double x, double y) {
		sum = x * y;
		return sum;
	}

	public double divide(double x, double y) {
		sum = x / y;
		return sum;
	}
	
	public void runMe() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		double a = input.nextInt();
		
		System.out.println("Please enter your second number");
		double b = input.nextInt();
		
		input.nextLine();
		
		System.out.println("What operator do you want to use?");
		String operator = input.nextLine();
		
		switch(operator) {
		case "+":
			System.out.println("The solution to " + a + " " + operator + " " + b + " = " + add(a,b) + "\n");
			//by adding the name of this method into itself, we get it to run again when we finish 
			//with the solution
			runMe();
			break;
		case "-":
			System.out.println("The solution to " + a + " " + operator + " " + b + " = " + subtraction(a,b));
			break;
		case "*":
			System.out.println("The solution to " + a + " " + operator + " " + b + " = " + multiplication(a,b));
			break;
		case "/":
			if(b == 0 || a == 0) {
				System.out.println("You cannot use 0 when dividing");
			}else {
			System.out.println("The solution to " + a + " " + operator + " " + b + " = " + divide(a,b));
			}
			break;
		default:
			System.out.println("Please pick an operator that exists (+, -, *, /)");
			break;
		}
	}
}
