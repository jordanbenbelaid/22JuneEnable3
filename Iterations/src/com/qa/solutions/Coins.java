package com.qa.solutions;

public class Coins {

	public static void main(String[] args) {
		change(753, 2000);

	}

	public static void change(double cost, double amount) {
		double twentyPounds = 0;
		double tenPounds = 0;
		double fivePounds = 0;
		double twoPounds = 0;
		double onePound = 0;
		double fiftyPence = 0;
		double twentyPence = 0;
		double tenPence = 0;
		double fivePence = 0;
		double twoPence = 0;
		double onePence = 0;
		
		while(amount - cost >= 20) {
			twentyPounds++;
			amount -= 20;
		}
		
		while(amount - cost >= 10) {
			tenPounds++;
			amount -= 10;
		}
		
		while(amount - cost >= 5) {
			fivePounds++;
			amount -= 5;
		}
		
		while(amount - cost >= 2) {
			twoPounds++;
			amount -= 2;
		}
		
		while(amount - cost >= 1) {
			onePound++;
			amount -= 1;
		}
		
		while(amount - cost >= 0.50) {
			fiftyPence++;
			amount -= 0.50;
		}
		
		while(amount - cost >= 0.20) {
			twentyPence++;
			amount -= 0.20;
		}
		
		while(amount - cost >= 0.10) {
			tenPence++;
			amount -= 0.10;
		}
		
		while(amount - cost >= 0.05) {
			fivePence++;
			amount -= 0.05;
		}
		// This section down needs to be sorted with maybe an if statement or something
		while(amount - cost >= 0.02) {
			twoPence++;
			amount -= 0.02;
		}
		
		while(amount - cost >= 0.01) {
			onePence++;
			amount -= 0.01;
		}
		
		System.out.print("£20: ");
		System.out.println(twentyPounds);
		System.out.print("£10: ");
		System.out.println(tenPounds);
		System.out.print("£5: ");
		System.out.println(fivePounds);
		System.out.print("£2: ");
		System.out.println(twoPounds);
		System.out.print("£1: ");
		System.out.println(onePound);
		System.out.print("50p: ");
		System.out.println(fiftyPence);
		System.out.print("20p: ");
		System.out.println(twentyPence);
		System.out.print("10p: ");
		System.out.println(tenPence);
		System.out.print("5p: ");
		System.out.println(fivePence);
		System.out.print("2p: ");
		System.out.println(twoPence);
		System.out.print("1p: ");
		System.out.println(onePence);
	}
	
}
