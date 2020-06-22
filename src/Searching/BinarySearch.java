package Searching;

public class BinarySearch {
	int binarySearch(int arr[], int elem, int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == elem) {
				return mid;
			}
			if (arr[mid] < elem) {
				return binarySearch(arr, elem, mid + 1, high);
			}
			return binarySearch(arr, elem, low, mid - 1);
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int n = array.length;
		int x = 10;
		int result = ob.binarySearch(array, x, 0, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);
	}

}
