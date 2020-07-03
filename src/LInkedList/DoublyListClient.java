package LInkedList;

public class DoublyListClient {

	public static void main(String[] args) throws Exception {
		DoublyLinkedList list1 = new DoublyLinkedList();
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
		list1.displayReverse();
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		System.out.println(list1.getAt(0));
		System.out.println(list1.getAt(1));
	}

}
