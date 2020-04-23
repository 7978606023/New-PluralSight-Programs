package com.ip.lambdaexpression;

import static org.testng.Assert.assertEquals;
import java.util.stream.Stream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindStringTest {

	/**
	 * Call to implement class of FindStirngWithFirstCharacter.
	 */
	private FindString findStirngWithFirstCharacter = null;

	/**
	 * Create the object of implement class.
	 **/
	@BeforeTest
	public final void setUp() {
		findStirngWithFirstCharacter = new FindString();
	}

	/**
	 * First test case of first String with first character.
	 */
	@Test
	public void testWithFirstChar() {
		Stream<String> names = Stream.of("Pankaj", "Amit", "David", "Lisa");
		String name = "D";
		assertEquals(findStirngWithFirstCharacter.findFirstStringStartsWithOneCharacter(names, name), "David");
	}
	
	@Test
	public void testWithUpperCase() {
		Stream<String> names = Stream.of("PANKAJ", "AMIT", "DAVID", "LISA");
		String name = "P";
		assertEquals(findStirngWithFirstCharacter.findFirstStringStartsWithOneCharacter(names, name), "PANKAJ");
	}
	
	@Test
	public void testWithLowerCase() {
		Stream<String> names = Stream.of("pankaj", "amit", "david", "lisa");
		String name = "a";
		assertEquals(findStirngWithFirstCharacter.findFirstStringStartsWithOneCharacter(names, name), "amit");
	}
	
	@Test
	public void testWithNum() {
		Stream<String> names = Stream.of("1234", "333", "2345", "233");
		String name = "1";
		assertEquals(findStirngWithFirstCharacter.findFirstStringStartsWithOneCharacter(names, name), "1234");
	}
}