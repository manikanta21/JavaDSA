package recursion;

public class Factorial {
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
	public static void main(String args[]) {
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		
		RecursiveBinarySearchTree rBst = new RecursiveBinarySearchTree();
		
		rBst.insert(15);
		rBst.insert(10);
		rBst.insert(25);
		
		rBst.deleteNode(10);
		
		System.out.println(rBst.contains(100));
	}

}
