package arrayQues;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = takeInput();
		int sum1 = findSum(arr);
		int n = arr.length + 1;
		int sum2 = n*(n+1)/2;
		int missingNumber = sum2 - sum1;
		System.out.println(missingNumber);
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

	public static int findSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}
		return sum;
	}
}