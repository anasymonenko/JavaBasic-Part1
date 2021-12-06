package com.homework1;

import java.util.Scanner;

public class Exercise3 {
    //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    int num1;
    int num2;

    private int customScanner(String txt) {
        Scanner sc = new Scanner(System.in);

        System.out.print(txt);
        int num1 = sc.nextInt();
        return num1;
    }

    public void inputValue() {
        num1 = customScanner("Input first number: ");
        num2 = customScanner("Input second number: ");
    }
    public void printSum () {System.out.println("Exercise 3: \n" + num1 + "+" + num2 + "=" + (num1 + num2));}
    public void printDeduct () {System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));}
    public void printMultiply () {System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));}
    public void printDivide (){System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));}
    public void printMod (){System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));}
}


