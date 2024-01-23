package doublylinkedlist;

public class Main {
	
	public static void main(String args[]) {
		DoublyLinkedList dll = new DoublyLinkedList(5);
		
		dll.append(10);
		dll.append(15);
		dll.append(20);
		dll.append(25);
		
		dll.prepend(1);
		
		dll.printList();
		
		dll.removeFirst();
		
		dll.printList();
	}
}
