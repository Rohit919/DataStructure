package binaryTree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		BinaryTree1 bt1 = new BinaryTree1();
		bt1.display();
		System.out.println(bt1.height());
		bt1.preorder();
		bt1.postorder();
		bt1.inorder();
	}

}

// 50 true 45 true 25 false false true 48 false false true 86 true 46 true 45 false false false false

