package com.ftit.secondassignment;
/*
This class was created to resolve requirements for Exercise 1
 */
public class FirstAssignmentRefined {
    public static void main(String[] args) {

        printMyName();
        sumOfTwoNumbers(4,8);
        divisionOfTwoNumbers(2.3,7);
        calculateOperationA();
        calculateOperationB();
        calculateOperationC();
        calculateOperationD();
    }

    public static void printMyName() {
        System.out.println("Hello" + '\n' + "Alexandra");
    }

    public static void sumOfTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The Sum of a and b is : " + sum);
    }

    public static void divisionOfTwoNumbers(double x, double y) {
        double div =  x / y;
        System.out.println("The Division of x and y is : " + div);
    }

    public static void calculateOperationA() {
        int operation = -5 + 8 * 6;
        System.out.println("The result for operation a is : " +operation);
    }

    public static void calculateOperationB() {
        int operation = (55+9) % 9;
        System.out.println("The result for operation b is : " + operation);
    }

    /*
    Used implicit double values for the first operand of division, so it will force the result to be double
     */
    public static void calculateOperationC() {
        double operation = 20 + -3.0*5.0 / 8;
        System.out.println("The result for operation c is : " + operation);
    }

    /*
    Used casting instead of implicit double value for operands to make sure that the result is a double
     */
    public static void calculateOperationD() {
        double operation = 5 + (double)15 / 3 * 2 - 8 % 3;
        System.out.println("The result for operation d is : " + operation);
    }
}
