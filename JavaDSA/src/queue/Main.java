package queue;

public class Main {
	
	public static void main(String args[]) {
		Queue myQueue = new Queue(7);
		
		myQueue.enQueue(14);
		myQueue.enQueue(21);
		myQueue.enQueue(28);
		myQueue.enQueue(35);
		
		myQueue.deQueue();
		myQueue.printQueue();
	}

}
