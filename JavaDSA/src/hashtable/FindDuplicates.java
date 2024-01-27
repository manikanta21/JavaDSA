package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Problem: Given an array of integers nums, 
//find all the duplicates in the array using a hash table (HashMap).
//
//Input:
//
//An array of integers nums.
//Return Type:
//List<Integer> implemented as an ArrayList
//List is an interface and ArrayList is a way of implementing the List interface
//For more information about interfaces click on "Hints".

public class FindDuplicates {

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> duplicates = new ArrayList<Integer>();
		HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();

		for (int i : nums) {
			numCounts.put(i, numCounts.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}
		return duplicates;
	}

//	You have been given a string of lowercase letters.
//	Write a function called firstNonRepeatingChar(String) that finds the first non-repeating character in the given string using a hash table (HashMap). 
//If there is no non-repeating character in the string, the function should return null.
//	For example, if the input string is "leetcode", the function should return "l" because "l" is the first character that appears only once in the string.
//Similarly, if the input string is "hello", the function should return "h" because "h" is the first non-repeating character in the string.
//	Return type: Character  hello

	public static Character firstNonRepeatingChar(String input) {
		char[] keyChars = input.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (char ch : keyChars) {
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}
		for (char ch : keyChars) {
			if (hashMap.get(ch) == 1) {
				return ch;
			}
		}
		return null;
	}

	public static void main(String args[]) {

		int[] nums = { 1, 2, 5, 6, 8, 10, 7, 10, 7, 8 };

		System.out.println(findDuplicates(nums));

		System.out.println(firstNonRepeatingChar("leetcode"));
		System.out.println(firstNonRepeatingChar("hello"));
		System.out.println(firstNonRepeatingChar("aabbcc"));
	}

}
