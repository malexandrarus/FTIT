package com.ftit.thirdassignment;

public class Main {
    public static void main(String[] args) {
        printCalculatorResults();
        printLogicalOp();
    }

    public static void printCalculatorResults() {
        Calculator calculator = new Calculator();

        int a = 39;
        int b = 59;
        System.out.println("The Sum of " + a + " and " + b + " is : " + calculator.sumOfTwoNumbers(a, b));

        double x = 34;
        double y = 50;
        System.out.println("The Division of " + x + " and " + y + " is : " + calculator.divisionOfTwoNumbers(x, y));

        double m = 120.3;
        double n = 234.7;
        System.out.println("The Multiplication of " + m + " and " + n + " is : " + calculator.multiplicationOfTwoNumbers(m, n));

        int c = 2345;
        int d = 123;
        System.out.println("The Subtraction of " + c + " and " + d + " is : " + calculator.subtractionOfTwoNumbers(c, d));

        int h = 3;
        int i = 4;
        int j = 5;
        System.out.println("The Average of " + h + " and " + i + " and " + j + " is : " + calculator.averageBetweenThreeNumbers(h, i, j));

        int e = 10;
        int f = 3;
        System.out.println("The Modulo of " + e + " and " + f + " is : " + calculator.moduloOfTwoNumbers(e, f));

    }

    public static void printLogicalOp() {
        LogicalOp op = new LogicalOp();

        int max = op.checkBiggerNumber(10, 17);
        System.out.println("The bigger number is: " + max);

        String text = op.verifyTextFastTrack("FastTra");
        System.out.println(text);

        String text1 = op.verifyTextAndNumber("FastTrack", 5);
        System.out.println(text1);

        String text2 = op.forecastSnow(2);
        System.out.println(text2);

        op.verifyGivenNumber(23);

        op.printMultipleOptions(3);

        System.out.println("Is the number even? " + op.isNumberEven(13));

        System.out.println("Is the person eligible to vote? " + op.isEligibleToVote(16));

        System.out.println("The max number is: " + op.verifyBiggerNumber(19,13,10));

    }
}
