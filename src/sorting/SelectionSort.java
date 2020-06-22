package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = takeInput();
		selectionSort(arr);
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

	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, j, i);
				}
			}
		}
	}

	public static void swap(int arr[], int j, int i) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
