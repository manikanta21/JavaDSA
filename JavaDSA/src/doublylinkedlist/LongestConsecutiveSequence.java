package doublylinkedlist;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutiveSequence(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i: nums) {
			set.add(i);   // 200, 1, 100, 3, 4, 2
		}
		int longestSteak = 0;
		for(int num: set) {
			if(!set.contains(num-1)) {
				int currentSteak = 1;
				int currentNum = num;
				while(set.contains(currentNum+1)) {
					currentSteak+=1;
					currentNum+=1;
				}
				longestSteak =Math.max(longestSteak, currentSteak);
			}
		}
		return longestSteak;
	}
	
	public static void main(String args[]) {
		System.out.println(longestConsecutiveSequence(new int[] {200,1,100,3,4,2}));
	}

}
