package com.kodilla.testing;

import com.kodilla.testing.Calculator.SimpleCalculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleCalculator aCalculator = new SimpleCalculator();
        int result = aCalculator.addAToB(4, 9);
        if (result == 13) {
            System.out.println("Test ok");
        } else {
            System.out.println("Not ok");

            int subResult = aCalculator.substractAFromB(13, 4);
            if (subResult ==9) {
                System.out.println("test 2 ok");
            } else {
                System.out.println("test 2 not ok");
            }
        }
    }

}