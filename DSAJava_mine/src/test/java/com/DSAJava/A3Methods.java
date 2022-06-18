package com.DSAJava;

import java.util.Arrays;
import java.util.Scanner;

public class A3Methods {
	
	public static String greet() {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.next();
		 return ("Hello "+ name);
		
	}
	//pass by value in primitive data types
	public static void changeName(String name) {
		name = "Lobo";
		System.out.println(name);
		
	}
	//pass by value of ref variable in objects and refs
	
	public static void changeArray(int[] val) {
	 
	 val[0]= 55;
	 
	}
	//VarArgs
	//variable name arguments
	public static void fun(int ...d) {
		System.out.println(Arrays.toString(d));
	}
	public static void multiple(int a,int b,String...d) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(d));
	}
	
	/*******Logic
	 * Is Prime
	 * 
	 * start
	 * input num
	 * c=2
	 * while c<num:
	 * 		if num%c=0:
	 * 			output "not prime"
	 * 			exit
	 * 		c = c+1
	 * end while
	 * output "prime"
	 * exit
	 * 
	 * Also :
	 * 
	 * for number 18
	 * sqrt (18) = 4
	 *	until that if its not divisible then its prime
	 *
	 * @param args
	 */

	public static boolean isPrime() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		if (num<1) {
			return false;
		}
		int c= 2;
		while(c*c<=num) {
			if (num%c==0) {
				System.out.println("Not Prime");
				return false;
			}
			c++;
		}
		return c*c>num;
		
	}
	
	
	/*********Logic *******
	 *3 digit Amstrong : sum of cube of each number is equal to the number
	 * 
	 *153
	 *
	 *1*1*1 + 5*5*5 + 3*3*3
	 * 
	 * 1 + 125 + 27 = 153
	 *
	 */
	public static boolean amstrong(int num) {
		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter 3 digit Number");
		//int num = in.nextInt();
		int val = num;
		int v=0;
		int sum = 0;
		while (num>0) {
		v = num%10;
		num = num/10;
		sum = sum + (v*v*v);
		
		}
		return (sum==val);
			
	}
	
	public static void main(String[] args) {
		
		//System.out.println(greet());
		//changeName("Celine");
		/*int[] arr = {1,5,4,3,4};
			changeArray(arr);
			System.out.println(Arrays.toString(arr) );*/
		//fun(2,4,5,3,6);
		//multiple(3,4,"Lobo","Celine","Deepa");
		/*boolean prime = isPrime();
		System.out.println(prime);*/
		/******Print all 3 digit Amstrong ***********/
		
		for(int i=100;i<1000;i++) {		
			
			if(amstrong(i)) {
				System.out.println(i+ "  ");
			}
		}
		
		
		
		}
	}
	
	


