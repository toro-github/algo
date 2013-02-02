package com.holy.algo.adt;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStack {

	@Test
	public void testStringStack(){
		Stack<String> stringStack = new Stack<String>();
		Assert.assertEquals(stringStack.size(), 0);
		stringStack.push("one");
		stringStack.push("two");
		stringStack.push("three");
		Assert.assertEquals(stringStack.size(), 3);
		Assert.assertEquals(stringStack.toString(),"three two one ");
		Assert.assertEquals(stringStack.peek(), "three");
		Assert.assertEquals(stringStack.pop(),"three");
		Assert.assertEquals(stringStack.size(), 2);
		Assert.assertEquals(stringStack.toString(), "two one ");
		Assert.assertEquals(stringStack.peek(), "two");
		Assert.assertEquals(stringStack.pop(),"two");
		Assert.assertEquals(stringStack.size(), 1);
		Assert.assertEquals(stringStack.toString(), "one ");
		Assert.assertEquals(stringStack.peek(), "one");
		Assert.assertEquals(stringStack.pop(),"one");
		Assert.assertEquals(stringStack.size(), 0);
		Assert.assertEquals(stringStack.toString(), "");
		
	}
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void testPeekException(){
		Stack<String> stringStack = new Stack<String>();
		stringStack.peek();
	}
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void testPopException(){
		Stack<String> stringStack = new Stack<String>();
		stringStack.pop();
	}
	
	@Test
	public void testIntegerStack(){
		Stack<Integer> integerStack = new Stack<Integer>();
		Assert.assertEquals(integerStack.size(), 0);
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		Assert.assertEquals(integerStack.size(), 3);
		Assert.assertEquals(integerStack.toString(),"3 2 1 ");
		Assert.assertEquals(integerStack.peek().intValue(), 3);
		Assert.assertEquals(integerStack.pop().intValue(), 3);
		Assert.assertEquals(integerStack.size(), 2);
		Assert.assertEquals(integerStack.toString(), "2 1 ");
		Assert.assertEquals(integerStack.peek().intValue(), 2);
		Assert.assertEquals(integerStack.pop().intValue(), 2);
		Assert.assertEquals(integerStack.size(), 1);
		Assert.assertEquals(integerStack.toString(), "1 ");
		Assert.assertEquals(integerStack.peek().intValue(), 1);
		Assert.assertEquals(integerStack.pop().intValue(), 1);
		Assert.assertEquals(integerStack.size(), 0);
		Assert.assertEquals(integerStack.toString(), "");
	}
}
