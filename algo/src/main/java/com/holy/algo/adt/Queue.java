package com.holy.algo.adt;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {

	private class Item {
		T element;
		Item next;
	}
	
	public Queue(){
		count = 0;
		head = null;
		tail = null;
	}
	
	public T dequeue(){
	
		return null;
	}
	
	public void enqueue(T item){
		
	}
	
	public T peek(){
		return null;
	}
	
	public boolean isEmpty(){
		return (head == null && tail == null);
	}
	
	public int size()
	{
		return count;
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		return s.toString();
	}
	
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private int count;
	private Item head;
	private Item tail;
}
