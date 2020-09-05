package bst;

public class BSTClient {

	public static void main(String[] args) {
		BST bt = new BST();
		 bt.insert(50);  
         bt.insert(30);  
         bt.insert(70);  
         bt.insert(60);  
         bt.insert(10);  
         bt.insert(90);  
         System.out.println(bt.find(90));
         System.out.println(bt.find(20));
         bt.insert(20);  
         System.out.println(bt.find(20));
         bt.display();
         
         System.out.println(bt.min());
         System.out.println(bt.max());


	}

}
