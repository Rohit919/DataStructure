package recursion;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************************");
		System.out.println(fact(4));
		System.out.println("*************************");
		System.out.println(SumOfNum(4));
		System.out.println("*************************");
	}
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return  n * fact(n - 1);
	}
	public static int SumOfNum(int n) {
		if(n == 0) {
			return 1;
		}
		return  n + SumOfNum(n - 1);
	}
	

}
