//39.	Write a Program to display name in short form. E.g. Ram Kishore Singh  -> R. k. Singh

package string;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
    String s = sc.nextLine();
    
    
    s=" " + s;
    int pos = s.lastIndexOf(' ');
    
    for(int i=0; i<pos; i++) {
    	if(s.charAt(i) ==' ')
    		System.out.print(s.charAt(i+1) + ".");
    }
    
    System.out.println(s.substring(pos));
	}

}
