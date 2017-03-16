package org.unordered.list;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);

		System.out.println("popped out ele : "+li.popPos(7));
		li.traverse();
	}
	
}