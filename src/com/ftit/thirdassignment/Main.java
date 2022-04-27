package com.ftit.thirdassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /*
    Helper method that prints an array
     */
    public static void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+", ");
        }
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

        op.countFromNumberUntil100(1);

        op.countDownFromNumber(0);

        op.countFromXToY(20,26);

        op.countMinToMaxNumber(4,10);

        op.printEvenNumbers();

        op.printOddNumbers();

        System.out.println("The sum from first number to 100 is: " + op.calculateSumOfNumbers(1));

        System.out.println("The average is: " + op.calculateAverageOfNumbers(1));

        op.displayPattern();

        op.countFromNumberUntil100WhileVersion(2);

        op.countDownFromNumberWhileVersion(0);

        op.countFromXToYWhileVersion(2, 9);

        op.countMinToMaxNumberWhileVersion(4, 9);

        op.printEvenNumbersWhileVersion();

        op.printOddNumbersWhileVersion();

        op.calculateAverageOfNumbersWhileVersion();

        System.out.println("The average of numbers divisible by 7 is: " + op.calculateAverageOfNumbersDivisibleBy7(1, 22));

        op.first20NumbersOfFibonacci();

        op.CozaLozaWoza();

        System.out.println();

        int[] myArray = op.populateArrayToNumber(100);

        printArray(myArray);

        System.out.println();

        printArray(op.evenNumbersFromArray(myArray));

        System.out.println();
        int [] numbers = {10, 9, 4};
        System.out.println("The average is: " + op.calculateAverageOfNumbersFromArray(numbers));

        System.out.println();
        String[] words = {"animal", "human", "an" };
        String sequence = "an";
        System.out.println(op.verifyStringOccurrence(words,sequence));

        int[] numbersInt = {10,5,8,9};
        int number = 5;
        System.out.println(op.verifyNumberOccurrence(numbersInt, number));

        System.out.println();
        op.printPattern();

        System.out.println();
        int[] numbersArr = {2,4,5,7,8};
        op.verifyNumberFromArray(numbersArr,4);


        System.out.println();
        op.getSecondSmallestElement(new int[] {10, 50, 41, 12, 4});

        System.out.println();
        int numbersArray [] = {10,15,20,25,30};
        int copy [] = new int[numbersArray.length];
        op.copyElementsFromAnArray(numbersArray, copy);

        System.out.println();
        op.insertElementAtPosition(new int[] {10, 50, 41, 12, 4}, 1, 5);

        System.out.println();
        int[] num =  {10, 50, 41, 12, 4};
        op.printMinMaxNumber(num);

        op.printReversedArray(num);

        System.out.println();
        op.duplicateValuesFromArray(new int[] {1, 4, 5, 4, 2, 1});

        System.out.println();
        op.commonElements((new String[] {"white", "blue" , "purple"}), new String[] {"pink", "blue" , "beige"});

        System.out.println();
        op.orderElementsAsc(new int[] {10, 67, 55, 4, 21, 1});

        System.out.println();
        List<Integer> list = Arrays.asList(7, 2, 10, 8);
        op.displayValuesFromAList(list);

        System.out.println();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        op.addNumberAtTheEndOfTheList(list1, 7);

        System.out.println();
        op.printListFromGivenNumber(list, 2);

        System.out.println();
        op.printReversedList(list1);

        System.out.println();
        List<String> stringList = new ArrayList<>();
        stringList.add("Blue");
        stringList.add("White");
        stringList.add("Red");
        stringList.add("Green");
        op.addStringParamToList(stringList, 1, "Pink");

        System.out.println();
        op.addElementOnFirstPositionOnAList(list1, 10);

        System.out.println();
        op.displayValuesAndIndexFromAList(list1);

        System.out.println();
        op.getBiggerNumber(list1);

        System.out.println();
        op.changePositionForTwoElementsInAList(list1, 2, 3);

        System.out.println();
        op.listOfEvenNumbers(list1);

        System.out.println();
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(9);
        list2.add(2);
        list2.add(0);
        op.sortList(list2);

    }
}
