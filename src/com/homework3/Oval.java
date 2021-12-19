package com.homework3;

public class Oval extends Round {

    public Oval (double majorAxisLength, double minorAxisLength) {
        this.majorAxisLength = majorAxisLength;
        this.minorAxisLength = minorAxisLength;
    }

    @Override
    public void getSquare(){
        System.out.println("Square of the Oval is " + pi * majorAxisLength * minorAxisLength);
    }
}
