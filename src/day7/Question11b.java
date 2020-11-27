package day7;

public class Question11b {

	public static void main(String[] args) {
		
		int a = 40;
		int b = 80;

		System.out.println(" value of a before swapping:" + a);
		System.out.println(" value of b before swapping:" + b);
		System.out.println("======================");

		a = a + b;//120;
		b = a - b;//40;
		a = a - b;//80;

		System.out.println(" value of a after swapping:" + a);
		System.out.println(" value of b after swapping:" + b);

	}

}
