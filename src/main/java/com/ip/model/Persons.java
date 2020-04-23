package com.ip.model;

import java.time.LocalDate;
import java.time.Period;

/**
 * A simple class that represents a person.
 */
public class Persons {

    /**
     * @author PRATAP
     *
     */
    public enum Gender {
        /**
         * Declairng male and female.
         */
        MALE, FEMALE
    }

    /**
     * Declairing firstname.
     */
    private final String firstName;
    /**
     * Declairing lastname.
     */
    private final String lastName;
    /**
     * Declairing birthday.
     */
    private final LocalDate birthDay;
    /**
     * Declairing gender.
     */
    private Gender gender;

    /**
     * @param firstname firstname
     * @param lastName lastname
     * @param birthDay birthday
     * @param gender gender
     */
    public Persons(final String firstname, final String lastName,
    final LocalDate birthDay, final Gender gender) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    /**
     * @return firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return lstname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return birthday
     */
    public LocalDate getBirthDay() {
        return birthDay;
    }

    /**
     * @return gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender gender
     */
    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    /**
     * @return value
     */
    public int getAge() {
        return Period.between(getBirthDay(), LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }

        Persons person = (Persons) o;

        if (birthDay != null ? !birthDay.equals(person.birthDay)
        : person.birthDay != null) {
        return false;
        }
        if (gender != person.gender) {
        return false;
        }
        if (lastName != null ? !lastName.equals(person.lastName)
        : person.lastName != null) {
        return false;
        }
        if (firstName != null ? !firstName.equals(person.firstName)
        : person.firstName != null) {
        return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{"
    + "firstName='" + firstName + '\''
    + ", lastName='" + lastName + '\''
    + ", birthDay=" + birthDay
    + ", gender=" + gender
    + '}';
    }
}
