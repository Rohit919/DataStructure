package recursion;

public class FirstIndex {
	public static void main(String[] args) {
		int[] arr = {1, 2, 7, 8, 6, 8, 8, 5, 5, 6, 9, 8, 10};
		int data = 8;
		System.out.println(firstIndex(arr, 0, 8));
	}
	public static int firstIndex(int[] arr, int si, int data) {
		if(si == arr.length) {
			return -1;
		}
		if(arr[si] == data) {
			return si;
		} else {
			return firstIndex(arr, si + 1, data);
		}
	}
}
