package com.qa.solutions;

public class Solutions {
	
	public static void main(String[] args) {
//		questionOne();
		questionTwo();
	}

	public static void questionOne() {
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static void questionTwo() {
		int[] nums = new int[10];
		//nums[i] refers to the index position in the array
		//i refers to the actual value
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.println(nums[i] * 10);
		}
	}
}
