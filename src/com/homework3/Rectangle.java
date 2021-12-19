package com.homework3;

public class Rectangle extends Rectangular{


    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getSquare () {
        System.out.println("Square of the Rectangle is " + a * b);
    }
}
