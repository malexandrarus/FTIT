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
}
