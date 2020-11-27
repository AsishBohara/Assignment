package day11;

import java.util.Scanner;

public class Question16 {
//method declaration(defination)
	public static void findEvenorodd() {
		
		
		
Scanner input = new Scanner(System.in);
System.out.println("Enter number to find even or odd");
int n = input.nextInt();
input.close();
if (n% 2 ==0) {
	System.out.println(n + "is an even number");
}else {
	System.out.println(n + " is and odd number");
}
}
	public static void main(String[]args) {
		findEvenorodd();
	}

}
