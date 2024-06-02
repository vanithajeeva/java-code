package org.constructorargs;

public class TaskB {
	public TaskB() {
		System.out.println("super class");
	}

	public TaskB(int id) {
		this();
		System.out.println(id);
	}
}
