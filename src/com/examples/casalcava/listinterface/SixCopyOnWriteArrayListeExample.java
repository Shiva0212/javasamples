package com.examples.casalcava.listinterface;

import java.util.concurrent.CopyOnWriteArrayList;

/*In Java, CopyOnWriteArrayList is a thread-safe variant of ArrayList where all mutative operations 
(e.g., add, set, remove) are implemented by making a fresh copy of the underlying array. 
This means that any read operations on the list are always guaranteed to see a consistent snapshot 
of the list at some point in time, regardless of any concurrent updates being made to the list by other threads.*/

public class SixCopyOnWriteArrayListeExample {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

		// Create two threads that add elements to the list
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000000; i++) {
				list.add(i);
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000000; i++) {
				list.add(i);
			}
		});

		// Start the threads
		thread1.start();
		thread2.start();

		// Wait for the threads to finish

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Print the size of the list
		System.out.println("Size of list: " + list.size());
	}
}
