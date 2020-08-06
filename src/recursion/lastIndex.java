package recursion;

public class lastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 7, 8, 6, 8, 8, 5, 5, 6, 9, 8, 10};
		int data = 8;
		System.out.println(lastIndex(arr, 0, 8));
	}
	public static int lastIndex(int[] arr, int si, int data) {
		if(si == arr.length) {
			return -1;
		}
		int index = lastIndex(arr, si + 1, data);
		if(index == -1) {
			if(arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return index;
		}
	}

}
