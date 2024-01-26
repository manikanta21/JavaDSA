package stack;

public class Main2 {
//	The reverseString method takes a single parameter String, which is the string you want to reverse.
//	Return a new String with the letters in reverse order.
//	This method will be written in the same class as the main method so it will be static.  For more information on static methods click on "Hints."
//	This will use the Stack class we created in the last two coding exercises:
	
	public static String reverseString(String input) {
		
		StackArray<Character> stackArray = new StackArray<Character>();
		String reverseString = "";
		
		for(char ch:input.toCharArray()) {
			stackArray.push(ch);
		}
		
		while(!stackArray.isEmpty()) {
			reverseString += stackArray.pop();
		}
		return reverseString;
		
	}
	
//	Check to see if a string of parentheses is balanced or not.
//	By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order. For example, the string "((()))" has three pairs of balanced parentheses, 
//	so it is a balanced string. On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.  Also, the string ")"
//			+ "(" is not balanced because the close parenthesis needs to follow the open parenthesis.
//	Your program should take a string of parentheses as input and return true if it is balanced, or false if it is not.  In order to solve this problem, use a Stack data structure.
	
	public static boolean isBalancedParentheses(String input) {
		StackArray<Character> stackArray = new StackArray<Character>();
		
		for(char ch:input.toCharArray()) {
			if(ch == '(') {
				stackArray.push(ch);
			}
			else if(ch == ')') {
				if(stackArray.isEmpty() || stackArray.pop() != '(') {
					return false;
				}
			}
		}
		return stackArray.isEmpty();
	}
	
     public static void main(String args[]) {
    	 StackArray<Integer> stackArray = new StackArray<>();
    	 stackArray.push(21);
    	 stackArray.push(42);
    	 stackArray.push(63);
    	 stackArray.push(84);
    	 
    	 stackArray.printStack();
    	 
    	 System.out.println(stackArray.peek());
    	 
    	 String myString = "hello";
    	 String reverseString = reverseString(myString);
    	 
    	 System.out.println(reverseString);
    	 
    	 System.out.println(isBalancedParentheses("((()))"));
     }
}
