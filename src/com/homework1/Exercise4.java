package com.homework1;

public class Exercise4 {
    //Write a Java program to sum values of an array.
    int[] array = {5,6,7,12,-5,32,43};
    int sum = 0;

    public void sumArr() {
        for( int i : array) {
            sum += i;
        }
        System.out.println("Exercise 4: Sum values of an array: " + sum);
    }
}
