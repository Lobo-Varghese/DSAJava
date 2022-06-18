package com.DSAJava;

import java.util.Arrays;

public class B1BubbleSortAlgo {
	
	//stable sorting algorithm
	//will compare adjecent element in each step
	//largest element move to last in each of outer loop run. 
	//no need to run the loop to cover last element already sorted [j <= arr.length-i]
	//this means each inner loop should have a swap. If no swap , array is sorted. Hence Break
	
	public static int[] bubble(int[] arr) {
		boolean swapped;
		for(int i=0;i<arr.length;i++) {
			swapped = false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped = true;
				}				
			}
			if(!swapped) { //swap is not true , swap not happened
				break;
			}
			
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {3,2,1,7};
		
		System.out.println(Arrays.toString(bubble(arr)));

	}

}
