package org.stack.balanceparanthesis;

import java.util.Arrays;

public class Stack {

	private static Object[] obj = new Object[5];
	private int size = 0;
	private int top = -1;

	public Stack() {
	}

	private static void increaseArraySize() {
		obj = Arrays.copyOf(obj, obj.length * 2);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == obj.length - 1;
	}

	public int size() {
		return size;
	}

	public void push(Object o) {
		if (!isFull())
			obj[++top] = o;
		else {
			increaseArraySize();
			obj[++top] = o;
		}
		size++;
	}

	public Object pop() {
		if(isEmpty())
			System.err.println("underflow situation");
		size--;
		return obj[top--];
	}

	public Object peek() {
		if(isEmpty())
			System.err.println("underflow situation");
		return obj[top];
	}

	public void traverse() {
		for (int i = 0; i < size(); i++) {
			System.out.println(obj[i]);
		}
	}
	
	public int arrayLen(){
		return obj.length;
	}
}