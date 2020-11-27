package Array;

import java.util.Scanner;

public class Question32 {
	
	//32.	Write a Program to accept 5 values in an array and display their sum.

	public static void main(String[] args) {
	

		int[] arr = new int[] { 10, 5, 12, 15, 39 };
		for (int i = 0; i < arr.length; i++) {

		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];

		}
		System.out.println("sum of an array element is:" + sum);
		

	}

}

