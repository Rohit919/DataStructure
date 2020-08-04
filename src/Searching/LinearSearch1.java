package Searching;

import java.util.Scanner;

public class LinearSearch1 {

	public static void main(String[] args) {
		int arr[] = takeInput();
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int index = linearSearch(arr, data);
		if(index >= 0) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Element not found");
		}

	}
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :- ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static int linearSearch (int[] arr, int data) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

}
