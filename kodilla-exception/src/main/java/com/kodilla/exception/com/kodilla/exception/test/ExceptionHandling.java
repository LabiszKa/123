package com.kodilla.exception.com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(3.5, 1.5);
        } catch(Exception e){

            System.out.println("We might have a problem");
        }
    }
}
