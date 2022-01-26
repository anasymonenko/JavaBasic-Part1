package com.homework6;

import java.util.*;
import java.util.stream.Collectors;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args){

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        System.out.println("All unique names from the list for adults: " + getAdultsFirstName(personList));
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static Set<String> getAdultsFirstName(List<Person> allPersons){

        return allPersons.stream()
                .filter(Objects::nonNull)
                .distinct()
                .filter(adult -> adult.getAge() >= 18)
                .map(person -> person.getFirstName().toUpperCase(Locale.ROOT).trim())
                .filter(name -> !name.isEmpty())
                .collect(Collectors.toSet());
    }
}
