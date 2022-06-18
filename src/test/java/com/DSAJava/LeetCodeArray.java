package com.DSAJava;

import java.util.Arrays;

public class LeetCodeArray {

	public static void main(String[] args) {
		//Input: nums = [1,2,1]
			//	Output: [1,2,1,1,2,1]
		int[] arr = {1,2,3};
		int[] arr1 = arrayConcatenate(arr);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static int[] arrayConcatenate(int[] nums) {
		
		int[] ans = new int[2*nums.length];
		for(int a=0;a<=nums.length-1;a++) {
			ans[a]=nums[a];
		}
		//ans = nums.clone();
		int j = nums.length;
		for(int i=0;i<=nums.length-1;i++) {
			ans[i+j]= nums[i];
			//ans=nums[i+j];
		}
		
		return ans;
		
	}
	
}
