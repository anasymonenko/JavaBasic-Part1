package com.homework2;
/* 4.	Given the following class, called NumberHolder, write some code that creates an instance of the class, initializes its two member variables, and then displays the value of each member variable.
public class NumberHolder {
    public int anInt;
    public float aFloat;
*/

public class NumberHolder {
    private int anInt;
    private float aFloat;

    public NumberHolder (int anInt, float aFloat){
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    void displayNumberHolder(){
        System.out.println("Int is: " + anInt + ";" + "Float is: " + aFloat);
    }
}
