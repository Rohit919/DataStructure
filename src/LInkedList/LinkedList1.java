package LInkedList;

public class LinkedList1 {
	private class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	public void display() throws Exception {
		System.out.println("-------------------------------------");
		if (this.size() == 0) {
			throw new Exception("Linkedlist is empty.");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("END");
		System.out.println("-------------------------------------");
	}
	public int size() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linkedlist is empty.");
		}
		return size;
	}
	
	public void addLast(int data) throws Exception {
		//Create new node
		Node nn = new Node();
		nn.data = data;
		nn.next = null;
		
		// Attach and Summary Update
		if(this.size() == 0) {
			this.head = nn;
		} else {
			this.tail.next = nn;
		}
		this.tail = nn;
		this.size++;
	}

	public void addFirst(int data) throws Exception {
		//Create new node
		Node nn = new Node();
		nn.data = data;
		nn.next = null;
		
		// Attach and Summary Update
		if(this.size() == 0) {
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


}
