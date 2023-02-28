package com.examples.casalcava.listinterface;

/*In Java, an ArrayList is a dynamic array that can grow or shrink in size as needed.
 *  It is part of the Java Collections Framework and is defined in the java.util package.
 *   An ArrayList can be used to store objects of any type, including primitives, objects, and other collections.

To use an ArrayList, you must first create an instance of the class and then add elements to it using the add method.
 You can access elements in the ArrayList using the get method, and you can remove elements using the remove method.
  The ArrayList also provides methods for checking the size of the list, checking if it contains a particular element, 
  and clearing the list.

*/

/*======

The time complexity of ArrayList operations in Java depends on the specific operation and the size of the list.
 Here are the time complexities of some common operations:

add(E element): O(1) amortized time complexity, but O(n) in worst case when the underlying array has to be resized.
add(int index, E element): O(n) time complexity as all elements from index to end will be shifted to the right.
remove(Object obj): O(n) time complexity as it requires iterating over the elements to find the object to remove.
remove(int index): O(n) time complexity as it requires shifting all the elements to the left after the removed element.
get(int index): O(1) time complexity as it just accesses the element at the specified index.
set(int index, E element): O(1) time complexity as it just replaces the element at the specified index.
The contains(Object obj) method also has a time complexity of O(n) as
 it requires iterating over the elements to check if the list contains the specified object.

It is important to note that these time complexities are for individual operations and do not take into account 
the time complexity of any other operations that may need to be performed. 
Additionally, these time complexities are based on the assumption that the ArrayList is not synchronized. 
If the ArrayList is accessed concurrently from multiple threads, 
then additional overhead may be required to ensure thread safety.
*/import java.util.ArrayList;
import java.util.List;

public class TwoArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		names.add("shiva");
		names.add("sriansh");
		names.add("srilekha");
		System.out.println(names);
		

		System.out.println(names.get(0));

		names.add(0, "atfirst");

		System.out.println(names);
	}

}
