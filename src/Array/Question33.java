package Array;

public class Question33 {
	
	//33.	Write a Program to display numbers in ascending order in array.

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 20, 45, 44, 32, 78, 65, 49, 30, };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);

		}

	}
}
