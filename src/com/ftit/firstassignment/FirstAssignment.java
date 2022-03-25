package com.ftit.firstassignment;

public class FirstAssignment {

    public static void main(String[] args) {

        System.out.println("Hello" + '\n' + "Alexandra");
        System.out.println("The Sum of a and b is : " + sumOfTwoNumbers(4,8) );
        System.out.println("The Division of x and y is : " + divisionOfTwoNumbers(2.3,7));
        System.out.println("The result for operation a is : " + calculateOperationA());
        System.out.println("The result for operation b is : " + calculateOperationB());
        System.out.println("The result for operation c is : " + calculateOperationC());
        System.out.println("The result for operation d is : " + calculateOperationD());
    }



    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static double divisionOfTwoNumbers(double x, double y) {
        return x / y;
    }

    public static int calculateOperationA() {
        return -5 + 8 * 6;
    }

    public static int calculateOperationB() {
        return (55+9) % 9;
    }

    /*
    Used implicit double values for the first operand of division, so it will force the result to be double
     */
    public static double calculateOperationC() {
        return 20 + -3.0*5.0 / 8;
    }

    /*
    Used casting instead of implicit double value for operands to make sure that the result is a double
     */
    public static double calculateOperationD() {
        return 5 + (double)15 / 3 * 2 - 8 % 3;
    }
}
