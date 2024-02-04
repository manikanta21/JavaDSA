package treetraversal;

import java.util.List;
import java.util.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


 class BinarySearchTree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

	public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
   
   public ArrayList<Integer> BFS(){
	   Queue<Node> queue = new LinkedList<Node>();
	   ArrayList<Integer> arrayList = new ArrayList<Integer>();
	   queue.add(root);
	   
	   while(queue.size()>0) {
		  Node currentNode = queue.remove();
		  arrayList.add(currentNode.value);
		  if(currentNode.left != null) {
			  queue.add(currentNode.left);
		  }
		  if(currentNode.right != null) {
			  queue.add(currentNode.right);
		  }
	   }
	   return arrayList;
   }

}

public class BFSCode {
	
	public static void main(String args[]) {
		
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Breadth First Search:");
        System.out.println(myBST.BFS() );
	}

}
