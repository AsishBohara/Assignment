package day7;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		// perimeter of circle

		final double PI = Math.PI;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter r: ");
		double r = input.nextDouble();

		double perimeterofcircle = 2 * PI * r;
		System.out.println("perimeter of circle " + perimeterofcircle);

		// perimeter of triangle

		System.out.println("Enter  a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();

		double perimeteroftriangle = a + b + c;
		System.out.println("perimeter of triangle is: " + perimeteroftriangle);

		// perimeter of rectangle

		System.out.println("Enter  l: ");
		double l = input.nextDouble();
		System.out.println("Enter w: ");
		double w = input.nextDouble();

		double perimeterofrectangle = 2 * (l + w);
		System.out.println("perimeter of rectangle is: " + perimeterofrectangle);
		input.close();

	}

}
