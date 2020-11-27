package methodcall16to17;

public class Question18 {

	public static void largestValueOfThree() {
		
		int a = 6;
		int b = 9;
		int c = 8;
		
		if(a > b) {
			if(a > c) {
		System.out.println("a is the greatest");
			}
		else {
       System.out.println("c is the greatest");
	    }
		}
		else if(b > a) {
			if(b > c) {
				System.out.println("b is the greatest");
			}
			else {
				System.out.println("c is the greatest");
				}
		}
	}
		public static void main(String[] args){
			largestValueOfThree();
		 }
		 
		
}

