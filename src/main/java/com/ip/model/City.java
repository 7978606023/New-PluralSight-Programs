package com.ip.model;


/**
 * @author Pratap
 */
public class City {

/**
*Declaring name.
*/
    private String name;

    /**
     *constructor.
     */
    public City() {
    }

    /**
     * @param name name
     */
    public City(final String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "City{" + "name=" + name + '}';
    }
}
