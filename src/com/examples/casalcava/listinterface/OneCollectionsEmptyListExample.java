package com.examples.casalcava.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections.emptyList() is a method in Java that returns an immutable empty list. 
 * It is useful in situations where an empty list is needed, 
 * but creating a new instance of an empty list is not desirable, 
 * or where the type of the list is not known at compile-time.

Here are some common use cases for Collections.emptyList():

As a default return value: In a method that returns a list, you may want to return an empty list if there are no results to return. In this case, Collections.emptyList() can be used as the default return value.

As a placeholder: If you have a method that takes a list as a parameter, but you don't need to modify the list, you can pass Collections.emptyList() as a placeholder.

Memory optimization: If you need to use an empty list multiple times in your code, creating a new instance each time can be wasteful. Using Collections.emptyList() can help optimize memory usage, since it returns a singleton instance of an empty list that can be shared among multiple parts of the code.

It's worth noting that Collections.emptyList() returns an immutable list, which means that any attempt to modify the list (such as adding or removing elements) will result in an UnsupportedOperationException. This is useful when you need to ensure that a list is read-only or when you want to prevent accidental modifications to the list.
*/public class OneCollectionsEmptyListExample {

	private String setCondition;
	private List<String> list;

	public String getSetCondition() {
		return setCondition;
	}

	public void setSetCondition(String setCondition) {
		this.setCondition = setCondition;
	}

	public List<String> getElements() {
		if (this.getSetCondition().equalsIgnoreCase("true")) {
			return Collections.emptyList();
		} else {
			list = new ArrayList<>();
			list.add("some");
			return list;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneCollectionsEmptyListExample e=new OneCollectionsEmptyListExample();
		e.setSetCondition("true");
		List<String> finalList=e.getElements();
		System.out.println(finalList);

	}

}
