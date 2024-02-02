package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write a Java program to determine if a given string contains all unique characters or not.
//Implement a method called hasUniqueChars that takes a single argument, a string, and returns a boolean value.
//The method should return true if all characters in the input string are unique and false if there are any duplicate characters.
//Method signature: public static boolean hasUniqueChars(String string)
//
//Input:
//
//A string string
//
//Output:
//
//A boolean value indicating whether the input string contains all unique characters or not.

public class HasUniqueChars {
 
	public static boolean hasUniqueCharsUsingHashSet(String input) {
		HashSet<Character> hashSet = new HashSet<Character>();
		
		for(char ch: input.toCharArray()) {
			if(hashSet.contains(ch)) {
				return false;
			}
			hashSet.add(ch);
		}
		return true;
	}
	
	public static boolean hasUniqueCharsUsingArrayList(String input) {
		ArrayList<Character> arrayList = new ArrayList<Character>();
		
		for(char ch: input.toCharArray()) {
			arrayList.add(ch);
		}
		Map<Character, Long> map = arrayList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for(Map.Entry<Character,Long> entrySet: map.entrySet()) {
			if(entrySet.getValue()>1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		System.out.println(hasUniqueCharsUsingHashSet("leetcode"));
		
		System.out.println(hasUniqueCharsUsingHashSet("hello")); // should return false
        System.out.println(hasUniqueCharsUsingHashSet("")); // should return true
        System.out.println(hasUniqueCharsUsingArrayList("0123456789")); // should return true
        System.out.println(hasUniqueCharsUsingArrayList("abacadaeaf")); // should return false
	}


}
