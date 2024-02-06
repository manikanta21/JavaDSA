package codingexercises;

//You are tasked with implementing a method, maxProfit that takes an array of integers representing the price of a given stock on different days.
//
//The method should determine the maximum profit that can be made by buying and selling the stock once. Note that you must buy before you can sell.
//
//Method Signature
//
//public static int maxProfit(int[] prices)
//
//This method takes as input an array of integers prices and returns an integer.
//
//Input
//
//An array of integers prices where each element in the array is an integer representing the price of the stock for a specific day, 
//and where the element's index corresponds to the day number.
//
//Output
//
//Returns an integer that is the maximum profit possible. If no profit can be made, the method should return 0.
//
//Example
//
//For example, if the input array is {7, 1, 5, 3, 6, 4}, the method should return 5. 
//The maximum profit can be achieved by buying the stock on day 2 when the price is 1 and selling on day 5 when the price is 6. Hence, the maximum profit is 6 - 1 = 5.
//
//Constraints
//
//You may not engage in multiple transactions (i.e., you must sell the stock before you can buy again).
//
//You may not buy and sell on the same day.


public class MaxProfit {
	
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price: prices) {
			minPrice = Math.min(minPrice, price);
			int profit = price - minPrice;
			
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}
	
	public static void main(String args[]) {
		
		int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"
        
        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
        int profit2 = maxProfit(prices2);
        System.out.println("Test case 2: Maximum profit: " + profit2); // prints "Maximum profit: 0"

        int[] prices3 = {1, 2, 3, 4, 5, 6, 7};
        int profit3 = maxProfit(prices3);
        System.out.println("Test case 3: Maximum profit: " + profit3); // prints "Maximum profit: 6"
	}

}
