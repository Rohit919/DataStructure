package sorting;

import java.util.Scanner;

public class OptimisedBubbleSort {

	public static void main(String[] args) {
		int arr[] = takeInput();
		bubbleSort(arr);
		printArray(arr);
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

	public static void printArray(int arr[]) {
		System.out.print("Output Array: - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void bubbleSort(int arr[]) {
		boolean swapped = true;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
					swapped = false ;
				}
			}
			if (swapped == true) {
				break;
			}
		}
	}

	public static void swap(int arr[], int j) {
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
	}

}
