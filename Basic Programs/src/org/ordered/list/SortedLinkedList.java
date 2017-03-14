package org.ordered.list;


public class SortedLinkedList<E>{

	private class Node<T> implements Comparable<T>{
		T value;
		Node<T> next;
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
			return o.toString().compareToIgnoreCase(this.getValue().toString());
		}
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public void add(E e){
		Node<E> nd = new Node<E>();
		nd.setValue(e);
		if(head == null){
			head = nd;
			tail = nd;
			size++;
		}else{
			Node<E> tmp = head;
			Node<E> ref = head;
			while(!(tmp.compareTo(e) > 0)){
				ref = tmp;
				tmp = tmp.getNext();
			}
			ref.setNext(nd);
			nd.setNext(tmp);
			size++;
		}
	}
	
	public void traverse(){
		Node<E> tmp = head;
		while(tmp != null){
			System.out.println(tmp.getValue());
			tmp = tmp.getNext();
		}
	}
	
	public static void main(String[] args) {
		SortedLinkedList<String> str = new SortedLinkedList<String>();
		
		str.add("Darpan");
		str.add("Madlani");
		str.add("Lohana");
		
		str.traverse();
		
	}
}