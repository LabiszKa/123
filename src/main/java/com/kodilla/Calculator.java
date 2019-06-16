package com.kodilla;

public class Calculator {

    int a;
    int b;
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int substractAFromB(double a, double b) {
        return (int) (a - b);
    }
    public static void main (String [] args) {
        Calculator aCalculator = new Calculator();
        int result = aCalculator.addAToB(4, 9);
        System.out.println(result);

    }
}
