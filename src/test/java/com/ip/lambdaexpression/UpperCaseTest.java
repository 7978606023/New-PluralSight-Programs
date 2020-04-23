package com.ip.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UpperCaseTest {

/**
 *Declaring uppercase class as a datamember in it.
 */
private UpperCase upperCase = null;

/**
 *Create the object of implement class.
 */
@BeforeTest
public void setup() {
upperCase = new UpperCase();
}

/**
 *First Test case to check with lower case letter.
 */
@Test
public void testWithMultipleWordsToUppercase() {
    List<String> input = Arrays.asList("a", "b", "hello");
    List<String> actual = upperCase.allToUpperCase(input);
    List<String> expected = Arrays.asList("A", "B", "HELLO");
    Assert.assertEquals(expected, actual);
}

@Test
public void TestWithUpperDown() {
    List<String> input = Arrays.asList("D", "b", "Whitebox");
    List<String> actual = upperCase.allToUpperCase(input);
    List<String> expected = Arrays.asList("D", "B", "WHITEBOX");
    Assert.assertEquals(expected, actual);
}

@Test
public void TestWithLowerDown() {
    List<String> input = Arrays.asList("hi", "Anubhav", "SahOO");
    List<String> actual = upperCase.allToUpperCase(input);
    List<String> expected = Arrays.asList("HI", "ANUBHAV", "SAHOO");
    Assert.assertEquals(expected, actual);
}

@Test
public void TestWithHalfNum() {
    List<String> input = Arrays.asList("Hello", "code", "47");
    List<String> actual = upperCase.allToUpperCase(input);
    List<String> expected = Arrays.asList("HELLO", "CODE", "47");
    Assert.assertEquals(expected, actual);
}

@Test
public void TestWithNum() {
    List<String> input = Arrays.asList("1234", "10", "100");
    List<String> actual = upperCase.allToUpperCase(input);
    List<String> expected = Arrays.asList("1234", "10", "100");
    Assert.assertEquals(expected, actual);
}
}
