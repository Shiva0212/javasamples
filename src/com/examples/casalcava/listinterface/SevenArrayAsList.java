package com.examples.casalcava.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Arrays.asList() is a utility method provided by 
Java that can be used to convert an array to a List. :
*/
public class SevenArrayAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "india", "pop", "medak" };
		List<String> aList = Arrays.asList(strs);
		System.out.println(aList);

		List<String> mutableList = new ArrayList<>(Arrays.asList(strs));
		mutableList.add("quux");
		System.out.println(mutableList);
	}

}
