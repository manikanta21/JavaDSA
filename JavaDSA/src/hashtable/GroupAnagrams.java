package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//You have been given an array of strings, where each string may contain only lowercase English letters. 
//You need to write a method groupAnagrams(String[] strings) that groups the anagrams in the array together using a hash table (HashMap). 
//The method should return a list of lists, where each inner array contains a group of anagrams.
//For example, if the input array is ["eat", "tea", "tan", "ate", "nat", "bat"], the method should return [["eat","tea","ate"],["tan","nat"],["bat"]] 
//because the first three strings are anagrams of each other, the next two strings are anagrams of each other, and the last string has no anagrams in the input array.
//You need to implement the groupAnagrams(String[] strings) method and return a list of lists, 
//where each inner list contains a group of anagrams according to the above requirements.
//
//Return type: List<List<String>>
public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strings){
		HashMap<String, List<String>> anagramGroups = new HashMap<String, List<String>>();
		
		for(String str:strings) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String canonial = new String(ch);
			if(anagramGroups.containsKey(canonial)) {
				anagramGroups.get(canonial).add(str);
			}else {
				List<String> list = new ArrayList<String>();
				list.add(str);
				anagramGroups.put(canonial, list);
			}
		}
		return new ArrayList<>(anagramGroups.values());	
	}
	
	public static void main(String args[]) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));
	}
}
