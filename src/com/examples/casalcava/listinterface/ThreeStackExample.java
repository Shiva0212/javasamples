package com.examples.casalcava.listinterface;

import java.util.Stack;

/*In Java, a stack is a data structure that follows the Last-In-First-Out (LIFO) principle.
 *  This means that the most recently added element to the stack is the first one to be removed.
 *   A stack has two primary operations: push, which adds an element to the top of the stack,
 *    and pop, which removes the top element from the stack.

To implement a stack in Java, we can use either an array or a linked list*/
public class ThreeStackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Stack<String> names = new Stack<>();
		names.push("shiva");
		names.push("sriansh");
		names.push("advik");
		System.out.println(names);
		while (!names.isEmpty()) {
			System.out.println(names.pop());
		}
		System.out.println(names);
	

	}

}
