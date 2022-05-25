package main;

import java.util.Stack;

public class Queues {
	
	/* Enqueue(q, x):
	 * 1) Push x to stack1 assuming size is unlimited
	 * 
	 * Dequeue(q)
	 * 1) If both stacks empty return error
	 * 2) If stack2 empty:
	 * 		While stack1 is not empty, push everything from stack1 to stack2
	 * 3) Pop the element from stack2 and return it.*/
	
	static class Queue {
		static Stack<Integer> stack1;
		static Stack<Integer> stack2;
	}
	
	// Push item into a stack
	static void push(Stack<Integer> top_ref, int new_data) {
		
		top_ref.push(new_data);
	}
	
	// Pop an item from a stack
	static int pop(Stack<Integer> top_ref) {
		
		if (top_ref.isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		return top_ref.pop();
	}

	static void enQueue(Queue q, int x) {
		
		push(q.stack1, x);
	}
	
	static int deQueue(Queue q) {
		
		int top;
		
		if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
		}
		
		if (q.stack2.isEmpty()) {
			while (!q.stack1.isEmpty()) {
				top = pop(q.stack1);
				push(q.stack2, top);
			}
		}
		
		top = pop(q.stack2);
		return top;
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.stack1 = new Stack<>();
		q.stack2 = new Stack<>();
		enQueue(q, 1);
		enQueue(q, 2);
		enQueue(q, 3);
		
		System.out.print(deQueue(q) + " ");
		System.out.print(deQueue(q) + " ");
		System.out.println(deQueue(q) + " ");
	}
}
