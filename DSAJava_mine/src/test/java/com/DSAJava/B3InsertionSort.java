package com.DSAJava;

import java.util.Arrays;

public class B3InsertionSort {
	
	public static int[] insertionSort(int[] arr) {
		
		for (int i=0;i<=arr.length-2;i++) {
			
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] array = {-4,1,2,-5,0};
		System.out.println(Arrays.toString(insertionSort(array)));
	}

}
