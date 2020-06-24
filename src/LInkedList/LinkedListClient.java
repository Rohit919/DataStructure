package LInkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		LinkedList list1 = new LinkedList();
		list1.addlast(10);
		list1.addlast(20);
		list1.addlast(30);
		list1.addlast(40);
		list1.addFirst(50);
		list1.addFirst(60);
		list1.display();
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
	}

}
