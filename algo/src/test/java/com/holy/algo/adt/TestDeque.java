package com.holy.algo.adt;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeque {
	
	@Test
	public void testAddFirst() {
	
		Deque<String> dequeString = new Deque<String>();
		Assert.assertEquals(dequeString.size(), 0	);
		Assert.assertEquals(dequeString.isEmpty(), true);
		
		dequeString.addFirst("three");
		dequeString.addFirst("two");
		dequeString.addFirst("one");
		dequeString.addLast("four");
		dequeString.addLast("five");
		dequeString.addLast("six");
		Assert.assertEquals(dequeString.size(), 6);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.toString(), "one two three four five six ");
		//System.out.println("toString:" + dequeString.toString());
	    Assert.assertEquals(dequeString.removeFirst(), "one");
	    Assert.assertEquals(dequeString.size(), 5);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.toString(), "two three four five six ");
	    
		Assert.assertEquals(dequeString.removeLast(), "six");
	    Assert.assertEquals(dequeString.size(), 4);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.toString(), "two three four five ");
		
		Assert.assertEquals(dequeString.removeFirst(), "two");
	    Assert.assertEquals(dequeString.size(), 3);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.toString(), "three four five ");
	    
		Assert.assertEquals(dequeString.removeLast(), "five");
	    Assert.assertEquals(dequeString.size(), 2);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.toString(), "three four ");
		
		Assert.assertEquals(dequeString.removeFirst(), "three");
	    Assert.assertEquals(dequeString.size(), 1);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.toString(), "four ");
	    
		Assert.assertEquals(dequeString.removeLast(), "four");
	    Assert.assertEquals(dequeString.size(), 0);
		Assert.assertEquals(dequeString.isEmpty(), true);
		Assert.assertEquals(dequeString.toString(), "");
		
	}
	
	@Test
	public void testAddFirstAndRemoveFirst(){
		Deque<String> dequeString = new Deque<String>();
		Assert.assertEquals(dequeString.size(), 0);
		Assert.assertEquals(dequeString.isEmpty(), true);
		dequeString.addFirst("hello");
		Assert.assertEquals(dequeString.size(), 1);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.removeFirst(), "hello");
		Assert.assertEquals(dequeString.size(), 0);
		Assert.assertEquals(dequeString.isEmpty(), true);
		
		dequeString.addLast("world");
		Assert.assertEquals(dequeString.size(), 1);
		Assert.assertEquals(dequeString.isEmpty(), false);
		Assert.assertEquals(dequeString.removeLast(), "world");
		Assert.assertEquals(dequeString.size(), 0);
		Assert.assertEquals(dequeString.isEmpty(), true);
	}
	
	@Test (expectedExceptions=NoSuchElementException.class)
	public void testEmptyRemoveFirst(){
		
		Deque<String> dequeString = new Deque<String>();
		dequeString.removeFirst();
	}

	@Test (expectedExceptions=NoSuchElementException.class)
	public void testEmptyRemoveLast(){
		Deque<String> dequeString = new Deque<String>();
		dequeString.removeLast();
	}
	
	@Test (expectedExceptions=NullPointerException.class)
	public void testNullAddFirst(){
		Deque<String> dequeString = new Deque<String>();
		dequeString.addFirst(null);
	}
	
	@Test (expectedExceptions=NullPointerException.class)
	public void testNullAddLast(){
		Deque<String> dequeString = new Deque<String>();
		dequeString.addLast(null);
	}
}
