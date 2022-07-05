package com.qa.solutions;

public class Flowcharts {

	public static void main(String[] args) {
//		flowchartOne();
//		flowchartTwo();
//		flowchartThree();
		flowchartFive();
	}
	
	public static void flowchartOne() {
		for(int i = 100; i <= 201; i++) {
			System.out.println("A");
		}
	}
	
	public static void flowchartTwo() {
		for(int i = 100; i <= 201; i++) {
			if(i % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	public static void flowchartThree() {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void flowchartFive() {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}

}
