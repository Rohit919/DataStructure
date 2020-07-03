package Tree;

import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	Node root = null;
	int size = 0;
	BinaryTree() {
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, false);
	}
	private Node takeInput(Scanner sc, Node parent, boolean isLeftOrRight) {
		if(parent == null) {
			System.out.println("Enter The Data For The Root Node : - ");
		} else {
			
		}
		
		return null;
	}
	

}
