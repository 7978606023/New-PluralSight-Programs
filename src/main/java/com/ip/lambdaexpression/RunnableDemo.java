package com.ip.lambdaexpression;

/**
 * @author PRATAP
 *
 */
public class RunnableDemo {

/**
* @param args args
*/
public static void main(final String[] args) {
Runnable r = () -> {
int i = 0;
while (i++ < 10) {
System.out.println("It works!");
}
};
new Thread(r).start();
}
}
