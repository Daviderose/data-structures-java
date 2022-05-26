package main;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {

	Node root;
	
	// Create Binary Tree Node. 
		static class Node {
		
			int value;
			Node left;
			Node right;
			
			public Node(int value) {
				this.value = value;
				right = null;
				left = null;
			}
		}
		
		// Start insertion from the root Node
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		// Search existing Node from the root
		public boolean containsNode(int value) {
			return containsNodeRecursive(root, value);
		}
		
		// Start deletion from the root Node
		public void delete(int value) {
			root = deleteRecursive(root, value);
		}
		
		/* Insert a value in the next available and appropriate Node
		 * 1) If the new node's value is lower than the current node's, go to left child
		 * 2) If the new node's value is greater than the current node's, go to right child
		 * 3) When the current node is null, we've reached a leaf node and can insert into that position */
		
		private Node addRecursive(Node current, int value) {
			
			if (current == null) {
				return new Node(value);
			}
			
			if (value < current.value) {
				current.left = addRecursive(current.left, value);
			} else if (value > current.value){
				current.right = addRecursive(current.right, value);
			} else {
				// Value already exists
				return current;
			}
			
			return current;
		}
		
		// Create Tree
		public BinaryTree createBinaryTree() {
			
			BinaryTree bt = new BinaryTree();
			
			bt.add(6);
			bt.add(4);
			bt.add(8);
			bt.add(3);
			bt.add(5);
			bt.add(7);
			bt.add(9);
			
			return bt;
		}
		
		// Search for existing Node
		private boolean containsNodeRecursive(Node current, int value) {
			
			if (current == null) {
				return false;
			}
			
			if (value == current.value) {
				return true;
			}
			
			// Ternary operator to recursively traverse tree
			return value < current.value ? containsNodeRecursive(current.left, value) :
				containsNodeRecursive(current.right, value);
		}
		
		/* Deleting a node. This is a multi-step process:
		 * 1) First we need to find the node to delete
		 * 2) If node has no children, replace with null
		 * 3) If node has one child, replace parent with child
		 * 4) If node has two children, reorganize tree */
		private Node deleteRecursive(Node current, int value) {
			
			if (current == null) {
				return null;
			}
			
			// If found:
			if (value == current.value) {
				
				// If Node has no children:
				if (current.left == null && current.right == null) {
					return null;
				}
				
				// If Node has one child:
				if (current.left == null) {
					return current.right;
				}
				
				if (current.right == null) {
					return current.left;
				}
				
				// If Node has two children:
				// Traverse left until smallest found
				int smallestValue = findSmallestValue(current.right);
				current.value = smallestValue;
				current.right = deleteRecursive(current.right, smallestValue);
				return current;
			}
			
			if (value < current.value) {
				current.left = deleteRecursive(current.left, value);
				return current;
			}
			
			current.right = deleteRecursive(current.right, value);
		
			return current;	
		}
		
		// find smallest value to be replacement for delete
		private int findSmallestValue(Node root) {
			return root.left == null ? root.value : findSmallestValue(root.left);
		}
		
		// Depth-First Search
		// In-Order: left > root > right
		public void traverseInOrder(Node node) {
			if (node != null) {
				traverseInOrder(node.left);
				System.out.print(" " + node.value);
				traverseInOrder(node.right);
			}
		}
		
		// Pre-Order: root > left > right
		public void traversePreOrder(Node node) {
			if (node != null) {
				System.out.print(" " + node.value);
				traversePreOrder(node.left);
				traversePreOrder(node.right);
			}
		}
		
		// Post-order: left > right > root
		public void traversePostOrder(Node node) {
			if (node != null) {
				traversePostOrder(node.left);
				traversePostOrder(node.right);
				System.out.print(" " + node.value);
			}
		}
		
		// Breadth-First Search
		public void traverseLevelOrder() {
			
			if (root == null) {
				return;
			}
			
			Queue<Node> nodes = new LinkedList<>();
			nodes.add(root);
			
			while (!nodes.isEmpty()) {
				
				Node node = nodes.remove();
				
				System.out.print(" " + node.value);
				
				if (node.left != null) {
					nodes.add(node.left);
				}
				
				if (node.right != null) {
					nodes.add(node.right);
				}
			}
		}
		
}
