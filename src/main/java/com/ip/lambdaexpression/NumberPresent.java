package com.ip.lambdaexpression;

import java.util.stream.Stream;

/**
 * @author PRATAP.
 * Wap to check number present in stream or not.
 */
public class NumberPresent {

/**
 * @param numbers number.
 * @param num     single number.
 * @return number.
 */
public boolean isANumberPresentInStream(
final Stream<Integer> numbers, final int num) {
return numbers.anyMatch(i -> i == num);
}
}
