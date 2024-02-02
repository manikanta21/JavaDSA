package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindPairs {
	
	public static List<int[]> findPairs(int[] array1, int[] array2, int target){
		
		HashSet<Integer> mySet = new HashSet<Integer>();
		List<int[]> pairs = new ArrayList<int[]>();
		
		for(int i: array1) {
			mySet.add(i);
		}
		
		for(int j: array2) {
			int complement = target-j;
			if(mySet.contains(complement)) {
				pairs.add(new int[] {complement,j});
			}
		}
		return pairs;
		
	}
	
	public static void main(String args[]) {
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
	}

}
