package com.examples.paall.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
//Output of this program will be
//Time taken with ArrayDeque: 24ms
//Time taken with Stack: 39ms

//Because ArrayDeque is not sunchronized on the other hand stack extends vector which is synchronized

//Notes
/*because Stack is synchronized (because it extends the Vector class) 
this is why it is going to be slower than the ArrayDeque solution. 
So it is advisable to use ArrayDeque if we are after a LIFO structure.*/
public class ArrayDequeStackPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> stack = new ArrayDeque<>();

		long now = System.currentTimeMillis();

		for (int i = 0; i < 500000; i++)
			stack.push(i);

		while (!stack.isEmpty())
			stack.pop();

		System.out.println("Time taken with ArrayDeque: " + (System.currentTimeMillis() - now) + "ms");

		Stack<Integer> stack2 = new Stack<>();

		now = System.currentTimeMillis();

		for (int i = 0; i < 500000; i++)
			stack2.push(i);

		while (!stack2.isEmpty())
			stack2.pop();

		System.out.println("Time taken with Stack: " + (System.currentTimeMillis() - now) + "ms");

	}

}
