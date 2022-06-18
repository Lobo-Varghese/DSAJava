package com.DSAJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A6MultidimentionalArrayList {
	
	public static void multiarr() {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		//initialization , same as new int[3][]; in 2 D array
		for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				list.get(i).add(in.nextInt());
			}
			
		}
		
		for(ArrayList<Integer> a: list) {
			System.out.println(a);
		}
		in.close();
	}
	
	//swap numbers in array
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	//find max in array
	public static void max(int[] arr) {
		int max = arr[0];
		for(int i = 1;i<arr.length;i++	) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	public static int maxRange(int[] arr,int start, int stop) {
		
		if(start>stop) {
			return -1;
		}
		if(arr == null) {
			return -1;
		}
		int max = arr[start];
		for(int i = start;i<=stop;i++	) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		//System.out.println(max);
		return max;
	}


	public static void main(String[] args) {
		
		 //multiarr();
		
		int[] arr = {3,5,2,6,9,8};
		// swap(arr,0,4);
		//max(arr);
		//System.out.println(Arrays.toString(arr));
		
		//System.out.println(maxRange(arr,2,4));
		
		/** With the swap function created we can reverse an arr**/
		
		int start=0;
		int end = arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
			System.out.println(Arrays.toString(arr));
		}
	}

