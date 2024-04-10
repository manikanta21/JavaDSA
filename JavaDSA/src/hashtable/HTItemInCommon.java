import java.util.HashMap;

//HT: Item In Common ( ** Interview Question)
//Write a function itemInCommon(array1, array2) that takes two arrays as input and returns true if there is at least one common item between the two lists, false otherwise.
//
//Use a HashMap to solve the problem that creates an O(n) time complexity.
//
//You can learn more about HashMaps by clicking here.

public class HTItemInCommon {

   public static boolean itemInCommon(int[] array1, int[] array2){
       HashMap<Integer,Boolean> hashMap = new HashMap<Integer,Boolean>();
       
       for(int i:array1){
           hashMap.put(i, true);
       }
       for(int j:array2){
           if(hashMap.get(j) != null){
               return true;
           }
       }
       return false;
       
   }
    

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */
        
    }

}
