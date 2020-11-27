package day7;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		// fahrenheit to celsius

		Scanner input = new Scanner(System.in);
		System.out.println("enter f:");
		double f = input.nextDouble();

		double c = ((f - 32) * 5) / 9;
		System.out.println("celcius is: " + c);
		input.close();

	}

}
