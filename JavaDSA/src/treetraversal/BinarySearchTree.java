//BST: Validate BST ( ** Interview Question)
//Objective:
//
//Implement a method to validate whether a given binary tree is a correctly formed Binary Search Tree (BST).
//
//Function Signature:
//
//public boolean isValidBST()
//
//
//
//Input:
//
//The method does not take any parameters directly; instead, it operates on the binary tree structure encapsulated within the class it is a part of.
//
//Output:
//
//Returns true if the binary tree is a valid BST, according to BST properties.
//
//Returns false if the binary tree violates BST properties.
//
//BST Properties:
//
//A binary tree is considered a valid BST if, for every node in the tree, all of the following conditions hold:
//
//The left subtree of a node contains only nodes with keys less than the node's key.
//
//The right subtree of a node contains only nodes with keys greater than the node's key.
//
//Both the left and right subtrees must also be binary search trees.
//
//Method Description:
//
//In-Order Traversal:
//
//The method begins by performing an in-order traversal of the tree (DFSInOrder method is provided). 
//This process visits nodes in the left subtree, then the root node, and finally nodes in the right subtree.
//
//The result of this traversal is stored in an ArrayList<Integer>, capturing the values of the nodes in the order they were visited.
//
//Validation:
//
//The method iterates through the list of node values starting from the second element. 
//It compares each element with its predecessor to ensure that the sequence of node values is in strict ascending order, which is a direct implication of the BST properties.
//
//If at any point, a node value is found to be less than or equal to the value of its predecessor, it indicates a violation of BST properties, and the method returns false.
//
//Conclusion:
//
//If the entire list is iterated without finding any violations, the method concludes that the tree satisfies all BST properties and returns true, indicating the tree is a valid BST.
//
//Use Case:
//
//This method is particularly useful in scenarios where the integrity of the BST needs to be assured, 
//such as before performing operations that require the BST property to be maintained for efficiency or correctness, including search, insertion, deletion, and data analysis operations.

import java.util.ArrayList;
import java.util.LinkedList;


public class BinarySearchTree {

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

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        
        new Traverse(root);
        return results;
    }
    
        public boolean isValidBST() {
        ArrayList<Integer> nodeValues = DFSInOrder();
        for (int i = 1; i < nodeValues.size(); i++) {
            if (nodeValues.get(i) <= nodeValues.get(i - 1)) {
                return false; 
            }
        }
        return true;
    }

}
