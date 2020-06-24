package stack;

public class DynamicStack extends StackUsingArray {

	public DynamicStack() throws Exception {
		super();
	}
	public DynamicStack(int capacity) throws Exception {
		super(capacity);
	}
	public void push(int value) {
		if(this.size()==this.data.length) {
			int arr[] = new int[2*this.data.length];
			for(int i = 0; i <= top; i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
		this.top++;
		this.data[this.top] = value;
	}


}
