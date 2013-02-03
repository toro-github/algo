package com.holy.algo.adt;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {

	private class Item {
		T element;
		Item next;
	}
	
	public Bag(){
		count = 0;
		head = null;
	}
	
	public void add(T item){
		
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public int size(){
		return count;
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
				throw new NoSuchElementException("buffer underflow");
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
