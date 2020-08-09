package recursion;

public class indices {

	public static void main(String[] args) {
		int[] arr = {1, 2, 7, 8, 6, 8, 8, 5, 5, 6, 9, 8, 10};
		int data = 8;
		int[] arr1 = allIndices(arr, 0, data, 0);
//		System.out.println(listOfIndex(arr, 0, 8, 0));
	}
	public static int[] allIndices(int[] arr,int i,int data,int count) {
		
		if(i==arr.length) {
			int[] br=new int[count];
			return br;
		}
		int[] indices=null;
		if(arr[i]==data) {
			indices=allIndices(arr, i+1, data,count+1);
		}else {
			indices=allIndices(arr, i+1, data,count);
		}
		
		if(arr[i]==data) {
			indices[count]=i;
		}
		return indices;
	}

}
