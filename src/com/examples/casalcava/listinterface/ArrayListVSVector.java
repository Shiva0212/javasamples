package com.examples.casalcava.listinterface;

import java.util.ArrayList;
import java.util.Vector;

/*As I said earlier
vector contains synchronized methods wheras arraylist doesnt contain any synchrinized methods

To prove this 
we are declaring arraylist and vector instances
first case:
two threads parallelly trying to add elements to arraylist 
and at the same time main thread tries to print the size of the arraylist
we get unexpected results

second case:
we get expected results because of
synchronized methods in vector

*/

public class ArrayListVSVector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		Vector<String> vector = new Vector<>();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100000; i++) {
					arrayList.add(i + "");
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100000; i++) {
					arrayList.add(i + "");
				}

			}
		});

		t1.start();
		
		t2.start();


		Thread.sleep(10000);
		System.out.println(arrayList.size());

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100000; i++) {
					vector.add(i + "");
				}

			}
		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100000; i++) {
					vector.add(i + "");
				}

			}
		});

		t3.start();
		t4.start();

		Thread.sleep(10000);
		System.out.println(vector.size());

	}

}
