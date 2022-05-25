package main;

import java.util.Stack;

public class Stacks {
	
	// Check if stack is empty
		static void stack_empty(Stack<Integer> stack) {
			
			if(stack.empty()) {
				System.out.println("The stack is empty.");
			} else {
				System.out.println("The stack is not empty");
			}
		}
	
	// Push element on top of the stack
	static void stack_push(Stack<Integer> stack) {
		
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
		System.out.println("Stack loaded.");
	}
	
	// Pop element from the top of the stack
	static void stack_pop(Stack<Integer> stack) {
		
		System.out.println("Pop Operation:");
		
		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y + " removed.");
		}
	}
	
	// Display element on top of stack
	static void stack_peek(Stack<Integer> stack) {
		
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}
	
	// Search element in the stack
	static void stack_search(Stack<Integer> stack, int element) {
		
		Integer position = (Integer) stack.search(element);
		
		if(position == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element is found at position: " + position);
		}	
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack_empty(stack);
		stack_push(stack);
		stack_empty(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);	
	}
}
