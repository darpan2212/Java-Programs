package org.ordered.list;

public class TestSortedList {

	public static void main(String[] args) {

		SortedLinkedList<Integer> si = new SortedLinkedList<Integer>();
		si.add(25);
		si.add(10);
		si.add(26);
		si.add(15);
		si.add(20);
		si.add(30);

		System.out.println("size------------" + si.size());
		System.out.println("popped out ele : " + si.pop());
		System.out.println("popped out ele : " + si.popPos(0));
		System.out.println("after pop 2 eles size------------" + si.size());
		si.traverse();

	}

}