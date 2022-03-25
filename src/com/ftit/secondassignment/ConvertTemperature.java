package com.ftit.secondassignment;
/*
This class was created to resolve requirements for Exercise 7
 */
public class ConvertTemperature {
    public static void main(String[] args) {
        convertFromFahrenheitToCelsius(90);

    }
    public static void convertFromFahrenheitToCelsius (double Fahrenheit) {
        double celsius = ((Fahrenheit -32)*5)/9;
        System.out.println("Temperature in celsius is: " + celsius);
    }
}
