package com.examples.paall.queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

class Student1 implements Comparable<Student1> {
	private String name;
	private int age;

	public Student1(String name, int age) {
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
	public int compareTo(Student1 anotherStudent) {
		// TODO Auto-generated method stub
		// return Integer.compare(this.age, anotherStudent.getAge());
		return this.name.compareTo(anotherStudent.getName());

	}

}

public class TwoAndFourPriorityQueueExample {

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

		Queue<Student1> students = new PriorityQueue<>();
		students.add(new Student1("shiva", 12));
		students.add(new Student1("hari", 42));
		students.add(new Student1("india", 52));
		students.add(new Student1("advik", 28));

		System.out.println(students);

	}

}
