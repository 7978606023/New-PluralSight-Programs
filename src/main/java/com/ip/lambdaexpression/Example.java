package com.ip.lambdaexpression;

import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @author PRATAP
 *
 */
public class Example {

    /**
     * @param team team
     */
    public static void printTeamWithoutStreams(final List<Person> team) {
        Set<Person> freshBlood = new HashSet<>();

        for (Person person : team) {
            if (person.age <= 25) {
                freshBlood.add(person);
            }
        }

        List<Person> sortedFreshBlood = new ArrayList<>(freshBlood);
        Collections.sort(sortedFreshBlood, new Comparator<Person>() {
            @Override
            public int compare(final Person o1, final Person o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });

        for (Person person : sortedFreshBlood) {
            System.out.println(person.name);
        }
    }

    /**
     * @param team team
     */
    public static void printTeam(final List<Person> team) {
        team.stream()
                .filter(person -> person.age <= 25)
                .collect(Collectors.toSet())
                .stream()
                .sorted(comparing(person -> person.age))
                .forEach(person -> System.out.println(person.name));
    }

    /**
     * @author PRATAP
     *
     */
    private static class Person {
        /**
         * Declaring name.
         */
        private String name;
        /**
         *Declaring age.
         */
        private int age;

        /**
         * @param name name
         * @param age age
         */
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
