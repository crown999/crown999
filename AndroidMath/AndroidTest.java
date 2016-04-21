package com.example.mathsapp;

import junit.framework.Assert;
import android.test.AndroidTestCase;

public class AndroidTest extends AndroidTestCase{
	
	public void testAdd() throws Exception {
		Android add = new Android();
		int result = add.add(1, 2);
		Assert.assertEquals(3, result);
	}
	public void testSub() throws Exception {
		Android sub = new Android();
		int result = sub.sub(1, 2);
		Assert.assertEquals(-1, result);
	}
	public void testMuti() throws Exception {
		Android muti = new Android();
		int result = muti.muti(1, 2);
		Assert.assertEquals(2, result);
	}
	public void testDiv() throws Exception {
		Android div = new Android();
		int result = div.div(2, 2);
		Assert.assertEquals(1, result);
	}
}
