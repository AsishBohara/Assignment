package Array;

import java.util.Scanner;

public class Question35 {
	
	//35.	Write a function to find the second largest number in a given array.


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = input.nextInt();
		
		int[]arr = new int[size];
		for(int i =0; i < arr.length; i++) {
			System.out.println("Enter an element: ");
			arr[i]=input.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if (arr [i] > arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
					
					System.out.println("Second largest element is: "+ arr[size - 2]);
				}
				
			
			
			
			
			
			
			
			
			
			
			
		}
		

	


