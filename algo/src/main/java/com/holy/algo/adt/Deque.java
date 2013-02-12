package com.holy.algo.adt;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

	private class Node {
		private Item element;
		private Node prev;
		private Node next;
	}

	private int count;
	private Node head;
	private Node tail;

	public Deque() {
		count = 0;
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return (head == null && tail == null);
	}

	public int size() {
		return count;
	}

	public void addFirst(Item item) {
		if (item == null)
			throw new NullPointerException("Cannot insert null object");

		Node current = new Node();
		current.element = item;

		current.next = head;
		if(head != null)
			head.prev = current;
		head = current;
		if (tail == null)
			tail = current;

		count++;
	}

	public void addLast(Item item) {
		if (item == null)
			throw new NullPointerException("Cannot insert null object");

		Node current = new Node();
		current.element = item;

		if (tail != null) {
			tail.next = current;
			current.prev = tail;
		}
		tail = current;

		if (head == null)
			head = current;

		count++;

	}

	public Item removeFirst() {
		if( isEmpty() )
			throw new NoSuchElementException("buffer underflow");
		
		Item returnValue = head.element;
		
		head = head.next;
		if( head != null )
		     head.prev = null;
		else {
			tail = null;
		}
		
		count--;
		return returnValue;
	}

	public Item removeLast() {
		if( isEmpty() )
			throw new NoSuchElementException("buffer underflow");
		
		Item returnValue = tail.element;
		
		tail = tail.prev;
		if( tail != null )
		      tail.next = null;
		else 
			head = null;
		count--;
		return returnValue;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Item e : this)
			sb.append(e + " ");
		return sb.toString();
	}

	public Iterator<Item> iterator() {
		return new DequeIterator();
	}

	private class DequeIterator implements Iterator<Item> {

		private Node current = head;

		public boolean hasNext() {
			return (current != null);
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException("buffer underflow");

			Item returnValue = current.element;
			current = current.next;
			return returnValue;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

}
