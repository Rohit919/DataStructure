package LInkedList;

public class DoublyLinkedList {

	private class Node {
		Node prev;
		Node next;
		int data;
	}

	private Node head;
	private Node tail;
	private int size;

	public void addLast(int item) {
		// Create node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		nn.prev = null;

		// Attach and Summary Update
		if (this.size == 0) {
			nn.prev = null;
			this.head = nn;
		} else {
			nn.prev = tail;
			tail.next = nn;
		}
		this.tail = nn;
		this.size++;
	}

	public void display() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is Empty");
		} else {
			System.out.println("-----------------------------------");
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
			System.out.println("END");
			System.out.println("-----------------------------------");
		}
	}

	public void displayReverse() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is Empty");
		} else {
			System.out.println("-----------------------------------");
			Node temp = tail;
			while (temp != null) {
				System.out.print(temp.data + ", ");
				temp = temp.prev;
			}
			System.out.println("END");
			System.out.println("-----------------------------------");
		}
	}

	public void addFirst(int item) {
		// Create node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		nn.prev = null;

		// Attach and Summary Update
		if (this.size == 0) {
			nn.prev = null;
			this.head = nn;
		} else {
			nn.next = head;
			head.prev = nn;
		}
		this.head = nn;
		this.size++;
	}
	private Node getNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (this.size < index || index < 0) {
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
			nn.prev = nm;
			nn.next = np;
			np.prev = nn;
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
			this.head.prev = null;
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
			np.prev = nm;
			this.size --;
			return  nn.data;
		}
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

}
