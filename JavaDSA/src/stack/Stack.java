package stack;

public class Stack {

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private Node top;
	private int height;
	
	public Stack(int value) {
		Node newNode =  new Node(value);
		top = newNode;
		height = 1;
	}
	
	public void printStack() {
		Node temp = top;
		
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getTop() {
		System.out.println("Top: "+top.value);
	}
	
	public void getHeight() {
		System.out.println("Height: "+height);
	}
	
	public void push(int value) {
		Node newNode = new Node(value);
		Node temp = top;
		if(height == 0) {
			top = newNode;
		}else {
			top = newNode;
			top.next = temp;	
		}
		height++;
	}
	
	public Node pop() {
		Node temp = top;
		if(height == 0) {
			return null;
		}else {
			top = temp.next;
			temp.next = null;
		}
		height--;
		return temp;
	}

}
