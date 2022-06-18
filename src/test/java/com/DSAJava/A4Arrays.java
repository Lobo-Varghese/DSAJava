package com.DSAJava;

import java.util.Scanner;

public class A4Arrays {
	
	/*********
	 * Arrays:
	 * **********
	 * 
	 * int[] arr = new int[5]();
	 * 
	 * int[] arr = {2,4,6,43,6}
	 * 
	 * int[] arr; // declaration of Array , arr is getting declared in the Stack . happens in compile time
	 * 
	 * arr = new int[5]; // initialization, object is getting created in the Memory(Heap). happens in Runtime
	 * 					// Also called Dynamic Memory alloction
	 * 
	 * 
	 * 
	 * ******/
	
	public static void array() {
		
		String[] arr = new String[5];
		System.out.println(arr[0]);
		
		int[] arr1 = new int[5];
		System.out.println(arr1[3]);
	}
	public static void array1() {
		
		int[] arr = new int[5];
		 arr[0]= 2;
		 arr[1]= 4;
		 arr[2]= 5;
		 arr[3]= 7;
		 arr[4]= 22;
		 System.out.println(arr[3]);
	}
		public static void array2() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 number");
		int[] arr = new int[5];
		 for(int i=0;i<5;i++) {
			 arr[i]=in.nextInt();
		 }
		 for(int a:arr)
		 System.out.println(a);
	}
		
		

	public static void main(String[] args) {
		
		//array();
		//array1();
		array2();
	}

}
