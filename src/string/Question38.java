package string;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your String");
		String s = input.next();
        String org_s =s;
        
       
		
        String rev ="";
		
		for(int i = s.length()-1; i>=0; i--) {
			rev= rev+s.charAt(i);
			
		}
		
		if(s.equals(rev)) {
			
			System.out.println("palindrome String");
		}
		else {
			System.out.println("Not a palindrome String");
		}
		
	}

}
