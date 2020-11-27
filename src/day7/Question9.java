package day7;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		//pounds to kg
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter p:");
		double p = input.nextDouble();

		double k = p/2.205;
		System.out.println("kilogram is: " + k);
		input.close();

	}

}
