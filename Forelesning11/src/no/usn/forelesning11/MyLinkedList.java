package no.usn.forelesning11;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E>, Iterable<E>{
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public void add(E e) {
		Node<E> node = new Node<>(e);
		if(tail == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail=node;
		}
		size++;
	}
	
	public void addFirst(E e) {
		Node<E> node = new Node(e);
		
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size++;	
	}
	
	public E get(int index) {
		if(index <0 || index >= size) {
			throw new IndexOutOfBoundsException("Indeks "+index+" størrelse "+size);
		}
		Node<E> current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.element;
	}
	
	public int size() {
		return size;
	}

	@Override
	public Iterator<E> iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator<E>{
		private Node<E> current = head;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}
		
		@Override
		public E next() {
			E e = current.element;
			current = current.next;
			return e;
		}
	}
}
