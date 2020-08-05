package recursion;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************************");
		System.out.println(SumOfNum(4));
		System.out.println("*************************");
	}
	public static int SumOfNum(int n) {
		if(n == 0) {
			return 1;
		}
		return  n + SumOfNum(n - 1);
	}

}
