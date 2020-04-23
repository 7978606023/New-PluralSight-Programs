package com.ip.model;

/**
 *
 * @author Pratap
 */
public class CityPerson {

    /**
     * Declaring name.
     */
    private String name;
    /**
     *Declaring age.
     */
    private int age;

    /**
     * constructor.
     */
    public CityPerson() {
    }

    /**
     * @param name name
     * @param age
     */
    public CityPerson(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age age
     */
    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
}
