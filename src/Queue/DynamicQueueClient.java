package Queue;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		DynamicQueue q1 = new DynamicQueue();
		for (int i = 1; i <= 50; i++) {
			q1.enqueue(i * 10);
			q1.display();
		}
		for (int i = 1; i <= 50; i++) {
			q1.dequeue();
			q1.display();
		}
	}

}
