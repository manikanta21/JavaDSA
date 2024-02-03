package recursion;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;

public class RecursiveBinarySearchTree {
	
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
	
	public boolean rContains(int value) {
		return rContains(root, value);
	}
	
	private boolean rContains(Node currentNode, int value) {
		if(currentNode == null) {
			return false;
		}
		if(value == currentNode.value) {
			return true;
		}
		if(value>currentNode.value) {
			return rContains(currentNode.right,value);
					
		}
		if(value<currentNode.value) {
			return rContains(currentNode.left,value);
		}
		return false;
	}
	
	public void rInsert(int value) {
		if(root == null) {
			root = new Node(value);
		}
		rInsert(root, value);
	}
	
	private Node rInsert(Node currentNode, int value) {
		if(currentNode == null) {
			return new Node(value);
		}
		if(value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		}else if(value > currentNode.value) {
			currentNode.right = rInsert(currentNode.right, value);
		}
		return currentNode;
	}
	
	public void deleteNode(int value) {
		root = deleteNode(root, value);
	}
	
	private Node deleteNode(Node currentNode, int value) {
		if(currentNode == null) {
			return null;
		}
		if(value < currentNode.value) {
			currentNode.left = deleteNode(currentNode.left,value);
		}else if(value > currentNode.value) {
			currentNode.right = deleteNode(currentNode.right, value);
		}else {
			if(currentNode.left == null && currentNode.right == null) {
				return null;
			}else if(currentNode.left == null) {
				currentNode = currentNode.right;
			}else if(currentNode.right == null) {
				currentNode = currentNode.left;
			}else {
				int minValue = minValue(currentNode.right);
				currentNode.value = minValue;
				currentNode.right = deleteNode(currentNode.right, minValue);
			}
		}
		return currentNode;
	}
	
	private int minValue(Node currentNode) {
		while(currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}

}
