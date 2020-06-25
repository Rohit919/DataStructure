package LInkedList;

public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		System.out.println("-----------------------------------");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("END");
		System.out.println("-----------------------------------");
	}

	public int size() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.size;
	}

	public void addLast(int item) {
		// Create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// Attach and Summary Update
		if (this.size == 0) {
			this.head = nn;
		} else {
			this.tail.next = nn;
		}
		this.tail = nn;
		this.size++;
	}

	public void addFirst(int item) {
		// Create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// Attach and Summary Update
		if (this.size == 0) {
			this.tail = nn;
		} else {
			nn.next = this.head;
		}
		this.head = nn;
		this.size++;
	}

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (this.size < index || this.size < 0) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (this.size < index || this.size < 0) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int item, int index) throws Exception {
		if (this.size < index || index < 0) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			addFirst(item);
		} else if (index == this.size) {
			addLast(item);
		} else {
			// Create node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// Attach and Summary Update
			Node nm = getNodeAt(index - 1);
			Node np = getNodeAt(index);
			nm.next = nn;
			nn.next = np;
			this.size++;
		}

	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.tail = getNodeAt(this.size - 2);
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}

	public int removeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (this.size < index || index < 0) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			return removeFirst();
		} else if (index == this.size - 1) {
			return removeLast();
		} else {
			Node nm = getNodeAt(index - 1);
			Node nn = nm.next;
			Node np = nn.next;
			nm.next = np;
			this.size --;
			return  nn.data;
		}
	}
	public void reverseData() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		int left = 0;
		int right = this.size - 1;
		while(right > left) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
		
	}
	public void reversePointer() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		Node prev = this.head;
		Node curr = prev.next;
		while(curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node temp = this.head;
		this.head = tail;
		this.tail =temp;
		this.tail.next = null;
	}

}
