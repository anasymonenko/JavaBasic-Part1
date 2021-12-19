package com.homework3;

import static java.lang.Math.pow;

public abstract class Round implements Shape {

    protected static final double pi = 3.14159;
    protected static final int s = 2;
    protected double radius;
    protected double majorAxisLength;
    protected double minorAxisLength;


    public void getSquare() {
        System.out.println(pi + pow(radius, s));
    }
}
