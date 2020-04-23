 package com.ip.lambdaexpression;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BinaryOperatorTest {

	 BinaryOperators binaryoperators;
	 
	 @BeforeTest
	 public void setUp() {
		 binaryoperators = new BinaryOperators();
	 }
	 @Test
	 public void testTwoNum() {
		Integer actual = binaryoperators.additionTwoNum(2, 3);
		Integer expected = 5;
		Assert.assertEquals(actual, expected);
	 }
	 
	 @Test
	 public void testTwoNegNum() {
		Integer actual = binaryoperators.additionTwoNum(-2, -3);
		Integer expected = -5;
		Assert.assertEquals(actual, expected);
	 }
	 
	 @Test
	 public void testOneNegNum() {
		Integer actual = binaryoperators.additionTwoNum(-2, 3);
		Integer expected = 1;
		Assert.assertEquals(actual, expected);
	 }
	 
	 @Test
	 public void testWithZero() {
		Integer actual = binaryoperators.additionTwoNum(100, 0 );
		Integer expected = 100;
		Assert.assertEquals(actual, expected);
	 }
	 
	 @Test
	 public void testWithLargeNum() {
		Integer actual = binaryoperators.additionTwoNum( 1234, 878);
		Integer expected = 2112;
		Assert.assertEquals(actual, expected);
	 }
	 
}
