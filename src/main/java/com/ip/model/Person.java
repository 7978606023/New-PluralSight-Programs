package com.ip.model;


/**
 * @author PRATAP
 *
 */
public class Person {

 /**
 *Declairing firstname.
 */
private String firstName;
 /**
 *Declairing lastname.
 */
private String lastName;
 /**
 *Declaring age.
 */
private int age;

/**
 * Constructor.
 */
public Person() {
   }

 /**
 * @param firstName firstname
 * @param lastName lastname
 * @param age age
 */
public Person(final String firstName, final String lastName, final int age) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
   }

 /**
 * @return firstname
 */
public String getFirstName() {
       return firstName;
   }

 /**
 * @param firstName firstname
 */
public void setFirstName(final String firstName) {
       this.firstName = firstName;
   }

 /**
 * @return lastname
 */
public String getLastName() {
       return lastName;
   }

 /**
 * @param lastName lastname
 */
public void setLastName(final String lastName) {
       this.lastName = lastName;
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
       return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + '}';
   }
}
