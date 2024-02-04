package treetraversal;

import java.util.ArrayList;

public class DFScode {
	
       class BinarySearchTree{
    	   public Node root;
    	   
    	   class Node{
    		   private int value;
    		   private Node left;
    		   private Node right;
    		   
    		   Node(int value){
    			   this.value = value;
    		   }
    	   }
    	   
    	   public Node getRoot() {
    		   return root;
    	   }
    	   
    	   public boolean insert(int value) {
    		   Node newNode = new Node(value);
    		   
    		   if(root == null) {
    			   root = newNode;
    			   return true;
    		   }
    		   Node temp = root;
    		   while(true) {
    			   if(value == temp.value) {
    				   return false;
    			   }
    			   if(value > temp.value) {
    				   if(temp.right == null) {
    					   temp.right = newNode;
    					   return true;
    				   }
    				   temp = temp.right;
    			   }else if(value < temp.value) {
    				   if(temp.left == null) {
    					   temp.left = newNode;
    					   return true;
    				   }
    				   temp = temp.left;
    			   }
    			   
    		   }
    	   }
    	   
    	   public boolean contains(int value) {
    		   if(root == null) {
    			   return false;
    		   }
    		   Node temp = root;
    		   
    		   while(temp != null) {
    			   if(value == temp.value) {
    				   return true;
    			   }
    			   if(value < temp.value) {
    				   temp = temp.left;
    			   }else if(value > temp.value) {
    				   temp = temp.right;
    			   }
    		   }
    		   return false;
    	   }
    	   
    	   public ArrayList<Integer> DFScode(){
    		   ArrayList<Integer> arrayList = new ArrayList<Integer>();
    		   
    		   class Traverse{
    			    public Traverse(Node currentNode) {
						arrayList.add(currentNode.value);
						
						if(currentNode.left != null) {
							new Traverse(currentNode.left);
						}
						if(currentNode.right != null) {
							new Traverse(currentNode.right);
						}
					}
    		   }
    		   new Traverse(root);
    		   return arrayList;
    	   }
    	   public ArrayList<Integer> DFSPostOrder(){
    		   ArrayList<Integer> arrayList = new ArrayList<Integer>();
    		   
    		   class Traverse2{
    			   public Traverse2(Node currentNode) {
    				   if(currentNode.left != null) {
    					   new Traverse2(currentNode.left);
    				   }
    				   if(currentNode.right != null) {
    					   new Traverse2(currentNode.right);
    				   }
    				   arrayList.add(currentNode.value);
    			   }
    		   }
    		   new Traverse2(root);
    		   return arrayList;
    	   }
    	   
    	   public ArrayList<Integer> DFSInOrder(){
    		   ArrayList<Integer> arrayList = new ArrayList<Integer>();
    		   
    		   class Traverse3{
    			   public Traverse3(Node currentNode) {
					  if(currentNode.left != null) {
						  new Traverse3(currentNode.left);
					  }
					  arrayList.add(currentNode.value);
					  if(currentNode.right != null) {
						  new Traverse3(currentNode.right);
					  }
				}
    		   }
    		   new Traverse3(root);
    		   return arrayList;
    	   }
    	 
       }
       
       
       public static void main(String args[]) {
    	   
           DFScode dfsCode = new DFScode();
           BinarySearchTree myBST = dfsCode.new BinarySearchTree();

           myBST.insert(47);
           myBST.insert(21);
           myBST.insert(76);
           myBST.insert(18);
           myBST.insert(27);
           myBST.insert(52);
           myBST.insert(82);

           System.out.println("DFS InOrder:");
           System.out.println( myBST.DFSInOrder() );

           /*
               EXPECTED OUTPUT:
               ----------------
               DFS InOrder:
               [18, 21, 27, 47, 52, 76, 82]

           */
           
           System.out.println("DFS PostOrder:");
           System.out.println( myBST.DFSPostOrder() );

           /*
               EXPECTED OUTPUT:
               ----------------
               DFS PostOrder:
               [18, 27, 21, 52, 82, 76, 47]

           */
           
           System.out.println("DFS PreOrder:");
           System.out.println( myBST.DFScode() );

           /*
               EXPECTED OUTPUT:
               ----------------
               DFS PreOrder:
               [47, 21, 18, 27, 76, 52, 82]

           */
    	   
       }
}
