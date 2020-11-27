//40.	Write a program to reverse the string.

package string;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();

		int length = name.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of" + name + "is:" + rev);
	}

}
