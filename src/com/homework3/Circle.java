package com.homework3;

import static java.lang.Math.pow;

public class Circle extends Round {

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public void getSquare() {
        System.out.println("Square of the Circle is " + pi * pow(radius, s));
    }
}
