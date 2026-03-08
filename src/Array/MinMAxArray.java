package Array;

import java.util.Iterator;

public class MinMAxArray {

	public static void main(String[] args) {
		//Write a Java program to find the minimum and maximum element in an array

		int []arr= {10,20,30,40,50,60};
		int min=arr[0]; 
		int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
