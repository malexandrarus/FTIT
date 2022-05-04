package com.ftit.seventhassignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

    /*
   This method is used for Exercise 1 for Tema - Try-Catch
*/
    public int getInputNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            try {
                System.out.println("Enter a valid number:");
                x = scan.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("The value you entered '" + scan.nextLine() + "' is not valid. Please choose a numeric value.");
            }
        } while (true);
    }

    /*
  This method is used for Exercise 2 for Tema - Try-Catch
*/
    public Long getInputLongNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        long x;
        do {
            try {
                System.out.println("Enter a valid number:");
                x = scan.nextLong();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("The value you entered '" + scan.nextLine() + "' is not valid. Please choose a numeric value.");
            }
        } while (true);
    }

    public Float getInputFloatNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        float x;
        do {
            try {
                System.out.println("Enter a valid number:");
                x = scan.nextFloat();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("The value you entered '" + scan.nextLine() + "' is not valid. Please choose a numeric value.");
            }
        } while (true);
    }

    public Double getInputDoubleNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        double x;
        do {
            try {
                System.out.println("Enter a valid number:");
                x = scan.nextDouble();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("The value you entered '" + scan.nextLine() + "' is not valid. Please choose a numeric value.");
            }
        } while (true);
    }

    /*
  This method is used for Exercise 3 for Tema - Try-Catch
*/
    public int[] getInputArrayFromUser(int arrayLength) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getInputNumberFromUser();
        }
        return arr;
    }

    /*
    This method is used for Exercise 4 for Tema - Try-Catch
  */
    public List<Integer> getInputListFromUser() {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Add numbers to the list: ");
        do {
            try {
                list.add(scan.nextInt());
            } catch (InputMismatchException e) {
                if (scan.nextLine().equalsIgnoreCase("c")) {
                    break;
                } else {
                    System.out.println("The entered value is invalid");
                }
            }
        } while (true);
        return list;
    }
}
