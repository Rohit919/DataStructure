package arrayQues;

import java.util.Scanner;

public class OddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		System.out.println("Odd times Number is :" + oddTimes(arr));

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
	public static int oddTimes(int arr[]) {
		int result = 0;
	      for (int i = 0; i < arr.length; i++) 
	      {
	       result = result ^ arr[i];
	      }
	      return result;
	}
}
