package hashtable;

import java.util.Arrays;
import java.util.HashMap;

//Problem: Given an array of integers nums and a target integer target, find the indices of two numbers in the array that add up to the target.
//
//Input:
//	
//An array of integers nums .
//A target integer target.
//
//Output:
//
//An array of two integers representing the indices of the two numbers in the input array nums that add up to the target. 
//If no two numbers in the input array add up to the target, return an empty array [].
//
//Return type: int[]
//
//Input: int[] nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Explanation: The numbers at indices 0 and 1 in the array add up to the target 9.


public class HTTwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> numMap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++) {
			int complement = target - nums[i];
			
			if(numMap.containsKey(complement)) {
				return new int[] {numMap.get(complement),i};
			}
			numMap.put(nums[i], i);
		}
		return new int[] {};
		
	}
	
	public static void main(String args[]) {
	      System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
	        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
	        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
	        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
	        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
	        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
	        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
	}

}
