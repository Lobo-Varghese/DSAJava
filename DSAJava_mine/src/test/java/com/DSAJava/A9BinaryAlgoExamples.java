package com.DSAJava;

import java.util.Arrays;

public class A9BinaryAlgoExamples {
	
	
	//Cealing of Array target is the smallest number >= target
	public static int cealingOfArray(int[] arr, int target) {
		int start = arr[0];
		int end = arr.length-1;
		//target is greater than last Index Data 
		if(target>arr[arr.length-1]) {
			return -1;
		}
		/**********
		 * 
		 * m=s+e/2
		 * 
		 * m=s+e-s/2 (So we take this)
		 * 
		 * m = 2s+e-s/2
		 * 
		 * m = s+e/2
		 * 
		 * ************/
		while(start<=end) {
		int mid = start + (end - start)/2;
		
		
		if(target<arr[mid]) {
			end = mid-1; //interchange the mid index as this
		}else if(target>arr[mid]) {
			start=mid+1;
		}else {
			return mid; // target Index is mid
			
		}
		}
		return start;
	}
	
	//Floor of Array is the greatest number <= target
		public static int floor(int[] arr, int target) {
			int start = arr[0];
			int end = arr.length-1;
			
			
			while(start<=end) {
			int mid = start + (end - start)/2;
			
			
			if(target<arr[mid]) {
				end = mid-1; //interchange the mid index as this
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid; // target Index is mid
				
			}
			}
			return end;
		}

	//Find the smallest Letter Greater than the Target
	/**Given Character Array letters that is sorted in non - decreasing order and a character target,
	return smallest charcter in the array larger than the target
	Note: Character wrap around ex: if  target =='z' and letters ==['a','b']
	**/
		
		public static char cealingCharcater(char[] arr,char target) {
			int start = 0;
			int end = arr.length-1;
			if(target>arr[arr.length-1]) {
				return arr[start];
				
			}
			
			while(start<=end) {
			int mid = start+end-start/2;
			
			if(target<arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return arr[start%arr.length];	//reminder to get the start element
		}
		
	/**Given an array of integer nums sorted in ascending order, find the start and end position of given target value
	 * If target is not found in array return [-1,-1]
	 * 
	 * input : nums = [1,3,4,4,4,4,5,7]
	 * Output : [2,5]
	 * */	
		
		
		public static int search(int[] nums, int target,boolean findFirstOccurance) {
			
			int ans = -1;
			
			int start =0;
			int end = nums.length-1;
			
			while(start<=end) {
				int mid = start+(end-start)/2;
				if(target<nums[mid]) {
					end=mid-1;
				}else if(target>nums[mid]) {
					start=mid+1;
				}else{
					ans = mid;
					//potential ans found
					if (findFirstOccurance) {
						end=mid-1;
					}else {
						start=mid+1;
					}
				}
				
			}
			return ans;
		}
		
		public static int[] searchRange(int[] nums,int target) {
			
			int[] ans = {-1,-1};
			ans[0] = search(nums,target,true);
			ans[1] = search(nums,target,false);
			
			return ans;
		}
		
	/*******Find the position of an element in a sorted array of infinite numbers***********/
		
		//binary search for infinite loop. 
		//take a box of array, find the target, if not found double the search box
		public static int binarySearch(int[] arr,int target) {
			int start = 0;
			int end = 1;
			//until target is > end no need to start the binary search, just find the target range.
				while(target>arr[end]) {
					int newStart = end+1;
					
					//new end = prev end + double the size of previous box array.
					//size of  box =  end - start +1 
					end = end + (end-start +1)*2;	
					start = newStart;
				}
			
			while(start<=end) {
			int	mid = start + (end - start) / 2;
				if(target<arr[mid]) {
					end = mid-1;
				}else if(target>arr[mid]) {
					start = mid+1;
				}else {
					return mid;
				}
			}
			return -1;
		}

		
		/*****Find the peak in mountain array********/
		public static int mountain(int[] arr) {
			int start = 0;
			int end = arr.length-1;
			
			while (start<end) {
				int mid = start + (end - start)/2; //to store large value of int
				if(arr[mid]>arr[mid+1]) { //you are in the decresing part of array
					end = mid;
				}else { //you are in the increasing part of array
					start = mid+1;
				}
			}
			return start; //each loop give the best possible answer, when comes out after the break of loop will be the ans
		}
		
		
	public static void main(String[] args) {
		int[] mount = {1,2,3,4,5,7,6,5};
		int[] arr = {2,4,6,8,8,8,8,8,13,15,17,18,21,22,27,35};
		//char[] arr1 = {'a','e','f','h','k','o','r','u','w'};
		//System.out.println(cealingOfArray(arr, 36));
		//System.out.println(floor(arr, 13));
		//System.out.println(cealingCharcater(arr1,'r'));
		
	//int[] arr1 = searchRange(arr,8);
	//System.out.println(Arrays.toString(arr1));
		//System.out.println(binarySearch(arr,6));
		System.out.println(mountain(mount));
	}
	
	

}
