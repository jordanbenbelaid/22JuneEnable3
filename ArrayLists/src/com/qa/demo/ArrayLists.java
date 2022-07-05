package com.qa.demo;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		//Created a new array list
		List<String> names = new ArrayList<>();
		
		//adding to the list
		names.add("Jordan");
		names.add("Ben");
		names.add("Carol");
		
		Collections.sort(names);
		Collections.swap(names, 0, 2);
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		//getting a value from index
		System.out.println(names.get(0));
		
		//setting a value in the list
		System.out.println(names.get(2));
		names.set(2, "Jim");
		System.out.println(names.get(2));
		
		//removing something from a list
		names.remove(2);
		
		//the size of the list
		names.size();
		
		//clearing the list
		names.clear();
		
		//creating a list with populated data already
		List<Integer> nums = List.of(3,7,1,10,32,15,19,21,44,1);
		
		//looping through an arraylist
		for(int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		//sorting a list A-z or ascending order numerically
		System.out.println("=================");
		
		
		
	}

}
