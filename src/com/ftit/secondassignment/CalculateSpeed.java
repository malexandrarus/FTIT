package com.ftit.secondassignment;

import java.time.LocalTime;

public class CalculateSpeed {
    public static void main(String[] args) {
        calculateSpeed(10000, LocalTime.of(0, 10, 10));
        calculateSpeed(10000, 0,10,10);
    }

    /**
     *
     * @param distance expressed in meters
     * @param time in format hh:mm:ss
     */
    public static void calculateSpeed(float distance, LocalTime time) {
        int hours = time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();

        float timeInSeconds = (hours*3600) + (minutes*60) + seconds;

        // calculate speed in meters/second
        float speed = distance/timeInSeconds;
        System.out.println("The speed in meters/second is " + speed + " m/s");

        // calculate speed in km/h
        speed = (distance/1000.0f) / (timeInSeconds/3600.0f);
        System.out.println("The speed in km/h is " + speed + " km/h");

        // calculate speed in miles/h
        speed = (distance/1609.0f) / (timeInSeconds/3600.0f);
        System.out.println("The speed in miles/h is " + speed + " miles/h");
    }

    /**
     *
     * @param distance expressed in meters
     * @param hours the value for hours
     * @param minutes the value for minutes
     * @param seconds the value for seconds
     */
    public static void calculateSpeed(float distance,  int hours, int minutes, int seconds) {
        float timeInSeconds = (hours*3600) + (minutes*60) + seconds;

        // calculate speed in meters/second
        float speed = distance/timeInSeconds;
        System.out.println("The speed in meters/second is " + speed + " m/s");

        // calculate speed in km/h
        speed = (distance/1000.0f) / (timeInSeconds/3600.0f);
        System.out.println("The speed in km/h is " + speed + " km/h");

        // calculate speed in miles/h
        speed = (distance/1609.0f) / (timeInSeconds/3600.0f);
        System.out.println("The speed in miles/h is " + speed + " miles/h");
    }
}
