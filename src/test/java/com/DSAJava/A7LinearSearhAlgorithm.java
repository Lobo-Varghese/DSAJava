package com.DSAJava;

import java.util.Arrays;

public class A7LinearSearhAlgorithm {

	public static void main(String[] args) {
		
		int[] array = {3,5,445,24,0,56,3,4,24,-24};
		
		/**********Return Index*******/
		//int res = linearSearch((array),56);
		//System.out.println(res);
		
		/*************Return Element******************/
		//int res1 = linearSearch2((array),56);
		//System.out.println(res1);
		/*************Return true /false******************/
		//boolean res2 = linearSearch3((array),56);
		//System.out.println(res2);
		
		//boolean val = searchInString("Lobo",'u');
		//System.out.println(val);
		
		//boolean res3 = searchInRange((array),2,3,56);
				//System.out.println(res3);
				
		//int res4 = searchInRangeIndex((array),2,4,56);
				//System.out.println(res4);
		
		int[][] array2D = {
				{2,54,6,7000},
				{4,23,8,9,900},
				{4,6,500}
			};
		
		//int[] val = searchIn2DArray(array2D,9);
		//System.out.println (Arrays.toString(val));
		
		//int max = maxIn2DArray(array2D);
		//System.out.println(max);
		
		//int evn = numOfDigitsEven(array);
		//System.out.println(evn);
		
		//int e = numOfEven(array);
		//System.out.println(e);
		
		int wp = welthyPerson(array2D);
		System.out.println("RIchest Customer Wealth: "+ wp);
		}
	
	//search the target and return the index
	
	//return the element if found
	//else return -1
	public static int linearSearch(int[] arr, int target) {
		
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int linearSearch2(int[] arr, int target) {
		
		if(arr.length==0) {
			return -1;
		}
		for(int element : arr) {
			if (element==target) {
				return element;
			}
		}
		
		return Integer.MAX_VALUE;
	}

	
	public static boolean linearSearch3(int[] arr, int target) {
		
		if(arr.length==0) {
			return false;
		}
		for(int element : arr) {
			if (element==target) {
				return true;
			}
		}
		
		return false;
	}

	public static boolean searchInString(String str,char target ) {

		
		
		if (str.length()==0) {
			return false;
		}
		char[] chr = str.toCharArray();
		for(char ch: chr) {
			if (target==ch) {
				return true;
			}
		}
		return false;
	}

	public static boolean searchInRange(int[] arr, int startrange, int endrange, int target) {
		
		if (arr.length==0) {
			return false;
		}
		
		for(int i=startrange;i<endrange;i++) {
			if (target==arr[i]) {
				return true;
			}
		}
		return false;
	
	}

	public static int searchInRangeIndex(int[] arr, int startrange, int endrange, int target) {
		
		if (arr.length==0) {
			return -1;
		}
		
		for(int i=startrange;i<=endrange;i++) {
			if (target==arr[i]) {
				return i;
			}
		}
		return -1;
	
	}
	
	public static int[] searchIn2DArray(int[][] arr,int target) {
		
				
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[]{row,col};
				}
				
			}
		}
		return new int[] {-1,-1};
		
	
		
	}

	
	public static int maxIn2DArray(int[][] arr) {
		
		int max = arr[0][0];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				
				if(arr[row][col]>max) {
					max = arr[row][col];
					
				}
				
			}
		}
		return max;
		
	
		
	}

	//Given a nums of integer , return how many of them contain even number of digits.
	
	//int[] num = {12,345,2,6,7896};
	public static int numOfDigitsEven(int[] arr) {
		int c = 0;
		int even = 0;
		for(int a: arr) {
			if (a==0) {
				a=1;
			}
			while(a>0) {
				a= a/10;
				c++;
			}
			if(c%2==0) {
				even ++;
				c=0;
			}
			c=0;
		}
		return even;
	}
	
	public static int digits(int num) {
		int c=0;
		while(num>0) {
			num= num/10;
			c++;
		}
		return c;
		
	}
	public static int even (int evn) {
		int even=0;
		if(evn%2==0) {
			return 1;
		}
		return even;
	}
	
	public static int numOfEven(int[] arr) {
		int evn=0;
		for(int a: arr) {
			if (a==0) {
				a=1;
			}
			evn += even(digits(a));
			
	}
		return evn;

}

public static int welthyPerson(int[][] accounts) {
	int wealth=0;
	int balance=0;
	int wealthy=0;
	int him=0;
	for(int[] person :accounts ) {
		for(int account: person) {
			balance += account;
		}
		wealth = balance;
		if(wealthy<wealth) {
			wealthy=wealth;
			// him = person;
		}
		balance=0;
	}
	return wealthy;
}



}