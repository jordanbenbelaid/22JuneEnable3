package com.qa.tasks.calcrevisted;

public class CalcRevisted {

	public static void main(String[] args) {
		System.out.println(add(23, 27));
		System.out.println(subtract(29, 14));
		System.out.println(divide(25, 7));
		System.out.println(multiply(4,5));

	}
	
	public static double add(double x, double y) {
		double result = x + y;
		return result;
	}
	
	public static double subtract(double x, double y) {
		double result = x - y;
		return result;
	}
	
	//Type casting - (double)x   - casting x from an int to a double
	public static String divide(int x, int y) {
		if(x >= y) {
		double result = (double)x / (double)y;
			return String.valueOf(result);
		} else {
			return "Please make the first number bigger than the second";
		}
	}
	
	public static double multiply(double x, double y) {
		double result = x * y;
		return result;
	}

}
