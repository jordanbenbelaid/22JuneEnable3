package com.qa.solutions;

public class Solutions {

	public static void main(String[] args) {
//		questionOne();
//		wordCount("Hello my name is Jordan");
//		printingVertical("Hello my name is Jordan");
		printingVerticalReverse("Hello my name is Jordan");
	}
	
	public static void questionOne() {
		String s1 = "yesterday it was raining";
		String s2 = "today it is sunny";
		System.out.println(s2.toUpperCase() + ", " + s1.toUpperCase());
		
		String subString1 = s2.substring(0, 11);
		String subString2 = s1.substring(16, 24);
		System.out.println(subString1.toUpperCase() + subString2.toUpperCase());
	}
	
	public static void wordCount(String message) {
		int spaces = 0;
		
		for(int i = 0; i < message.length(); i++) {
			if(message.substring(i, i+1).equals(" ")) {
				spaces++;
			}
		}
		System.out.println("In the message you entered, there are " + (spaces + 1) + " words.");
	}
	
	public static void printingVertical(String message) {
		String word = "";
	
		for(int i = 0; i < message.length(); i++) {
			if(message.substring(i, i+1).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word += message.substring(i, i + 1);
			}
		}
		System.out.println(word);
	}
	
	public static void printingVerticalReverse(String message) {
		String word = "";
		
		for(int i = message.length(); i > 0; i--) {
			if(message.substring(i-1, i).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word = message.substring(i-1, i) + word;
			}
		}
		System.out.println(word);
	}
	
	
	
	
}
