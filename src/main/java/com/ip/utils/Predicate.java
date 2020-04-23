package com.ip.utils;

/**
 * @author PRATAP
 *
 * @param <T> <t>
 */
@FunctionalInterface
public interface Predicate<T> {

    /**
     * @param t t
     * @return value
     */
    boolean test(T t);

    /**
     * @param other other 
     * @return value
     */
    default Predicate<T> and(Predicate<T> other) {
        return t -> test(t) && other.test(t);
    }

    /**
     * @param other other
     * @return value
     */
    default Predicate<T> or(Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }
   /**
 * @param <U> <u>
 * @param u u
 * @return value
 */
static <U> Predicate<U> isEqualsTo(U u) {
        return s -> s.equals(u);
    }
}
