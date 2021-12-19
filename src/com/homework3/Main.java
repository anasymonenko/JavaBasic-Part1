package com.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Vector
        Vector vector = new Vector(2.14, 5.07, 9.03);
        System.out.println("Vector: x = " + vector.x + ", z = " + vector.z + ", y = " + vector.y);
        System.out.println("The length of this 3d vector is: " + vector.getLength());
        System.out.println("The dot product of vectors is: " +
                vector.getScalarMultiplication(new Vector(5.01, 3.24, 6.12)));
        System.out.println(Arrays.toString(Vector.returnRandomVectors(6)) + "\n");

        //Shapes
        Circle circle = new Circle(4);
        circle.getSquare();

        Oval oval = new Oval(4,2);
        oval.getSquare();

        Square square = new Square(5);
        square.getSquare();

        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.getSquare();
    }
}
