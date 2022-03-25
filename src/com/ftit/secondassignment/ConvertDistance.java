package com.ftit.secondassignment;
/*
This class was created to resolve requirements for Exercise 8
 */
public class ConvertDistance {
    public static void main(String[] args) {
        convertInchToMeter(23.4);

    }

    public static void convertInchToMeter(double inches) {
        double meters = inches  * 0.0254;
        System.out.println("The converted distance in meters is: " + meters);

    }
}
