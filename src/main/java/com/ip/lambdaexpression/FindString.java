package com.ip.lambdaexpression;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author PRATAP
 *
 */
public class FindString {
/**
 * @param listOfStrings is listStrings
 * @param ch single String
 * @return values
 */
public String findFirstStringStartsWithOneCharacter(
final Stream<String> listOfStrings, final String ch) {

Optional<String> firstStringWithCharacter = listOfStrings.filter(i
-> i.startsWith(ch)).findFirst();

if (firstStringWithCharacter.isPresent()) {
return firstStringWithCharacter.get();
}
return null;
}
}
