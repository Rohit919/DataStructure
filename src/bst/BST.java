package bst;

public class BST {
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

	private Node root;
	private int size = 0;

	public BST() {
		this.root = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		} else {
			Node current = root, parent = null;

			while (true) {
				parent = current;

				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				}

				else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	

	public boolean find(int data) {
		Node current = root;
		while (true) {

			if (data < current.data) {
				current = current.left;
				if (current == null) {
					return false;
				}
			}

			else if (data > current.data) {
				current = current.right;
				if (current == null) {
					return false;
				}
			} else {
				return true;
			}
		}

	}
	
	
	
	 public int min() {
		 return minNode(root).data;
	 }
	 private Node minNode(Node root) {  
         if (root.left != null)  
             return minNode(root.left);  
         else  
             return root;  
     }
	 
	 
	 
	 public int max() {
		 return maxNode(root).data;
	 }
	 private Node maxNode(Node root) {  
         if (root.right != null)  
             return maxNode(root.right);  
         else  
             return root;  
     }  
	 
	 
	 

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("NULL => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.println(" <= " + node.right.data);
		} else {
			System.out.println(" <= NULL");
		}
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}

}
