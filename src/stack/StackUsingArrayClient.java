package stack;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {
		StackUsingArray s1 = new StackUsingArray();
//		s1.push(10);
//		s1.display();
//		s1.pop();
//		s1.display();
		for (int i = 1; i <= 8; i++) {
			s1.push(i * 10);
			s1.display();
		}
		for (int i = 1; i <= 8; i++) {
			s1.pop();
			s1.display();
		}
	}

}
