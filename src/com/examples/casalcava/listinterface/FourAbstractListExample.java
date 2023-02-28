package com.examples.casalcava.listinterface;

import java.util.AbstractList;


/*AbstractList is an abstract class in Java that provides a skeletal implementation of the List interface. 
 * It is intended to be used as a base class for custom list implementations.
*/


/*In this example, we have created a custom list implementation called MyList that extends AbstractList.
 *  We have implemented the get(), set(), add(), remove(), and size() methods required by the List interface.

MyList uses an array to store its elements, and it dynamically resizes the array when necessary 
using the ensureCapacity() method.
*/
class MyList<E> extends AbstractList<E> {
	private Object[] data;
	private int size;

	public MyList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
		this.data = new Object[initialCapacity];
		this.size = 0;
	}

	public E get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
		}
		return (E) data[index];
	}

	public E set(int index, E element) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
		}
		E oldValue = (E) data[index];
		data[index] = element;
		return oldValue;
	}

	public void add(int index, E element) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
		}
		ensureCapacity(size + 1);
		System.arraycopy(data, index, data, index + 1, size - index);
		data[index] = element;
		size++;
	}

	public E remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
		}
		E oldValue = (E) data[index];
		int numMoved = size - index - 1;
		if (numMoved > 0) {
			System.arraycopy(data, index + 1, data, index, numMoved);
		}
		data[--size] = null;
		return oldValue;
	}

	public int size() {
		return size;
	}

	private void ensureCapacity(int minCapacity) {
		if (minCapacity > data.length) {
			int newCapacity = Math.max(data.length * 2, minCapacity);
			Object[] newData = new Object[newCapacity];
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
}

public class FourAbstractListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<String> myList = new MyList(10);
		myList.add("india");
		myList.add("japan");
		myList.add("usa");
		myList.add("polan");
		System.out.println(myList);
	}

}
