package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = arrayInput();
		int index = binarySearch(arr);
		if(index >= 0) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Element not found");
		}
	}

	public static int[] arrayInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of array : -");
		int num = sc.nextInt();
		System.out.println("Enter The element of array : -");
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}
	public static int binarySearch(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element: -");
		int ele = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}

}
