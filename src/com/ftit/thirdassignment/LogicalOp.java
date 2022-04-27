package com.ftit.thirdassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogicalOp {
    /*
    This method is used for Exercise 3
     */
    public int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    /*
    This method is used for Exercise 4
     */
    public String verifyTextFastTrack(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    /*
    This method is used for Exercise 5
     */
    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }

    /*
    This method is used for Exercise 6
     */
    public String forecastSnow(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was :" + number + "cm";
        } else {
            return "The forecast snow is : " + number + "cm";
        }
    }

    /*
    This method is used for Exercise 7
     */
    public void verifyGivenNumber(int number) {
        if ((number > 3) && (number != 4)) {
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            System.out.println("The number is equal to 4");
        } else if (number < 3) {
            System.out.println("The number is lower than 3");
        }
    }

    /*
   This method is used for Exercise 8
    */
    public void printMultipleOptions(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is:  1!");
                break;
            case 2:
                System.out.println("The number is:  2 ");
                break;
            case 3:
                System.out.println("The number is:  3 ");
                break;
            case 4:
                System.out.println("The number is:  4 ");
                break;
            case 5:
                System.out.println("The number is:  5 ");
                break;
            default:
                System.out.println("The number is greater than 5");
        }
    }

    /*
  This method is used for Exercise 9
   */
    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    /*
    This method is used for Exercise 9
    */
    public boolean isEligibleToVote(int age) {
        return age > 18;
    }

    /*
   This method is used for Exercise 9
   */
    public int verifyBiggerNumber(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }


    /*
    This method is used for Exercise 1 for Java For Loops homework
   */
    public void countFromNumberUntil100(int n) {
        for (int i = n; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    /*
   This method is used for Exercise 2 for Java For Loops homework
  */
    public void countDownFromNumber(int n) {
        for (int i = n; i >= -100; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    /*
  This method is used for Exercise 3 for Java For Loops homework
 */
    public void countFromXToY(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    /*
 This method is used for Exercise 4 for Java For Loops homework
*/
    public void countMinToMaxNumber(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        } else {
            for (int i = y; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    /*
    This method is used for Exercise 5 for Java For Loops homework
   */
    public void printEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (isNumberEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    /*
    This method is used for Exercise 6 for Java For Loops homework
   */
    public void printOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (!isNumberEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    /*
    This method is used for Exercise 7 for Java For Loops homework
   */
    public int calculateSumOfNumbers(int startNumber) {
        int sum = 0;
        for (int i = startNumber; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    /*
   This method is used for Exercise 8 for Java For Loops homework
  */
    public double calculateAverageOfNumbers(int startNumber) {
        double sum = 0;
        int count = 0;
        for (int i = startNumber; i <= 100; i++) {
            sum += i;
            count++;
        }
        return sum / count;
    }

    /*
   This method is used for Exercise 9 for Java For Loops homework
  */
    public void displayPattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
 This method is used for Exercise 1 for Java While Loop homework
*/
    public void countFromNumberUntil100WhileVersion(int n) {
        while (n <= 100) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
    }

    /*
    This method is used for Exercise 2 for Java While Loop homework
    */
    public void countDownFromNumberWhileVersion(int n) {
        while (n >= -100) {
            System.out.print(n + "");
            n--;
        }
        System.out.println();
    }

    /*
   This method is used for Exercise 3 for Java While Loop homework
   */
    public void countFromXToYWhileVersion(int x, int y) {
        while (x <= y) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
    }

    /*
   This method is used for Exercise 4 for Java While Loop homework
   */
    public void countMinToMaxNumberWhileVersion(int x, int y) {
        while (y <= x) {
            System.out.print(y + " ");
            y++;
        }
        System.out.println();

        while (x <= y) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
    }

    /*
   This method is used for Exercise 5 for Java While Loop homework
   */
    public void printEvenNumbersWhileVersion() {
        int i = 1;
        while (i <= 100) {
            if (isNumberEven(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    /*
  This method is used for Exercise 6 for Java While Loop homework
  */
    public void printOddNumbersWhileVersion() {
        int i = 1;
        while (i <= 100) {
            if (!isNumberEven(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    /*
 This method is used for Exercise 7 for Java While Loop homework
 */
    public void calculateAverageOfNumbersWhileVersion() {
        double sum = 0;
        int count = 0;
        int i = 111;
        while (i <= 8899) {
            sum += i;
            i++;
            count++;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum / count);
    }

    /*
 This method is used for Exercise 8 for Java While Loop homework
 */
    public double calculateAverageOfNumbersDivisibleBy7(int firstNumber, int lastNumber) {
        int count = 0;
        double sum = 0;
        while (firstNumber <= lastNumber) {
            if (firstNumber % 7 == 0) {
                sum += firstNumber;
                count++;
            }
            firstNumber++;
        }
        return sum / count;
    }

    /*
 This method is used for Exercise 9 for Java While Loop homework
 */
    public void first20NumbersOfFibonacci() {
        int x = 0;
        int y = 1;
        int counter = 0;
        System.out.print("The first 20 Fibonacci numbers are : ");
        while (counter < 20) {
            System.out.print(x + " ");
            int z = y + x;
            x = y;
            y = z;
            counter = counter + 1;
        }
        System.out.println();
    }

    /*
 This method is used for Exercise 10 for Java While Loop homework
 */
    public void CozaLozaWoza() {
        int i = 1;
        int j = 0;
        while (i <= 110) {
            // Check division by 11 so that we can move the printing to a new line
            if (j % 11 == 0) {
                System.out.println();
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            i++;
            j++;
        }

    }

    /*
 This method is used for Exercise 2 for Java Arrays homework
 */
    public int[] populateArrayToNumber(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    /*
    This method is used for Exercise 3 for Java Arrays homework
 */
    public int[] evenNumbersFromArray(int[] numbers) {
        int i = 0;
        int[] evenNumbers = new int[numbers.length / 2];
        for (int number : numbers) {
            if (isNumberEven(number)) {
                evenNumbers[i] = number;
                i++;
            }
        }
        return evenNumbers;
    }

    /*
 This method is used for Exercise 4 for Java Arrays homework
*/
    public double calculateAverageOfNumbersFromArray(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    /*
  This method is used for Exercise 5 for Java Arrays homework
*/
    public boolean verifyStringOccurrence(String[] words, String sequence) {
        boolean stringOccurs = false;
        for (String word : words) {
            if (word.contains(sequence)) {
                stringOccurs = true;
                break;
            }
        }
        return stringOccurs;
    }

    /*
    This method is used for Exercise 6 for Java Arrays homework
 */
    public int verifyNumberOccurrence(int[] numbersInt, int number) {
        int poz = 0;
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i] == number) {
                poz = i;
                break;
            }
        }
        return poz;
    }

    /*
    This method is used for Exercise 7 for Java Arrays homework
 */
    public void printPattern() {
        String[] patterns = new String[10];
        Arrays.fill(patterns, "-");
        for (String element : patterns) {
            for (String pattern : patterns) {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    /*
   This method is used for Exercise 8 for Java Arrays homework
*/
    public void verifyNumberFromArray(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                int[] arrayAfterDelete = removeElement(numbers, i);
                System.out.println(Arrays.toString(arrayAfterDelete));
                break;
            }
        }
    }

    private int[] removeElement(int[] numbers, int index) {
        int[] copy = new int[numbers.length - 1];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != index) {
                copy[j] = numbers[i];
                j++;
            }
        }
        return copy;
    }

    /*
  This method is used for Exercise 9 for Java Arrays homework
*/
    public void getSecondSmallestElement(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(numbers[1]);
    }

    /*
    This method is used for Exercise 10 for Java Arrays homework
*/
    public void copyElementsFromAnArray(int[] numbers, int[] copy) {
        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        System.out.println(Arrays.toString(copy));
    }

    /*
  This method is used for Exercise 1 for Tema optionala - Java Arrays
*/
    public void insertElementAtPosition(int[] numbers, int index, int value) {
        for (int i = numbers.length - 1; i > index; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[index] = value;
        System.out.println(Arrays.toString(numbers));
    }

    /*
    This method is used for Exercise 2 for Tema optionala - Java Arrays
*/
    public void printMinMaxNumber(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int currentIterationValue = numbers[i];
            if (max < currentIterationValue) {
                max = currentIterationValue;
            }

            if (min > currentIterationValue) {
                min = currentIterationValue;
            }
        }
        System.out.println("The min is " + min + " The max is " + max);
    }

    /*
  This method is used for Exercise 3 for Tema optionala - Java Arrays
*/
    public void printReversedArray(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    /*
   This method is used for Exercise 4 for Tema optionala - Java Arrays
*/
    public void duplicateValuesFromArray(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (isNumberPresent(removeElement(numbers, i), numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    private Boolean isNumberPresent(int[] numbers, int number) {
        boolean isNumberPresent = false;
        for (int num : numbers) {
            if (num == number) {
                isNumberPresent = true;
            }
        }
        return isNumberPresent;
    }

    /*
    This method is used for Exercise 5 for Tema optionala - Java Arrays
*/
    public void commonElements(String[] firstArray, String[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            if (verifyStringOccurrence(secondArray, firstArray[i])) {
                System.out.println(secondArray[i] + " ");
            }
        }
    }

    /*
   This method is used for Exercise 6 for Tema optionala - Java Arrays
*/
    public void orderElementsAsc(int[] numbers) {
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    /*
   This method is used for Exercise 1 for Tema - Liste
*/
    public void displayValuesFromAList(List<Integer> list) {
        for (Integer element : list) {
            System.out.println(element);
        }
    }

    /*
   This method is used for Exercise 2 for Tema - Liste
*/
    public void addNumberAtTheEndOfTheList(List<Integer> list, int number) {
        list.add(number);
        System.out.println(list);
    }

    /*
    This method is used for Exercise 3 for Tema - Liste
*/
    public void printListFromGivenNumber(List<Integer> list, int num) {
        int startIndex = 0;
        for (int j = 0; j < list.size(); j++) {
            if (num == list.get(j)) {
                startIndex = j;
            }
        }
        for (int i = startIndex; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    /*
    This method is used for Exercise 4 for Tema - Liste
*/
    public void printReversedList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    /*
    This method is used for Exercise 5 for Tema - Liste
*/
    public void addStringParamToList(List<String> stringList, int index, String strToBeAdded) {
        for (int i = 0; i < stringList.size(); i++) {
            if (index == i) {
                stringList.add(index, strToBeAdded);
            }
        }
        System.out.println(stringList);
    }

    /*
    This method is used for Exercise 6 for Tema - Liste
*/
    public void addElementOnFirstPositionOnAList(List<Integer> list, int elementToBeAdded) {
        list.add(0, elementToBeAdded);
        System.out.println(list);
    }

    /*
    This method is used for Exercise 7 for Tema - Liste
*/
    public void displayValuesAndIndexFromAList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println("For position " + i + " the value is: " + list.get(i));
    }

    /*
   This method is used for Exercise 8 for Tema - Liste
*/
    public void getBiggerNumber(List<Integer> list) {
        int maxValue = 0;
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println("The maximum value is: " + maxValue);
    }

    /*
   This method is used for Exercise 1 for Tema optionala - Lists
*/
    public void changePositionForTwoElementsInAList(List<Integer> list, int i, int j) {
        list.set(i, list.get(j));
        list.set(j, list.get(i));
        System.out.println(list);
    }

    /*
   This method is used for Exercise 2 for Tema optionala - Lists
*/
    public void listOfEvenNumbers(List<Integer> list) {
        List<Integer> evenNumber = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenNumber.add(list.get(i));
            }
        }
        System.out.println(evenNumber);
    }

    /*
   This method is used for Exercise 3 for Tema optionala - Lists
*/
    public void sortList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int val = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, val);
                }
            }
        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}
