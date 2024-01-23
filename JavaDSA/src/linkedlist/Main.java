package linkedlist;

public class Main {

	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList(4);
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(10);
		
		linkedList.printList();
		
		linkedList.prepend(1);
		
		linkedList.printList();
		linkedList.insert(3, 13);
		
		System.out.println("last element in linkedList: "+linkedList.removeLast().value);
		
		System.out.println("value at index 3: "+linkedList.get(3).value);
	}
}
