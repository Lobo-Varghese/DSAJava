package com.DSAJava;

import java.util.Arrays;
import java.util.Scanner;

public class A5MultidimentionalArray {
	
	/*
	 
	  1 2 3
	  4 5 6
	  7 8 9
	
	We can visualise it as
	
		stack memory		heap memory
		int[][] arr1 		= {
								{1,2,3},
								{4,5,6},
								{5,6,7}
										};
		This is visualized as array of arrays , refer main book
		
		
		int[][] arr = new int[3][]; // row is mandatory, column is optional
		
		// we can store it like
		int[][] arr1 = {
						{1,2,3},
						{4,5,6},
						{5,6,7}
								};
		//System.out.println(Arrays.toString(arr1));
		//Also we can store it like
		int[][] arr2 = {
				{1,2,3}, //0th Index
				{4,5},	//1st Index
				{6,7,8,9}//so on
						};
			
	 */
	
	public static void twoDArray() {
		//here column will be same as original array.
				//row will number of rows
				
				//input
				Scanner in = new Scanner(System.in);
				System.out.println("enter array values");
				int[][] arr3 = new int[3][3]; //arr3.length will give number of row
				System.out.println(arr3.length);
				
				for(int row=0;row<=arr3.length-1;row++) {
					//for each column in every row
					for(int col = 0;col< arr3[row].length;col++) {
						arr3[row][col]=in.nextInt();
					}
				}
				/***********OUTPUT*********/
				/***********One way******/
				/*for(int row = 0;row<=arr3.length-1;row++) {
					//for each column in every row
					for(int col = 0;col<arr3[row].length;col++) {
						System.out.print(arr3[row][col]+ " ");				
					}
					System.out.println();
				}*/
				/********Also using Arrays.tostring*****/
				/*for(int row = 0;row<=arr3.length-1;row++) {
					System.out.println(Arrays.toString(arr3[row]));
			}
				System.out.println();*/
				
				/**********For Each output***********/
				
				for(int[] a: arr3) {
					System.out.println(Arrays.toString(a));
				}
				in.close();
		}
	
	
	
	public static void columnNotFixed() {
		
		int[][] arr = {
			{2,4,5},
			{3,5},
			{4,7,8,4}
		};
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		columnNotFixed();
		
		
	}
	
}
