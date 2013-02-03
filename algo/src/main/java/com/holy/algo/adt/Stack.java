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
		count = 0;
		head = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}
	
	public T peek(){
		if( isEmpty() )
			throw new NoSuchElementException("buffer underflow");
		return head.element;
	}
	
	public T pop(){
		if( isEmpty() )
			throw new NoSuchElementException("buffer underflow");
		T returnValue = head.element;
		head = head.next;
		count--;
		return returnValue;
	}
	
	public void push(T item){
		Item newNode = new Item();
		newNode.element = item;
		newNode.next = head;
		head = newNode;
		count++;
	}
	
	public int size(){
		return count;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for( T e : this)
			s.append( e + " ");
		return s.toString();
	}

	public Iterator<T> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<T> {

		private Item current = head;

		public boolean hasNext() {
			return (current != null);
		}

		public T next() {
			if (!hasNext())
				throw new NoSuchElementException("Stack underflow");
			T returnValue = current.element;
			current = current.next;
			return returnValue;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	private int count;
	private Item head;

}
