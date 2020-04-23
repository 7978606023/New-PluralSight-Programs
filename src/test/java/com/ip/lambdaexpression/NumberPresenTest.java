
package com.ip.lambdaexpression;

import static org.testng.Assert.assertEquals;
import java.util.stream.Stream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumberPresenTest {
	/**
	 * Call to implement class of IsNumberPresentStream.
	 */

	private NumberPresent isNumberPresentStream = null;

	/**
	 * Create the object of implement class.
	 */
	@BeforeTest
	public void setUp() {
		isNumberPresentStream = new NumberPresent();
	}

	/**
	 * First test case with is number present or not.
	 */
	@Test
	public void testWithNum() {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);
		int num = 4;
		assertEquals(isNumberPresentStream.isANumberPresentInStream(stream, num), true);
	}
	
	@Test
	public void testWithMinusNum() {
		Stream<Integer> stream = Stream.of(-4, -5, -3, -2);
		int num = 4;
		assertEquals(isNumberPresentStream.isANumberPresentInStream(stream, num), false);
	}
	
	@Test
	public void testWithHalfMinusNum() {
		Stream<Integer> stream = Stream.of(4, -5, 2, -3);
		int num = 4;
		assertEquals(isNumberPresentStream.isANumberPresentInStream(stream, num), true);
	}
	
	@Test
	public void testWithZeroNum() {
		Stream<Integer> stream = Stream.of(0, 0, 0, 0);
		int num = 4;
		assertEquals(isNumberPresentStream.isANumberPresentInStream(stream, num), false);
	}
	
	@Test
	public void testWithDuplicateNum() {
		Stream<Integer> stream = Stream.of(5, 5, 2, 2);
		int num = 4;
		assertEquals(isNumberPresentStream.isANumberPresentInStream(stream, num), false);
	}
}
