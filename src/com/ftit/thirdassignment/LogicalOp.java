package com.ftit.thirdassignment;

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
        System.out.print( "The first 20 Fibonacci numbers are : " );
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
}
