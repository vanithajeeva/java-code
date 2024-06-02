package org.constructorargs;

public class TaskA extends TaskB {
public TaskA() {
	super(23);
	System.out.println("default constructor");
}
public static void main(String[] args) {
	TaskA a = new TaskA();
	
}
}

