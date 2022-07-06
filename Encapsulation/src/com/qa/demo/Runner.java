package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		
		Phone phoneOne = new Phone();
		Phone phoneTwo = new Phone("Samsung", 1, "Medium");
		System.out.println(phoneTwo.getPhoneSize());
		phoneTwo.hello();
		System.out.println(phoneTwo.getPhoneSize());
		
		
		System.out.println(phoneTwo);
	}

}
