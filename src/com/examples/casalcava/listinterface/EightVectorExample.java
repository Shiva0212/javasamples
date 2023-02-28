package com.examples.casalcava.listinterface;

import java.util.Vector;

/*Vector is similar to ArrayList in that it provides a resizable array data structure that can store objects.
 *  However, Vector is thread-safe and synchronized, which means that it can be used safely in multi-threaded environments.
 *   However, this synchronization overhead can lead to performance issues in highly concurrent environments.

Overall, Vector is a useful data structure for situations where thread safety is a concern,
 but it may not be the best choice for applications that require high-performance concurrent access.
*/
public class EightVectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a vector of strings
		Vector<String> vector = new Vector<>();

		// add elements to the vector
		vector.add("foo");
		vector.add("bar");
		vector.add("baz");

		// get the size of the vector
		int size = vector.size();
		System.out.println("Size of vector: " + size);

		// get the element at index 1
		String element = vector.get(1);
		System.out.println("Element at index 1: " + element);

		// remove the element at index 2
		vector.remove(2);
		System.out.println("Vector after removing element at index 2: " + vector);

	}

}
