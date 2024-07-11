package org.constructorargs;

import org.arraycollectionlist.Simple;

public class TaskA extends TaskB {
	public TaskA() {
		super(23);
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Simple.vani();
		TaskA a = new TaskA();

	}
}
