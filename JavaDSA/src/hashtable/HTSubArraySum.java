package hashtable;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and a target integer target, 
//write a method called subarraySum that finds the indices of a 
//contiguous subarray in nums that add up to the target sum using a hash table (HashMap).
//Your function should take two arguments:
//nums: an array of integers representing the input array
//target: an integer representing the target sum
//
//
//Your function should return a list of two integers representing the starting 
//		and ending indices of the subarray that adds up to the target sum. 
//		If there is no such subarray, your function should return an empty list.
//
//For example:

//int[] nums = [1, 2, 3, 4, 5]
//int target = 9
//int[] result1 = subarraySum(nums1, target1);
// 
//// This should print [1, 3]
//System.out.println("[" + result1[0] + ", " + result1[1] + "]");
//Note that there may be multiple subarrays that add up to the target sum, 
//but your method only needs to return the indices of any one such subarray.
//Also, the input array may contain both positive and negative integers.

public class HTSubArraySum {

	public static int[] subarraySum(int[] nums,int target) {
		
		Map<Integer,Integer> sumIndex = new HashMap<Integer, Integer>();
		sumIndex.put(0, -1);
		int currentSum = 0;
		
		for(int i=0;i<nums.length;i++) {
			currentSum+=nums[i];
			
			if(sumIndex.containsKey(currentSum-target)) {
				return new int[] {sumIndex.get(currentSum-target)+1,i};
			}else {
				sumIndex.put(currentSum, i);
			}
		}
		return new int[] {};
		
	}
	
	public static void main(String args[]) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
	}
}
