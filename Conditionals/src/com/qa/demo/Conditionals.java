package com.qa.demo;

public class Conditionals {

	public static void main(String[] args) {

		//if/else statements
//		int num = 12;
//
//		if (num < 10 || num % 12 == 1) {
//			System.out.println("Condition met!");
//		} else if(num == 12) {
//			System.out.println("num is 12");
//		} else {
//			System.out.println("No conditions met");
//		}
		
		int day = 3;
		String days = "Two";
		
		
		switch(days) {
		case "One":
			System.out.println("Monday");
			break;
		case "Two":
			System.out.println("Tuesday");
			break;
		case "Three":
			System.out.println("Wednesday");
			break;
		case "Four":
			System.out.println("Thursday");
			break;
		case "Five":
			System.out.println("Friday");
			break;
		case "Six":
			System.out.println("Saturday");
			break;
		case "Seven":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("None of these match!");
			break;
		}

	}

}
