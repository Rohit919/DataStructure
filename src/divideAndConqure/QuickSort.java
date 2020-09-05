package divideAndConqure;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50, 40, 80, 60, 10, 90, 60, 20};
		quickSort(arr, 0, arr.length - 1);
		display(arr);
	}
	public static void quickSort(int[] arr, int lo, int hi) {
		
		//base case
		if(lo >= hi) {
			return;
		}
		
		//Partitioning
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		
		int left = lo;
		int right = hi;
		
		while(left <= right) {
			while(arr[left] < pivot) {
				left++;
			}
			while(arr[right] > pivot) {
				right--;
			}
			if(left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
		}
		//Smaller problems
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
		
	}
	public static void dis09play(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("END");
	}

}
