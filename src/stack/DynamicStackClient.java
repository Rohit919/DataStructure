package stack;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		DynamicStack d1 = new DynamicStack();
		for (int i = 1; i <= 50; i++) {
			d1.push(i * 10);
			d1.display();
		}
		for (int i = 1; i <= 50; i++) {
			d1.pop();
			d1.display();
		}
	}

}

