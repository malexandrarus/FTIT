package com.ftit.secondassignment;
/*
This class was created to resolve requirements for Exercise 3 and Exercise 5
 */
public class DisplayPatterns {
    public static void main(String[] args) {
        drawJavaPattern();
        drawRobotPattern();
    }

    public static void drawJavaPattern() {
        System.out.println("   J    a   v     v   a ");
        System.out.println("   J   a a   v   v   a a");
        System.out.println("J  J  aaaaa   v v   aaaaa");
        System.out.println(" JJ  a     a   V   a     a");
    }
    public static void drawRobotPattern() {
        System.out.println(" + \"\"\"\"\" + ");
        System.out.println("[| o   o |]");
        System.out.println(" |   ^   |  ");
        System.out.println(" |  '_'  | ");
        System.out.println("  +_____+");


    }
}
