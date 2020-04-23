package com.ip.lambdaexpression;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PRATAP.
 * Wap to use filter method.
 */
public class SampleFilter {

/**
 * @param num number.
 * @return list.
 */
public List<Integer> findOutEvenNum(final List<Integer> num) {
List<Integer> list = num.stream()
.filter(i -> i % 2 == 0)
.collect(Collectors.toList());
return list;
}

}

