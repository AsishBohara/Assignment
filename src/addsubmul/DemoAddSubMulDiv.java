package addsubmul;

import java.util.Scanner;

public class DemoAddSubMulDiv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();
		System.out.println("sum is: " + (a + b));
		System.out.println("sub is: " + (a - b));
		System.out.println("mul is: " + (a * b));
		System.out.println("div is: " + (a / b));
		input.close();

	}

}
