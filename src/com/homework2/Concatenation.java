package com.homework2;

/*	Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
Test Data:
String 1: PHP Exercises and
String 2: Python Exercises */

public class Concatenation {

    String str1 = "PHP Exercises and";
    String str2 = "Python Exercises";



    void printStrings (){
        System.out.println("First String is " + str1);
        System.out.println("Second String is " + str2);
    }

    void printConcat() {
        /* String newStr1 = str1.replace("P", "").replace("p","");
        String newStr2 = str2.replace("P", "").replace("p","");

        String concatString = newStr1.concat(" ").concat(newStr2);

        System.out.println("The concatenated string with replacements: " + concatString);
        */

        System.out.println("The concatenated string with replacements: " + str1.replace("P", "").replace("p", "").concat(" ").concat(str2.replace("P", "").replace("p", "")));
    }
}
