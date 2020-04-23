package com.ip.lambdaexpression;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPredicateTest {
	MainPredicate predicate;

	@BeforeTest
	public void setUp() {
		predicate = new MainPredicate();
	}

	@Test
	public void checkStringLength() {
		boolean actual = predicate.checkLengthOfString("hello");
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void testWithSameLength() {
		boolean actual = predicate.checkLengthOfString("whitebox");
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void testWithNum() {
		boolean actual = predicate.checkLengthOfString("1234456");
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void testWithNumAlph() {
		boolean actual = predicate.checkLengthOfString("abc1234");
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void testWithalpha() {
		boolean actual = predicate.checkLengthOfString("whitebox learning");
		boolean expected = true;
		Assert.assertNotEquals(actual, expected);
	}
}
