package com.holy.algo.adt;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestQueue {
	
	@Test
	public void testStringQueue(){
		Queue<String> queueString = new Queue<String>();
		Assert.assertEquals(queueString.size(), 0	);
		Assert.assertEquals(queueString.isEmpty(), true);
		queueString.enqueue("one");
		queueString.enqueue("two");
		queueString.enqueue("three");
		Assert.assertEquals(queueString.isEmpty(), false);
		Assert.assertEquals(queueString.size(), 3);
		Assert.assertEquals(queueString.toString(), "one two three ");
		Assert.assertEquals(queueString.peek(), "one");
		Assert.assertEquals(queueString.dequeue(), "one");
		Assert.assertEquals(queueString.size(), 2);
		Assert.assertEquals(queueString.toString(), "two three ");
		Assert.assertEquals(queueString.peek(), "two");
		Assert.assertEquals(queueString.dequeue(), "two");
		Assert.assertEquals(queueString.size(), 1);
		Assert.assertEquals(queueString.toString(), "three ");
		Assert.assertEquals(queueString.peek(), "three");
		Assert.assertEquals(queueString.dequeue(), "three");
		Assert.assertEquals(queueString.size(), 0);
		Assert.assertEquals(queueString.toString(), "");
		Assert.assertEquals(queueString.isEmpty(), true);
	}
	
	@Test(expectedExceptions=NoSuchElementException.class)
	public void testQueuePeekException(){
		Queue<String> queueString = new Queue<String>();
		queueString.peek();
	}
	
	@Test(expectedExceptions=NoSuchElementException.class)
	public void testQueueDequeueException(){
		Queue<String> queueString = new Queue<String>();
		queueString.dequeue();
	}
	
	@Test
	public void testIngeterQueue(){
		Queue<Integer> queueInteger = new Queue<Integer>();
		Assert.assertEquals(queueInteger.size(), 0	);
		Assert.assertEquals(queueInteger.isEmpty(), true);
		queueInteger.enqueue(1);
		queueInteger.enqueue(2);
		queueInteger.enqueue(3);
		Assert.assertEquals(queueInteger.isEmpty(), false);
		Assert.assertEquals(queueInteger.size(), 3);
		Assert.assertEquals(queueInteger.toString(), "1 2 3 ");
		Assert.assertEquals(queueInteger.peek().intValue(), 1);
		Assert.assertEquals(queueInteger.dequeue().intValue(), 1);
		Assert.assertEquals(queueInteger.size(), 2);
		Assert.assertEquals(queueInteger.toString(), "2 3 ");
		Assert.assertEquals(queueInteger.peek().intValue(), 2);
		Assert.assertEquals(queueInteger.dequeue().intValue(), 2);
		Assert.assertEquals(queueInteger.size(), 1);
		Assert.assertEquals(queueInteger.toString(), "3 ");
		Assert.assertEquals(queueInteger.peek().intValue(), 3);
		Assert.assertEquals(queueInteger.dequeue().intValue(), 3);
		Assert.assertEquals(queueInteger.size(), 0);
		Assert.assertEquals(queueInteger.toString(), "");
		Assert.assertEquals(queueInteger.isEmpty(), true);
	}

}
