package com.homework6;

interface StringFunction {
    String run(String str);
}

public class Hello {

    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s = s + "!";
        StringFunction ask = (s) -> s = s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.print(result);
    }
}
