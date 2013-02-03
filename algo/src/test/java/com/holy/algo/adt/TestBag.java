package com.holy.algo.adt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBag {

	@Test
	public void testStringBag(){
		Bag<String> stringBag = new Bag<String>();
		Assert.assertEquals(stringBag.size(), 0);
		Assert.assertEquals(stringBag.isEmpty(), true);
		stringBag.add("one");
		stringBag.add("two");
		stringBag.add("three");
		Assert.assertEquals(stringBag.size(), 3);
		Assert.assertEquals(stringBag.isEmpty(), false);
		Assert.assertEquals(stringBag.toString(), "three two one ");
	}
	
	@Test
	public void testIntegerBag(){
		Bag<Integer> integerBag = new Bag<Integer>();
		Assert.assertEquals(integerBag.size(), 0);
		Assert.assertEquals(integerBag.isEmpty(), true);
		integerBag.add(1);
		integerBag.add(2);
		integerBag.add(3);
		Assert.assertEquals(integerBag.size(), 3);
		Assert.assertEquals(integerBag.isEmpty(), false);
		Assert.assertEquals(integerBag.toString(), "3 2 1 ");
	}
}
