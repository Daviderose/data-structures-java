package main;

class LinkedList {
	
	Node head; 
	
	// Linked list Node. 
	static class Node {
	
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	// Method to insert a new Node
	public static LinkedList insert(LinkedList list, int data) {
		
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;
		
		// If linked list is empty, make new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse till the last node and enter there
			Node last = list.head;
			
			while (last.next != null ) {
				last = last.next;
			}
			
			// Insert the new_node at last node
			last.next = new_node;
		}
		
		// Return the list by head
		return list;
	}
	
	// Method to print the LinkedList
	public static void printList(LinkedList list) {
		
		Node currentNode = list.head;
		
		System.out.print("LinkedList: ");
		
		// Traverse through the Linked List
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		
		printList(list);
	}
}
