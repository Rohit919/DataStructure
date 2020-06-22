package arrayQues;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = takeInput();
		System.out.println("Second Largest Number is :" + secondLargest(arr));
	}
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static int secondLargest(int arr[]) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
		}
		return secondLargest;
	}
}
