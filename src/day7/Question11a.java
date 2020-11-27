package day7;

public class Question11a {

	public static void main(String[] args) {

		int a = 40;
		int b = 80;

		System.out.println(" value of a before swapping:" + a);
		System.out.println(" value of b before swapping:" + b);
		System.out.println("======================");

		int temp = a;
		a = b;
		b = temp;

		System.out.println(" value of a after swapping:" + a);
		System.out.println(" value of b after swapping:" + b);

	}

}
