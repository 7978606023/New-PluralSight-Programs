package com.ip.lambdaexpression;

import java.util.function.BinaryOperator;

/**
 * @author PRATAP
 *
 */
public class BinaryOperators {

/**
 * @param num1 numvalue
 * @param num2 numvalue
 * @return value
 */
public Integer additionTwoNum(final int num1, final int num2) {

BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;

return func2.apply(num1, num2);

}
}
