package binarySearchQues;

import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		int array[] = { 3, 3, 3, 4, 5, 6, 7, 8, 9 };
		int x = 3;
		int last = BinarySearchLastOccurence(array, x);
		int first = BinarySearchFirstOccurence(array, x);
		if (last == -1)
			System.out.println("Not found");
		else
			System.out.println("Number of element " + (last - first + 1));

	}

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :- ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int BinarySearchFirstOccurence(int[] arr, int data) {
		int result = -1;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] < data) {
				low = mid + 1;
			} else if (arr[mid] > data) {
				high = mid - 1;
			} else {
				result = mid;
				high = mid - 1;
			}
		}
		return result;

	}

	public static int BinarySearchLastOccurence(int[] arr, int data) {
		int result = -1;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] < data) {
				low = mid + 1;
			} else if (arr[mid] > data) {
				high = mid - 1;
			} else {
				result = mid;
				low = mid + 1;
			}
		}
		return result;
	}

}
