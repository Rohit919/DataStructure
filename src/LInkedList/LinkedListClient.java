package LInkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		LinkedList list1 = new LinkedList();
		list1.addLast(10);
		list1.addLast(20);
		list1.addLast(30);
		list1.addLast(40);
		list1.addFirst(50);
		list1.addFirst(60);
		list1.addAt(60, 5);
		list1.addAt(70, 0);
		list1.addAt(80, 7);
		list1.addAt(80, 8);
		list1.display();
		list1.reverseData();
		list1.display();
		list1.reversePointer();
		list1.display();
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		System.out.println(list1.getAt(3));
		System.out.println(list1.size());
	}

}
