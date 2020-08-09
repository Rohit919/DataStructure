package LInkedList;

public class DoublyLinkedList {
	private class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public void addFirst(int data) throws Exception {
		// Create node
		Node nn = new Node(data);

		// Attach and Summary Update
		if (this.size == 0) {
			this.tail = nn;
		} else {
			head.prev = nn;
			nn.next = head;
		}
		this.head = nn;
		this.size++;
	}

	public void addLast(int data) throws Exception {
		// Create node
		Node nn = new Node(data);

		// Attach and Summary Update
		if (this.size == 0) {
			this.head = nn;
		} else {
			tail.next = nn;
			nn.prev = tail;
		}
		this.tail = nn;
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
		if (index == 0) {
			return this.head.data;
		} else if (index == this.size - 1) {
			return this.tail.data;
		} else {
			Node temp = this.head;
			for (int i = 0; i <= index; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}

	private Node getNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (index == 0) {
			return this.head;
		} else if (index == this.size - 1) {
			return this.tail;
		} else {
			Node temp = this.head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		}
	}

	public void addAt(int data, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			addFirst(data);
		} else if (index == this.size) {
			addLast(data);
		} else {
			Node nn = new Node(data);
			Node np = getNodeAt(index);
			Node nm = getNodeAt(index - 1);
			nm.next = nn;
			nn.prev = nm;
			nn.next = np;
			np.prev = nn;
			this.size++;
		}
	}

	public void display() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		Node temp = head;
		System.out.println("********************************");
		while(temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("END");
		System.out.println("********************************");
	}
	public int getsize() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.size;
	}
}
