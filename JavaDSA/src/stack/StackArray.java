package stack;

import java.util.ArrayList;

//In the Stack: Intro video we discussed how stacks are commonly implemented using an ArrayList instead of a Linked List.
//
//Write the push method to add an item onto a stack that is implemented with an ArrayList.
//
//We will modify the Stack class to be able to store multiple data types by using a generic parameter type <T>. 
//This will allow the class to hold Integers, Characters or any other data type.
//
//Return type: void

public class StackArray<T> {
	
	private ArrayList<T> arrayList = new ArrayList<>();
	
	public ArrayList<T> getStackList(){
		return arrayList;
	}
	
	public void printStack() {
		for(int i=arrayList.size()-1;i>=0;i--) {
			System.out.println(arrayList.get(i));
		}
	}
	
	public boolean isEmpty() {
		return arrayList.size() == 0;
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}else {
			return arrayList.get(arrayList.size()-1);
		}
	}
	
	public int size() {
		return arrayList.size();
	}
	
	public void push(T value) {
		arrayList.add(value);
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}else {
			return arrayList.remove(arrayList.size()-1);
		}
	}

}
