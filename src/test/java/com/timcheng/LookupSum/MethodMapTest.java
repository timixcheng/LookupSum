package com.timcheng.LookupSum;

import static org.junit.Assert.*;

import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;

public class MethodMapTest {

	@Test
	public void testInvoke() {
		int[] sources = new int[]{1, 2, 3, 4, 5, 6};
		int sum = 7;
		LinkedList<OutputItem> expected = new LinkedList<OutputItem>();
		expected.add(new OutputItem(0, 5, 1, 6));
		expected.add(new OutputItem(1, 4, 2, 5));
		expected.add(new OutputItem(2, 3, 3, 4));
		
		MethodMap object = new MethodMap();
		ListOutput oi = new ListOutput();
		object.Invoke(sources, sum, oi);
		LinkedList<OutputItem> actual = oi.GetResult();
		Assert.assertEquals("output size not equal",expected.size(), actual.size());
		for (int i=0; i<expected.size(); i++){
			Assert.assertEquals("object not equal", expected.get(i), actual.get(i));
		}

	}

}
