package hashtable;

import java.util.HashMap;

public class Main {
	
	public static boolean itemInCommon(int[] array1, int[] array2) {
		
		HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
		
		for(int i: array1) {
			hashMap.put(i, true);
		}
		
		for(int i: array2) {
			if(hashMap.get(i) != null) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String args[]) {
		HashTable hashTable = new HashTable();
		hashTable.set("manikanta",421);
		hashTable.set("harsha",422);
		hashTable.set("chandu",423);
		hashTable.set("mohan",426);
		hashTable.printTable();
		
		hashTable.get("manikanta");
		
		System.out.println(hashTable.getAllKeys());
	}

}
