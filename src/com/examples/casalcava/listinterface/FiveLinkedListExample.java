package com.examples.casalcava.listinterface;

import java.util.LinkedList;

/*In Java, a linked list is a linear data structure where each element is a separate object (called a node) that contains a 
data field and a reference (or pointer) to the next node in the list. 
*/

//linkedlist uses double linked list because internally it uses list and
// deque
// hence we can do addFirst ,addLast, removeFirst,removeLast, remove at
// specoified index etx



/*The time complexity of operations on a linked list depends on the specific operation and the implementation of the linked list. Here are the time complexities of common operations on a singly linked list:

Accessing an element by index (get()) - O(n)

To access an element at a specific index, we need to traverse the list from the head node to the node at the desired index, which takes O(n) time in the worst case.
Adding an element to the beginning of the list (addFirst()) - O(1)

To add an element to the beginning of the list, we simply create a new node, set its next reference to the current head node, and set the head reference to the new node. This takes constant time, regardless of the size of the list.
Adding an element to the end of the list (addLast() or add()) - O(1)

To add an element to the end of the list, we simply create a new node and set the next reference of the last node in the list to the new node. This takes constant time, regardless of the size of the list.
Removing an element from the beginning of the list (removeFirst()) - O(1)

To remove the first element from the list, we simply set the head reference to the next node in the list. This takes constant time, regardless of the size of the list.
Removing an element from the end of the list (removeLast()) - O(n)

To remove the last element from the list, we need to traverse the list from the head node to the second-to-last node,
 which takes O(n) time in the worst case.
In summary, the time complexity of operations on a linked list can vary depending on the specific operation 
and the implementation of the linked list. 
Accessing an element by index takes O(n) time in the worst case, 
while adding or removing an element from the beginning or end of the list takes O(1) time.
*/public class FiveLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(3);
		list.add(56);
		list.remove(1);
		System.out.println(list);

	}

}
