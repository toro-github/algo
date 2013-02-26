package com.holy.algo.adt;

import java.util.Iterator;
import java.util.Comparator;
import java.util.NoSuchElementException;


/**
 * This implementation uses a binary heap.
 * 
 * @author ali
 *
 * @param <Key>
 */
public class MaxPQ<Key> implements Iterable<Key> {

	private Key[] pq;
	private int N;
	private Comparator<Key> comparator; 
	
	/**
	 * Constructor with initial capacity.
	 * 
	 * @param capacity
	 */
	public MaxPQ(int capacity){
		pq = (Key[]) new Object[capacity + 1];
		N = 0;
	}
	
	/**
	 * create a empty PQ.
	 * @return
	 */
	public MaxPQ() {
		this(1); 
	}
	
	/**
	 * PQ with an given initial capacity and using an given comparator.
	 * 
	 * @param initCapacity
	 * @param comparator
	 */
	public MaxPQ(int initCapacity, Comparator<Key> comparator) {
		this.comparator = comparator;
		pq = (Key[]) new Object[initCapacity + 1];
		N = 0;
	}
	
	/**
	 * empty PQ and using a given comparator.
	 * 
	 * @param comparator
	 */
	public MaxPQ(Comparator<Key> comparator) {
		this(1, comparator);
	}
	
	
	public MaxPQ(Key[] keys){
		N = keys.length;
		pq = (Key[]) new Object[keys.length+1];
		for(int i = 0; i < N; i++){
			pq[i+1] = keys[i];
		}
		for(int k = N/2; k >= 1; k--)
			sink(k);
	}
	
	
	/*************************************************
	 * Helper functions 
	 *************************************************/
	
	private void swim(int k){
	}
	
	private void sink(int k){
	}
	 
	
	public Iterator<Key> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
