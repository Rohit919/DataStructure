package recursion;

public class PIPDandPDI {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		PD(5);
		System.out.println("------------------------------");
		PI(5);
		System.out.println("------------------------------");
		PDI(5);
		System.out.println("------------------------------");
		PDISkip(5);
		System.out.println("------------------------------");
	}
	public static void PD(int n) {
		if(n < 1) {
			return ;
		}
		System.out.println(n);
		PD(n - 1);
	}
	public static void PI(int n) {
		if(n < 1) {
			return ;
		}
		PI(n - 1);
		System.out.println(n);
	}
	public static void PDI(int n) {
		if(n < 1) {
			return ;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}
	public static void PDISkip(int n) {
		if(n < 1) {
			return ;
		}
		if(n % 2 != 0) {
			System.out.println(n);
		}
		PDISkip(n - 1);
		if(n % 2 == 0) {
			System.out.println(n);
		}
	}
}
