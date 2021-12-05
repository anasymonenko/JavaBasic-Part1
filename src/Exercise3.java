import java.util.Scanner;

public class Exercise3 {
    //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

    public void operation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));

        System.out.println(num1 + "-" + num2 + "=" + (num1-num2));

        System.out.println(num1 + "*" + num2 + "=" + (num1*num2));

        System.out.println(num1 + "/" + num2 + "=" + (num1/num2));

        System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
    }
}

