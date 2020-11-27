package day7;

import java.util.Scanner;

public class Question10a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter u: ");
		double u = input.nextDouble();
		System.out.println("Enter t: ");
		double t = input.nextDouble();
		System.out.println("Enter a: ");
		double a = input.nextDouble();

		double s = (u * t) + (a * t * t) / 2;
		System.out.println("area is: " + s);
		input.close();

	}

}
