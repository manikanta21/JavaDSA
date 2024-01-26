package binarysearchtree;

public class BinarySearchTree {
	
	class Node{
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	Node root;
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		Node temp = root;
		if(root == null) {
			root = newNode;
			return true;
		}
		while(true) {
			if(newNode.value == temp.value) {
				return false;
			}
			if(newNode.value>temp.value) {
				if(temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}else {
				if(temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			}
		}
	}
	
	public boolean contains(int value) {
		Node temp = root;
		
		if(temp == null) {
			return false;
		}
		while(temp != null) {
			if(value > temp.value) {
				temp = temp.right;
			}else if(value < temp.value) {
				temp = temp.left;
			}else {
				return true;
			}
		}
		return false;
	}

}
