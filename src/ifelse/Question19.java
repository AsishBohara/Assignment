package ifelse;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st angle as  a: ");
		int a = input.nextInt();
		System.out.println("Enter 2nd angle as b: ");
		int b = input.nextInt();
		System.out.println("Enter 3rd angle  as c: ");
		int c = input.nextInt();
		if((a + b + c)==180)
		{
			// Angle = 90
		if(a == 90 ||b==90||c == 90)
				System.out.println("Right-Angled Triangle");
		
		//Angle > 90
		else if(a > 90 ||b > 90||c >90) 
				System.out.println("obtuse-Angled Triangle");
		//Angle < 90
	    else 
				System.out.println("Acute-Angled Triangle");
	}
		else 
			System.out.println("TRIANGLE CANNOT BE CONSTRUCTED");
		 input.close();
		}
}



