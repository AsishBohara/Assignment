package day7;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		// volume of cylinder

		final double PI = Math.PI;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter r: ");
		double r = input.nextDouble();
		System.out.println("Enter h: ");
		double h = input.nextDouble();

		double v = PI * r * r * h;
		System.out.println("volume of cylinder is: " + v);
		input.close();

	}

}
