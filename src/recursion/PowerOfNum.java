package recursion;

public class PowerOfNum {

	public static void main(String[] args) {
		System.out.println("***********************");
		System.out.println(PowerOfNum(2, 5));
		System.out.println("***********************");
	}
	public static int PowerOfNum(int n, int x) {
		if(x == 1) {
			return n;
		}
		return  n * PowerOfNum(n , x - 1);
	}
}
