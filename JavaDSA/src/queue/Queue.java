package queue;

public class Queue {
	
   class Node{
	   int value;
	   Node next;
	   
	   Node(int value){
		   this.value = value;
	   }
   }
   
   private Node first;
   private Node last;
   private int length;
   
   Queue(int value){
	   Node newNode = new Node(value);
	   first = newNode;
	   last = newNode;
	   length = 1;
   }
   
   public void printQueue() {
	   Node temp = first;
	   
	   while(temp != null) {
		   System.out.println(temp.value);
		   temp = temp.next;
	   }
   }
   
   public void getFirstValue() {
	  System.out.println("First value: "+first.value);
   }
   
   public void getLastValue() {
	   System.out.println("Last value: "+last.value);
   }
   
   public void getLength() {
	   System.out.println("Length: "+length);
   }
   
   public void enQueue(int value) {
	   Node newNode = new Node(value);
	   Node temp = last;
	   if(length == 0) {
		   first = newNode;
		   last = newNode;
	   }else {
		   last.next = newNode;
		   last = newNode;
	   }
	   length++;
   }
   
   public Node deQueue() {
	   Node temp = first;
	   if(length == 0) {
		   return null;
	   }else {
		   first = first.next;
		   temp.next = null;
	   }
	   length--;
	   if(length == 0) {
		   last = null;
	   }
	   return temp;
   }
}
