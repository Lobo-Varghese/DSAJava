package workshop;

import java.util.Arrays;

public class cyclicSort {
	
	// arr = {3,5,4,1,2}
	
	public static void sort(int[] arr) {
		int i=0;
		while(i<arr.length-1) {
			int correctIndex = arr[i]-1;
			if(arr[i] != arr[correctIndex]) {
				swap(arr,i,correctIndex);
			}else {
				i++;
		}
	}
		
}
	
	public static void swap(int[] arr, int first,int second) {
		int temp= arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {3,5,4,6,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
