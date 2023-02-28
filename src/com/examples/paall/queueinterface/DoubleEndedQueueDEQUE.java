package com.examples.paall.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueueDEQUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// double ended queue (DEQUE)
		// FIFO
		// ArrayDeque<Integer> queue = new ArrayDeque<>(); or
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());

		}

		// LIFO

		// ArrayDeque<Integer> queue = new ArrayDeque<>(); or
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
