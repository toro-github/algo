/**
 * 
 */
package com.holy.algo.adt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author ali
 * 
 */
public class Stack<T> implements Iterable<T> {

	private class Item {
		T element;
		Item next;
	}

	public Stack() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int size() {
		return count;
	}

	public void push(T item) {
		Item newItem = new Item();
		newItem.element = item;
		newItem.next = head;
		head = newItem;
		count++;
	}

	public T pop() {
		if( isEmpty() ) throw new NoSuchElementException("stack underflow");
		T returnItem = head.element;
		head = head.next;
		count--;
		return returnItem;
	}
	
	public T peek() {
		if( isEmpty() ) throw new NoSuchElementException("stack underflow");
		return head.element;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(T e : this){
			s.append(e + " ");
		}
		return s.toString();
	}

	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<T>{

		private Item current = head;
		
		public boolean hasNext() {
			return (current != null);
		}

		public T next() {
			if( !hasNext() ) 
				throw new NoSuchElementException();
			T item = current.element;
			current = current.next;
			return item;
		}

		public void remove() {
			throw new UnsupportedOperationException();		
		}
		
	}

	private Item head;
	private int count;
}
