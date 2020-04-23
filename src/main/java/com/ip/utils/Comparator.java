package com.ip.utils;

import java.util.function.Function;

/**
 * @author PRATAP
 *
 * @param <T> <T>
 */
@FunctionalInterface
public interface Comparator<T> {

    /**
     * @param t1 t1
     * @param t2 t2
     * @return value
     */
int compare(T t1, T t2);

    /**
     * @param cmp cmp
     * @return value
     */
    default Comparator<T> thenComparing(Comparator<T> cmp) {

        return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2)
        : compare(p1, p2);
    }

    /**
     * @param f f
     * @return value
     */
    default Comparator<T> thenComparing(Function<T, Comparable> f) {

        return thenComparing(comparing(f));
    }

    /**
     * @param <U> <u>
     * @param f f
     * @return value
     */
    static <U> Comparator<U> comparing(Function<U, Comparable> f) {

        return (p1, p2) ->  f.apply(p1).compareTo(f.apply(p2));
    }
}
