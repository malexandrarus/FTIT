package com.ftit.seventhassignment;

import com.ftit.thirdassignment.LogicalOp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        LogicalOp logicalOp = new LogicalOp();
        read.getInputNumberFromUser();
        read.getInputDoubleNumberFromUser();
        read.getInputFloatNumberFromUser();
        read.getInputLongNumberFromUser();

        System.out.println(Arrays.toString(read.getInputArrayFromUser(6)));
        System.out.println(read.getInputListFromUser());
        logicalOp.getElementByIndex(new int[]{10, 67, 55, 4, 21, 1}, 5);
        logicalOp.wait(5);
    }
}
