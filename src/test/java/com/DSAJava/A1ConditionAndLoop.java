package com.DSAJava;

import java.util.Scanner;

public class A1ConditionAndLoop {
	
	/***MaX Number*Logic:
	 * a=10, b=20,c=30
	 * max = a;
	 * if b > max
	 * max = b
	 * if 
	 * 	c > max
	 * max = c
	 * 
	 * Syso max * 
	 * 
	 * 
	 * 
	********************/
	public static void maxNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		if(b>max) {
			max=b;			
		}
		if(c>max) {
			max=c;
		}
		System.out.println("Max Number: "+max);
		sc.close();
		}
	
	public static void mathMaxMethod()	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Math.max(c,Math.max(a, b));
		System.out.println(max);
		sc.close();
	}
	
	public static void upperCaseLowerCase() {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().trim().charAt(0);
		if ((c>'a') && c<'z') {
			System.out.println("Lower Case: "+ c);
		}else if(c>'A' && c<'Z') {
			System.out.println("Upper Case: "+c);
		}	
		sc.close();
	}
	
	//Find nth Fibonacci number
	//0,1,1,2,3,5,8,13
	
	/**Logic: 
	 * 
	 * a=0
	 * b=1
	 * count=2;
	 * while(count<=7)
	 * temp = b
	 * b=a+b
	 * a=b
	 * count++
	 * ***/
	
	public static void fibo() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int count=2;
		
		while(count <= n) {
			int temp = b;
			b= a+b;
			a = temp;
			count ++;
		}
		System.out.println(b);
		sc.close();
	}
	
	//n = 1385757879 == occurance of 7 in this
	/*******
	 * Logic:
	 * num = n%10
	 * n = n/10
	 * 
	 * *********/
	public static void occurances() {
		long n = 245453L;
		int count = 0;
		while(n>0) {
		long num = n%10;
		n = n/10;
		if(num == 7) {
			count += 1;
		}
		}
		System.out.println(count);
	}
	
	/*********Logic:
	 * 
	 * n = num%10
	 * n = n+""+n
	 * ********/
	
	public static void reverseNum() {
		
		int num = 3454564;
		int rev = 0;
		while(num>1) {
		int n = num%10;
		num = num/10;
		rev = (rev*10)+n;
		}
		System.out.println(rev);
	}
	
	public static void calculator() {
		System.out.println("Enter the Operator: ");
		Scanner in = new Scanner(System.in);
		
		int res=0;
		
		while(true) {
		char op = in.next().trim().charAt(0);
		if(op == '+' ||op == '-'||op=='*'||op=='/'||op=='%')	{
			
			System.out.println("Enter Two Digits: ");
			
			int a = in.nextInt();
			int b = in.nextInt();
			
			if (op=='+') {
				res = a+b;
			}
			if (op=='-') {
				res = a-b;
			}
			if (op=='*') {
				res = a*b;
			}
			if (op=='/') {
				if (b!=0) {
				res = a-b;
			}
				
		}
			
			}else if (op=='X'||op=='x') {
				System.out.println("Programm Exit");
				break;
			}else {
			System.out.println("Invalid Operator!!!");
			//break;
	}
		System.out.println(res);
		}
		in.close();
	}

	public static void main(String[] args) {
		//maxNumber();
		//mathMaxMethod();
		//upperCaseLowerCase();
		//fibo();
		//occurances();
		//reverseNum();
		calculator();
	}

}
