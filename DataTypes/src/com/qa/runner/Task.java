package com.qa.runner;

public class Task {
	

	
	public static void main(String[] args) {
		System.out.println(integer());
		System.out.println(bool());
		System.out.println(character());
		System.out.println(longVal());
		System.out.println(floatVal());
		System.out.println(string());
		randomVoid();
		
	}
	
	public static int integer() {
	    return 0;
	}
	public static boolean bool() {
	    return true;
	}
	public static char character() {
	    return 'P';
	}
	public static long longVal() {
	    return 52L;
	}
	public static float floatVal() {
	    return 0.6f;
	}
	public static String string() {
	    return "Hi there";
	}
	public static void randomVoid() {
	    System.out.println("Nice");
	}

}
