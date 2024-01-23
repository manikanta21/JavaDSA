package doublylinkedlist;

public class DoublyLinkedList {

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	private Node head;
	private Node tail;
	private int length;

	DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void append(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = tail;
			tail = newNode;
			temp.next = tail;
			tail.prev = temp;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			Node prev = temp.prev;
			prev.next = null;
			temp.prev = null;
		}
		length--;
		return temp;

	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		Node temp = head;

		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			head = newNode;
			head.next = temp;
			temp.prev = head;
		}
		length++;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public Node removeFirst() {
		Node temp = head;

		if (length == 0) {
			return null;
		}
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = temp.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		if (index < length / 2) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}

	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int value) {

		if (index < 0 || index > length) {
			return false;
		}
		if (index == 0) {
			prepend(value);
			return true;
		}
		if (index == length) {
			append(value);
			return true;
		}
		Node current = get(index);
		Node newNode = new Node(value);

		Node prev = get(index - 1);
		prev.next = newNode;
		newNode.prev = prev;
		newNode.next = current;
		current.prev = newNode;
		length++;
		return true;

	}

	public Node remove(int index) {
		Node temp = get(index);
		if (index == 0) {
			return removeFirst();
		}
		if (index == length) {
			return removeLast();
		}
		Node prev = temp.prev;
		Node after = temp.next;

		prev.next = after;
		after.prev = prev;
		temp.next = null;
		temp.prev = null;
		length--;
		return temp;
	}

}
