package stack;

public class Main {
	public static void main(String args[]) {
		Stack stack = new Stack(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.push(30);
		stack.printStack();
	}
}
