package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//You are given a list of integers, myList, 
//where some of the elements may be repeated. 
//Your task is to write a Java method that removes all duplicate elements from the list and returns a new list containing only the unique elements.
//
//The method signature should be as follows:
//public static List<Integer> removeDuplicates(List<Integer> myList);
//Input:
//A List<Integer> called myList
//Output:
//A List<Integer> containing the unique elements from myList in any order.
//Example:
//
//Input:
//
//myList = [1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5]
//Output:
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
public class RemoveDuplicates {

	public static List<Integer> removeDuplicates(List<Integer> myList){
		HashSet<Integer> hashSet = new HashSet<Integer>(myList);
		return new ArrayList<Integer>(hashSet);
		
	}
	
	public static void main(String args[]) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);  myList.add(1); myList.add(5); myList.add(6);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);
	}
}
