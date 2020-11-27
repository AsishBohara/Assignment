package BreakContinue;

import java.util.Scanner;


//31.	Write a Program display following patterns.
//1
//12
//123
//1234
//12345


public class Question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter number: ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
			System.out.println(j +" ");
		}
		
	System.out.println();
	}
	
		input.close();


	}

}
