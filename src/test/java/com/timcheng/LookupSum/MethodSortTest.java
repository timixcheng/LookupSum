package com.timcheng.LookupSum;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.LinkedList;

import junit.framework.Assert;
public class MethodSortTest {

	@Test
	public void testInvoke() {
		int[] sources = new int[]{1, 2, 3, 4, 5, 6};
		int sum = 7;
		LinkedList<OutputItem> expected = new LinkedList<OutputItem>();
		expected.add(new OutputItem(0, 5, 1, 6));
		expected.add(new OutputItem(1, 4, 2, 5));
		expected.add(new OutputItem(2, 3, 3, 4));
		
		MethodSort object = new MethodSort();
		ListOutput oi = new ListOutput();
		object.Invoke(sources, sum, oi);
		LinkedList<OutputItem> actual = oi.GetResult();
		Assert.assertEquals(expected.size(), actual.size());
		for (int i=0; i<expected.size(); i++){
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}

}
