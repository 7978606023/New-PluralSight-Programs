package com.ip.lambdaexpression;

import com.ip.utils.Predicate;

/**
 * @author PRATAP
 *
 */
public class MainPredicate {

/**
 * @param str str
 * @return value
 */
public boolean checkLengthOfString(final String str) {
Predicate<String> p1 = s -> s.length() < 10;
return p1.test(str);
}
}
