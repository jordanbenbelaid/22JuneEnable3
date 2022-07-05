package com.qa.demo;

public class Arrays {

	public static void main(String[] args) {
		// way 1 to make an array, created an empty array
		int[] ageArray;		

		// way 2 , make an array with valued in it
		String[] names = { "Jordan", "Alex", "Dan", "Bob" };
		//looping through an array
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		

		// way 3, make an empty array that holds a certain amount of values
		String[] surnames = new String[5];
		
		//adding a value to an array
		surnames[1] = "Harry";
		
		

		// Multi-dimensional arrays

		// way 1
		int[][] arrayNums;

		// way 2
		int[][] nums = { { 1, 2, 3, 4, 5, 6 }, { 9, 8, 7, 6, 5, 1 }, { 10, 11, 12, 13, 14 } };
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]);
			}
			System.out.println();
		}
		
		// way 3 
		int[][] longNums = new int[3][5];
		
		//adding a value to a multidimensional array
		longNums[2][3] = 23;
	}

}
