package binaryTree;

import java.util.Scanner;

public class BinaryTree1 {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
// 80 true 70 true 60 false false true 30 false false 45 false false
	private Node root;
	private int size;

	BinaryTree1() {
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, false);
	}

	private Node takeInput(Scanner sc, Node parent, boolean isLeftOrRight) {
		if(parent == null) {
			System.out.println("Enter the data for the root node : - ");
		} else {
			if(isLeftOrRight) {
				System.out.println("Enter the data for the left child of " + parent.data + " :- ");
			} else {
				System.out.println("Enter the data for the right child of " + parent.data + " :- ");
			}
		}
		int newdata = sc.nextInt();
		Node node = new Node(newdata);
		this.size++;
		boolean choice = false;
		System.out.println("Do you have a left child of" + node.data + " : - ");
		choice = sc.nextBoolean();
		if(choice) {
			node.left = takeInput(sc, node, true);
		}
		System.out.println("Do you have a right child of" + node.data + " : - ");
		choice = sc.nextBoolean();
		if(choice) {
			node.right = takeInput(sc, node, false);
		}
		return node;
	}
	public void display() {
		display(root);
	}
	
	private void display(Node node) {
		if(node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("NULL => ");
		}
		System.out.print(node.data);
		if(node.right != null) {
			System.out.println(" <= " + node.right.data );
		} else {
			System.out.println(" <= NULL");
		}
		if(node.left != null) {
			display(node.left);
		}
		if(node.right != null) {
			display(node.right);
		}
	}
	public int height() {
		return height(this.root);
	}
	public int height(Node node) {
		if(node == null) {
			return -1;
		}
		
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		
		int myheight = Math.max(lheight, rheight) + 1;
		
		return myheight;
		
	}
	public void preorder() {
		preorder(this.root);
		System.out.println("END");
	}
    private void preorder(Node node) {
    	if(node == null) {
    		return ;
    	}
    	System.out.print(node.data + ", ");
    	preorder(node.left);
    	preorder(node.right);
    }
    public void postorder() {
    	postorder(this.root);
    	System.out.println("END");
	}
    private void postorder(Node node) {
    	if(node == null) {
    		return ;
    	}
    	postorder(node.left);
    	postorder(node.right);
    	System.out.print(node.data + ", ");
    }
    public void inorder() {
    	inorder(this.root);
    	System.out.println("END");
	}
    private void inorder(Node node) {
    	if(node == null) {
    		return ;
    	}
    	inorder(node.left);
    	System.out.print(node.data + ", ");
    	inorder(node.right);
    }
}

