package day7;

import java.util.Scanner;

public class Question5t {

	public static void main(String[] args) {

		// Area of Triangle
		Scanner input = new Scanner(System.in);
		System.out.println("Enter h: ");
		double h = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();

		double area = (h * b) / 2;
		System.out.println("Area of triangle is: " + area);

		// Area of Rectangle
		System.out.println("Enter w: ");
		double w = input.nextDouble();
		System.out.println("Enter l: ");
		double l = input.nextDouble();

		double areaR = w * l;
		System.out.println("area of rectangle is: " + areaR);
		input.close();

	}

}
