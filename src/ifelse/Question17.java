package ifelse;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = input.nextInt();

		// If any year that is divisible by 400 is leap year

		if (year % 400 == 0) {
			System.out.println("Leap Year");

			// If any year that is divisible by 4 and not divisible by 100 is leap year

		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year");

			// not a leap year

		} else {
			System.out.println("Not a Leap Year");
			;
			input.close();
		}
	}

}
