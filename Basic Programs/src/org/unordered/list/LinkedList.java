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

public class LinkedList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;

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

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int index(T e) {
		int cnt = 0;
		Node<T> temp = head;
		while (temp != null) {
			if (temp.compareTo(e) == 0) {
				return cnt;
			}
			cnt++;
			temp = temp.getNext();
		}
		return -1;
	}

	public void traverse() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}

	public void remove(T e) {
		Node<T> temp = head;
		Node<T> ref = head;
		if (head.compareTo(e) == 0) {
			head = temp.getNext();
			size--;
		} else {
			while (temp != null) {
				if (temp.compareTo(e) == 0) {
					ref.setNext(temp.getNext());
					size--;
					break;
				}
				ref = temp;
				temp = temp.getNext();
			}
		}
	}

	public boolean search(T e) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.compareTo(e) == 0) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	public void insert(T e, int pos) {
		if (size >= pos) {
			Node<T> nd = new Node<T>();
			nd.setValue(e);
			Node<T> temp = head;
			Node<T> ref = head;
			while (pos >= 0 || temp != null) {
				if (pos == 0) {
					ref.setNext(nd);
					nd.setNext(temp);
					size++;
				}
				ref = temp;
				temp = temp.getNext();
				pos--;
			}
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public T pop() {
		Node<T> temp = head;
		Node<T> ref = head;
		while (temp.getNext() != null) {
			ref = temp;
			temp = temp.getNext();
		}
		temp = tail;
		tail = ref;
		ref.setNext(null);
		size--;
		return temp.getValue();
	}

	public T get(int i) {
		Node<T> temp = head;
		int cnt = 0;
		while (!(cnt == i)) {
			cnt++;
			temp = temp.getNext();
		}
		return temp.getValue();
	}

	public T popPos(int pos) {
		Node<T> temp = head;
		Node<T> ref = head;

		if (pos == 0) {
			head = ref.getNext();
			size--;
			return temp.getValue();
		}

		while (pos >= 0 && temp != null) {
			if (pos == 0) {
				ref.setNext(temp.getNext());
				size--;
				break;
			}
			pos--;
			ref = temp;
			temp = temp.getNext();
		}
		return temp.getValue();
	}
}