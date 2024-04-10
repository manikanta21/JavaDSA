import java.util.*;

//HT: First Non-Repeating Character ( ** Interview Question)
//You have been given a string of lowercase letters.
//
//Write a function called firstNonRepeatingChar(String) that finds the first non-repeating character in the given string using a hash table (HashMap).
//If there is no non-repeating character in the string, the function should return null.
//
//For example, if the input string is "leetcode", the function should return "l" because "l" is the first character that appears only once in the string. Similarly, 
//		if the input string is "hello", the function should return "h" because "h" is the first non-repeating character in the string.
//
//Return type: Character

public class FirstNonRepeatingChar {
    
    public static Character firstNonRepeatingChar(String input){
        Map<Character,Integer> hashMap = new HashMap<Character,Integer>();
        //chars[] charArray = input.toCharArray();
        
        for(int i=0;i<input.length();i++){
            hashMap.put(input.charAt(i), hashMap.getOrDefault(input.charAt(i), 0)+1);
        }
        for(int i=0;i<input.length();i++){
            if(hashMap.get(input.charAt(i)) == 1){
                return input.charAt(i);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
        
    }
    
}
