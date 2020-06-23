package Queue;

public class QueueUsingArrayClient {

	public static void main(String[] args) throws Exception {
		QueueUsingArray q1 = new QueueUsingArray();
//		q1.enqueue(10);
//		q1.display();
		for (int i = 1; i <= 8; i++) {
			q1.enqueue(i * 10);
			q1.display();
		}
		for (int i = 1; i <= 8; i++) {
			q1.dequeue();
			q1.display();
		}

	}

}
