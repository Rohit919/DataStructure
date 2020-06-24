package Queue;

public class DynamicQueue extends QueueUsingArray {
	public DynamicQueue() throws Exception {
		super();
	}

	public DynamicQueue(int capacity) throws Exception {
		super(capacity);
	}
	public void enqueue(int value)  {
		if(this.size()==this.data.length) {
			int arr[] = new int[2*this.data.length];
			for(int i = 0; i < this.size; i++) {
				arr[i] = this.data[(this.front + i) % this.data.length];
			}
			this.data = arr;
		}
		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = value;
		this.size++;
	}

}
