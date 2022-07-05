package com.qa.solutions;

import java.util.ArrayList;
import java.util.List;

public class Solutions {

	public static List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

	public static void main(String[] args) {
//		questionTwo();
		questionFour();
	}

	public static void questionOne() {
		List<String> names = new ArrayList<>();

		names.add("Jordan");
		names.add("Nathan");
		names.add("Aimee");
		names.add("Brad");
		names.add("Sam");

		for (String s : names) {
			System.out.println(s);
		}

	}

	public static void questionTwo() {
		for (int i : nums) {
			System.out.println(Math.round(Math.pow(i, 2)));
		}
	}

	public static Boolean evenOdd(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void questionFour() {
		for (int i : nums) {
			if (evenOdd(i)) {
				System.out.println("The number " + i + " cubed is: " + i * i * i);
			} else {
				System.out.println("The number " + i + " squared is: " + i * i);
			}
		}
	}

}
