package com.ftit.secondassignment;
/*
This class was created to resolve requirements for Exercise 2, Exercise 4 and Exercise 6
 */
public class Calculator {
    public static void main(String[] args) {
        int a = 39;
        int b = 59;
        System.out.println("The Sum of " + a + " and " + b + " is : " + sumOfTwoNumbers(a,b));

        double x = 34;
        double y = 50;
        System.out.println("The Division of " + x + " and " + y + " is : " + divisionOfTwoNumbers(x,y));

        double m = 120.3;
        double n = 234.7;
        System.out.println("The Multiplication of " + m + " and " + n + " is : " +  multiplicationOfTwoNumbers(m,n));

        int c = 2345;
        int d = 123;
        System.out.println("The Subtraction of " + c + " and " + d + " is : " + subtractionOfTwoNumbers(c,d));

        int h = 3;
        int i = 4;
        int j = 5;
        System.out.println("The Average of " + h + " and " + i + " and " + j + " is : " + averageBetweenThreeNumbers(h,i,j));

        int e = 10;
        int f = 3;
        System.out.println("The Modulo of " + e + " and " + f + " is : " + moduloOfTwoNumbers(e,f));

    }
    public static int sumOfTwoNumbers(int x, int y) {
        return x + y;
    }

    public static double divisionOfTwoNumbers(double x, double y) {
        return x / y;
    }

    public static double multiplicationOfTwoNumbers(double x, double y) {
        return x * y;
    }

    public static int subtractionOfTwoNumbers(int x, int y) {

        return x - y;
    }

    public static double averageBetweenThreeNumbers(double x, double y, double z) {
        return (x + y + z)/3;
    }

    public static int moduloOfTwoNumbers(int x, int y) {
        return x % y;
    }
}
