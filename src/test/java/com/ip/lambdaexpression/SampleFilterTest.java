package com.ip.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleFilterTest {

/**
 *call to implemnet class.
 */
private SampleFilter samplefilter = null;

/**
*object creation of implement class.
**/
	@BeforeTest
	public void setUP() {
	samplefilter = new SampleFilter();
	}

	/**
	 * first test case with check even numbers.
	 */
	@Test
	public void testWithCheckEven() {
			List<Integer> l = new ArrayList();
			l.add(1);
			l.add(2);
			l.add(1);
			l.add(2);
			l.add(2);

			List<Integer> actual = samplefilter.findOutEvenNum(l);
			List<Integer> expected = Arrays.asList(2,2,2);
			Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testWithEvenNum() {
			List<Integer> l = new ArrayList();
			l.add(15);
			l.add(5);
			l.add(2);
			l.add(7);
			l.add(8);

			List<Integer> actual = samplefilter.findOutEvenNum(l);
			List<Integer> expected = Arrays.asList(2, 8);
			Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testWithMinusEven() {
			List<Integer> l = new ArrayList();
			l.add(-2);
			l.add(4);
			l.add(-5);
			l.add(1);
			l.add(7);

			List<Integer> actual = samplefilter.findOutEvenNum(l);
			List<Integer> expected = Arrays.asList(-2, 4);
			Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testWithZero() {
			List<Integer> l = new ArrayList();
			l.add(8);
			l.add(0);
			l.add(2);
			l.add(1);
			l.add(6);

			List<Integer> actual = samplefilter.findOutEvenNum(l);
			List<Integer> expected = Arrays.asList(8, 2, 6);
			Assert.assertNotEquals(actual, expected);	
	}
}
