package linkedlist;

public class LinkedList {

	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	private Node head;
	private Node tail;
	private int length;
	
	LinkedList(int value){
		Node newNode = new Node(value);
		this.head = newNode;
		this.tail = newNode;
		length = 1;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLast() {
		if(length == 0) {
			return null;
		}
		Node temp = head;
		Node pre = head;
		
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if(length == 0) {
			tail = null;
			head= null;
		}
		return temp;
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
		length++;
	}
	
	public Node removeFirst() {
		if(length == 0) {
			return null;
		}
		Node temp = head;
		head = temp.next;
		temp.next = null;
		length--;
		if(length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	
	public Node get(int index) {
		if(index<0 || index>=length) {
			return null;
		}
		Node temp = head;
		for(int i= 0; i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		Node node = get(index);
		if(node != null) {
			node.value = value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int value) {
		if(index<0 || index>length) {
			return false;
		}
		if(index == 0) {
			prepend(value);
			return true;
		}
		if(index == length) {
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node after = get(index);
		Node before = get(index-1);
		before.next = newNode;
		newNode.next = after;
		length++;
		return true;
	}
	
	public Node remove(int index) {
		if(index<0 || index>=length) {
			return null;
		}
		if(index == 0) {
			return removeFirst();
		}
		
		if(index == length-1) {
			return removeLast();
		}
		
		Node pre = get(index-1);
		Node current = get(index);
		Node after = get(index+1);
		
		pre.next = after;
		current.next = null;
		length --;
		return current;
	}
}
