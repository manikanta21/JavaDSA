package heap;

public class Main {
	
	public static void main(String args[]) {
		Heap myHeap = new Heap();
		
		myHeap.insert(100);
		myHeap.insert(75);
		myHeap.insert(55);
		myHeap.insert(85);
		myHeap.insert(65);
		
		myHeap.remove();
		
		System.out.println(myHeap.getHeap());
	}

}
