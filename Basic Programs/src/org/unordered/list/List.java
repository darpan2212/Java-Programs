package org.unordered.list;

class Node<T> implements Comparable<T> {
	private T value;
	private Node<T> next;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public int compareTo(T o) {
		if (o.equals(this.value) || o == this.value) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class List<T> {

		private Node<T> head = null;
		private Node<T> tail = null;
		private int size;

		public boolean add(T e) {
			try {
				Node<T> nd = new Node<T>();
				nd.setValue(e);
				if (head == null) {
					head = nd;
					tail = nd;
					size++;
				} else {
					Node<T> temp = head;
					while (temp.getNext() != null) {
						temp = temp.getNext();
					}
					temp.setNext(nd);
					tail = nd;
					size++;
				}
				return true;
			} catch (Exception ex) {
				return false;
			}
		}

		public int getSize() {
			return size;
		}

		public boolean search(T e) {
			try {
				int cnt = 0;
				if (head == null) {
					System.out.println("List is Empty");
				} else {
					Node<T> temp = head;
					while (temp != null) {
						if (temp.compareTo(e) == 0) {
							System.out.println("your search element is at position " + cnt);
							return true;
						}
						cnt++;
						temp = temp.getNext();
					}
					System.out.println("your search element is not in the list");
				}
				return false;
			} catch (Exception ex) {
				return false;
			}
		}

		public void traverse() {
			Node<T> temp = head;
			while (temp != null) {
				System.out.println(temp.getValue());
				temp = temp.getNext();
			}
		}
}