package com.examples.paall.queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "=" + this.age;
	}

	@Override
	public int compareTo(Student anotherStudent) {
		// TODO Auto-generated method stub
		//return Integer.compare(this.age, anotherStudent.getAge());
		 return this.name.compareTo(anotherStudent.getName());

	}

}

public class OnePriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Insertion of elemtns happen according to their natural ordering in below
		// example
		// for strings it take ordering as cc da fb so it displayed accordingly.

		// What if we want to do natural ordering on objects like students or persons.
		// Yes you can implement comparable interface and pass generic value as object
		// that needs to be
		// compared like class student implements comparable<student>

		Queue<String> strings = new PriorityQueue<>();
		strings.add("da");
		strings.add("fb");
		strings.add("cc");
		while (!strings.isEmpty()) {
			System.out.println(strings.poll());
		}
		// System.out.println(students);

		Queue<Student> students = new PriorityQueue<>();
		students.add(new Student("shiva", 12));
		students.add(new Student("hari", 42));
		students.add(new Student("india", 52));
		students.add(new Student("advik", 28));

		System.out.println(students);

	}

}
