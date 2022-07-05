package com.qa.demo;

import java.util.ArrayList;
import java.util.List;

public class Enhanced {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Jordan");
		names.add("Nathan");
		names.add("Aimee");
		names.add("Brad");
		names.add("Sam");
		
		for(String s: names) {
			System.out.println(s);
		}
	}

}
