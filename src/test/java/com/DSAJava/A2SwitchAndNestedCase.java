package com.DSAJava;

import java.util.Scanner;

public class A2SwitchAndNestedCase {
	
	public static void fruits() {
		
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();
		switch(fruit) {
		case "Apple":
			System.out.println("Apple is red");
			break;
		case "Orange":
			System.out.println("Orange is orange");
			break;
		case "Grape":
			System.out.println("Grape is Green");
			break;
		default:
			System.out.println("Enter valid fruit");
		}
		sc.close();
	}
	
	public static void weeks() {
		Scanner in = new Scanner(System.in);
		int week = in.nextInt();
		switch(week) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		default -> System.out.println("Enter Number between 1 and 7");
		}
		in.close();
	}
	
	public static void weekdays() {
		Scanner in = new Scanner(System.in);
		
		int week = in.nextInt();
		switch(week) {
		case 1,2,3,4,5 -> System.out.println("weekdays");
		case 6,7 -> System.out.println("Weekends");
		default -> System.out.println("Enter correct date");
		}
		in.close();
		
	}
	
	public static void nestedSwitch() {
		Scanner in = new Scanner(System.in);
		String clas = in.next();
		
		switch (clas) {
		case "IT" -> System.out.println("Its IT department");
		case "Phy" -> System.out.println("Its Physics Department");	
		case "New" -> {
			System.out.println("Enter Values");
			String newDep = in.next();
			switch (newDep) {
			case "newD" ->	System.out.println("Enter New Dep");				
			case "Old" -> System.out.println("Old Dep");
			}
		}
		}
		in.close();
	}

	public static void main(String[] args) {
		
		//fruits();
		//weeks();
		//weekdays();
		nestedSwitch();
	}

}
