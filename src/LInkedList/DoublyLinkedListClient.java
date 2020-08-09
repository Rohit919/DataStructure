package LInkedList;

public class DoublyLinkedListClient {

	public static void main(String[] args) throws Exception {
		DoublyLinkedList list1 = new DoublyLinkedList();
		list1.addLast(10);
		System.out.println(list1.getSize());
		list1.addLast(20);
		list1.addLast(30);
		list1.addLast(40);
		list1.addFirst(9);
		System.out.println(list1.getSize());
		list1.addFirst(8);
		list1.addAt(20, 4);
		System.out.println(list1.getSize());
		list1.display();
		System.out.println(list1.getSize());
		list1.addLast(40);
		list1.addLast(40);
		list1.display();

	}

}
