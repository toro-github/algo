package com.holy.algo.adt;

import org.testng.annotations.Test;

public class TestStack {

	@Test
	public void testStringStack(){
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("one");
		System.out.println("size of stringStack:" + stringStack.size());
		System.out.println("this is a testStringStack test");
	}
}
