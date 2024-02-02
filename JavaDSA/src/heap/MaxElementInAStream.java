package heap;

import java.util.ArrayList;
import java.util.List;

//Implement a function named streamMax that processes a stream of integers and returns the maximum number encountered so far for each input number.
//This function should take in an array of integers and return a list of integers.
//Given an array of integers, your function should iterate over the array and for each number, 
//it should find the maximum number in the array up until that point, including the current number.
//The streamMax function has the following signature:
//
//public static List<Integer> streamMax(int[] nums)
//
//It accepts one parameter:
//
//nums (an array of integers): An array of integers  for each i from 0 to nums.length - 1.
//
//The function should return:
//
//A list of integers: The i-th integer in the list should be the maximum number among the first i numbers in the input array nums (1-indexed).
//Here are some examples to demonstrate the expected behavior of the streamMax function:
//
//Example 1:
//
//int[] nums = {1, 5, 2, 9, 3, 6, 8};
//List<Integer> result = streamMax(nums);
//// Expected output: [1, 5, 5, 9, 9, 9, 9]
//// Explanation: The maximum number for the first number is 1, 
//// for the first two numbers is 5, for the first three numbers is 5, and so on.
//Example 2:
//
//int[] nums = {10, 2, 5, 1, 0, 11, 6};
//List<Integer> result = streamMax(nums);
//// Expected output: [10, 10, 10, 10, 10, 11, 11]
//// Explanation: The maximum number for the first number is 10, 
//// for the first two numbers is 10, for the first three numbers is 10, and so on.
//Example 3:
//int[] nums = {3, 3, 3, 3, 3};
//List<Integer> result = streamMax(nums);
//// Expected output: [3, 3, 3, 3, 3]
//// Explanation: Since all numbers are the same, 
//// the maximum number for any prefix of the input array is always 3.
public class MaxElementInAStream {
	
	public static List<Integer> streamMax(int[] nums){
		Heap maxHeap = new Heap();
		List<Integer> maxStream = new ArrayList<Integer>();
		
		for(int i:  nums) {
			maxHeap.insert(i);
			maxStream.add(maxHeap.getHeap().get(0));
		}
		return maxStream;
	}
	
	public static void main(String args[]) {
	      // Test case 1
        int[] nums1 = {1, 5, 2, 9, 3, 6, 8};
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
        System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
        System.out.println("Actual output: " + streamMax(nums1));
        System.out.println();
	}

}
