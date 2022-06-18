package com.DSAJava;

import java.util.Arrays;

public class B4CyclicSort {
	
	public static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {			
			//in a sorted array {1,2,3,4,5} element = array[i]-1; where start from i=0
			//									4	= array[4]-1;
			//									4 	= 5-1
			int correct= arr[i]-1;
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}else {
			i++;
			}
		}
		
		
		//return arr;
	}
	
	public static void swap(int[] arr,int first,int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	
		//return arr;
		
	}

	public static void main(String[] args) {
		
		int[] array = {3,4,1,5,2};
		cyclicSort(array);
		System.out.println(Arrays.toString(array));
	}

}
