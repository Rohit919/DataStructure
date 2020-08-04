package binarySearchQues;

import java.util.Scanner;

public class BinarySearchInBothOrder {
	public static void main(String[] args) {
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int x = 4;
		int result = -1;
		if (array[0] <= array[array.length - 1]) {
			result = BinarySearch(array, x);
		} else {
			result = BinarySearchInReverseOrder(array, x);
		}
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);

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

	public static int BinarySearchInReverseOrder(int[] arr, int data) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] > data) {
				low = mid + 1;
			} else if (arr[mid] < data) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	public static int BinarySearch (int[] arr, int data) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = low + ((high - low) / 2);
			if(arr[mid] < data) {
				low = mid + 1;
			} else if (arr[mid] > data) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
