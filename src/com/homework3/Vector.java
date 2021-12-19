package com.homework3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector {

    public double x;
    public double z;
    public double y;
    protected static final int s = 2;

    public Vector (double x, double z, double y) {
        this.x = x;
        this.z = z;
        this.y = y;

    }


    public double getLength () {
       return sqrt(pow(x, s) + pow(y,s) + pow(z,s));
    }

    public double getScalarMultiplication (Vector v2) {
       return (x * v2.x + y * v2.y + z * v2.z);
    }

    public static Vector[] returnRandomVectors (int arrayLength) {
        Vector[] randomVector = new Vector[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomVector[i] = new Vector(Math.random() * 20 - 10, Math.random() * 20 - 10, Math.random() * 20 - 10);
        }
        return randomVector;
    }

    @Override
    public String toString () {
        return "\nVector: x = " + this.x + ", z = " + this.z + ", y = " + this.y;
    }

}
