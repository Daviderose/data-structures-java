package main;

import java.util.*;

public class MinMaxHeap {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pQueue = 
				new PriorityQueue<Integer>(/* Max Heap = <Collections.reverseOrder()>*/);
		
		pQueue.add(10);
		pQueue.add(30);
		pQueue.add(20);
		pQueue.add(400);
		
		// Print most priority element
		System.out.println("Head value using peek function: " + pQueue.peek());
		
		// Print all elements
		System.out.println("The queue elements:");
		
		Iterator itr = pQueue.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Remove head and print rest
		pQueue.poll();
		System.out.println("After removing an element with poll function:");
		
		Iterator itr2 = pQueue.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// Remove non-head node
		pQueue.remove(30);
		System.out.println("After removing 30 with remove function:");
		
		Iterator itr3 = pQueue.iterator();
		
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		// Check for element
		boolean b = pQueue.contains(20);
		System.out.println("Priority queue contains 20 or not?: " + b);
		
		// get objects from queue using toArray()
		Object[] array = pQueue.toArray();
		System.out.println("Value in array: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Value: " + array[i].toString());
		}
	}
}
