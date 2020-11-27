package day7;

import java.util.Scanner;

public class Question5c {

	public static void main(String[] args) {
		
		//Area of  Circle
		final double PI = Math.PI;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r: ");
		double r = input.nextDouble();
        
		double circle = PI * r * r;
		System.out.println("area of circle is: " + circle);
		input.close();
		
	}

}
