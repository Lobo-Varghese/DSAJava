package com.DSAJava;

public class A8BinarySearchAlgorithm {
	
	
	public static int binarySearch(int[]arr ,int target) {
		int start = 0;
		int end = arr.length-1;
		
		
		
			while (start<=end) {
				//might possible that start+end exceed int
				int mid = start + (end-start)/2;
				if(target < arr[mid] ) {
					end=mid-1;
				}else if(target>arr[mid]) {
					start=mid+1;
				}else {
					return mid;
				}
			}
		return -1;
	}

	
	
	// when Array is descending
	public static int orderAgnosticBinarySearch(int[] arr,int target) {
			
		
		int start = 0;
		int end = arr.length-1;
		
	boolean isAsc = (arr[start]<arr[end]);
					
		
		while (start<=end) {
			//might possible that start+end exceed int
			int mid = start + (end-start)/2;
			
			if (target==arr[mid]){
				return mid;
			}
			
			if (isAsc){
			if(target < arr[mid] ) {
				end=mid-1;
			}else{
				start=mid+1;
			}
			}else {
				if(target > arr[mid] ) {
					end=mid-1;
				}else {
					start=mid+1;
				}
		}
		
	}return -1;
		
	}
	public static void main(String[] args) {

		int[] array = {2,4,8,33,44,74,89,97};
		int[] des = {98,67,46,34,23,12};
		System.out.println(orderAgnosticBinarySearch((des),67));
	}

}
