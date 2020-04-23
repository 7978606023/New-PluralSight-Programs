package com.ip.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleMapTest {

/**
 *
 */
private SampleMap samplemap = null;

/**
*
*/
@BeforeTest
public void setUP() {
samplemap = new SampleMap();
}

/**
* 
*/
@Test
public void testWithMultiplyNum() {
List<Integer> list = new ArrayList<Integer>();
list.add(5);
list.add(10);
list.add(20);
list.add(10);
List<Integer> actual= SampleMap.multiplyNum(list);
List<Integer> expected = Arrays.asList(25, 100, 400, 100);
Assert.assertEquals(actual, expected);
}

@Test
public void TestWithEvenNum() {
List<Integer> list = new ArrayList<Integer>();
list.add(4);
list.add(8);
list.add(2);
list.add(12);
List<Integer> actual= SampleMap.multiplyNum(list);
List<Integer> expected = Arrays.asList(16, 64, 4, 144);
Assert.assertEquals(actual, expected);
}

@Test
public void TestWithOddNum() {
List<Integer> list = new ArrayList<Integer>();
list.add(5);
list.add(7);
list.add(9);
list.add(11);
List<Integer> actual= SampleMap.multiplyNum(list);
List<Integer> expected = Arrays.asList(25, 49, 81, 121);
Assert.assertEquals(actual, expected);
}

@Test
public void TestWithZero() {
List<Integer> list = new ArrayList<Integer>();
list.add(0);
List<Integer> actual= SampleMap.multiplyNum(list);
List<Integer> expected = Arrays.asList(0);
Assert.assertEquals(actual, expected);
}

@Test
public void TestWithMinusNum() {
List<Integer> list = new ArrayList<Integer>();
list.add(-4);
list.add(-25);
list.add(-2);
list.add(-1);
List<Integer> actual= SampleMap.multiplyNum(list);
List<Integer> expected = Arrays.asList(16, 625, 4, 1);
Assert.assertEquals(actual, expected);
}

}
