package com.homework3;

import static java.lang.Math.pow;

public abstract class Rectangular implements Shape{

    protected double a;
    protected double b;
    protected double c;
    private static final int s = 2;

    public void getSquare() {
        System.out.println("The area of the Square is " + pow(a, s));
    }
}
