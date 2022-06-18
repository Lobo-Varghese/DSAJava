package com.DSAJava;

import java.util.Arrays;

public class B2SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
		}
		return arr;
	}
	
	public static int getMaxIndex(int[] arr,int start,int end) {
		int max=start;
		for(start=0;start<=end;start++) {
			if(arr[max]<arr[start]) {
				max=start;
			}
		}
		
		
		return max;
	}
	
	public static void swap(int[] arr , int first , int second) {
		int temp = arr[first];
		arr[first]= arr[second];
		arr[second]=temp;
		
	}

	public static void main(String[] args) {
		int[] arr = {2,4,5,1,3,7};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

}
