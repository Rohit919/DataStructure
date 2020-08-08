package LInkedList;

public class LinkedList1 {
	private class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	public int size() throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		return this.size;
	}
	public void addFirst(int data) {
		//Create node
		Node nn = new Node();
		nn.data = data;
		nn.next = null;
		
		//Attached the summary and update
		if(this.size == 0) {
			this.tail = nn; 
		} else {
			nn.next = head;
		}
		this.head = nn;
		this.size++;
		
	}
	public void addLast(int data) {
		//Create node
		Node nn = new Node();
		nn.data = data;
		nn.next = null;
		
		//Attached the summary and update
		if(this.size == 0) {
			this.head = nn; 
		} else {
			this.tail.next = nn;
		}
		this.tail = nn;
		this.size++;
		
	}
	public void display() throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		System.out.println("******************************************");
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("END");
		System.out.println("******************************************");
	}
	public int getFirst() throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		return this.head.data;
	}
	public int getLast() throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		return this.head.data;
	}
	public int getAt(int index) throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		if(index <= 0 || index > this.size ) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
		
	}
	private Node getNodeAt(int index) throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		if(index <= 0 || index > this.size ) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void addAt(int data, int index) throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		if(index <= 0 || index > this.size ) {
			throw new Exception("Invalid Index");
		}
		//Create node
		Node nn = new Node();
		nn.data = data;
		nn.next = null;
		
		//Attached the summary and update
		Node nm = getNodeAt(index - 1); 
		Node np = getNodeAt(index); 
		nm.next = nn;
		nn.next = np;
		this.size++;
		
	}
	public void removeFirst() throws Exception {
		if(this.size == 0) {
			throw new Exception("List is Empty");
		}
		
	}


}
