package com.qa.demo;

public class Demo {

	public static void main(String[] args) {

		String str1 = "ThIsIsSoMeTeXt";
		String str2 = "thisissometext";

		// make all letters lowercase
		System.out.println(str1.toLowerCase());

		// make all letters uppercase
		System.out.println(str1.toUpperCase());

		// finding a character at a certain index
		System.out.println(str1.charAt(6));

		// first position of character specified
		System.out.println(str1.indexOf("s"));

		// show true or false depending if the string starts with the specified
		// character
		System.out.println(str1.startsWith("T"));

		// show true or false depending if the string ends with the specified character
		System.out.println(str1.endsWith("t"));

		// returns true or false depending if the string we check contains the string we search for
		System.out.println(str1.contains("IsSo"));
		
		//returns a new string thats a substring of this string, based on the start and end index
		//starting number is inclusive, end number is exclusive
		System.out.println(str1.substring(4, 10));
		
		//checking values are equal to each other
		System.out.println(str1.equals(str2));
		
		//checking values are equal to each other WHILE ignoring the case
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//replace part of a string with a different one
		System.out.println(str1.replace("IsSoMe", "IsSoNotMe"));
	}

}
