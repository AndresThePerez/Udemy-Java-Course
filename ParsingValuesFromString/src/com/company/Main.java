package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
//        System.out.println("numberAsString = " + numberAsString);
//
//        double number = Double.parseDouble(numberAsString);
//        System.out.println("number = " + number);
//
//        numberAsString += 1;
//        number += 1;
//
//        System.out.println("numberAsString = " + numberAsString);
//        System.out.println("number = " + number);
//
//        System.out.println(getLargestPrime(16));
        printSquareStar(9);
    }

    public static int getLargestPrime(int number) {
        if(number < 2)
            return -1;

        boolean isPrime = true;
        int candidate = -1;

        for(int i = 2; i < number ; i++) {
            if(number % i == 0) {
                System.out.println("possible number " + i);
                for(int j = 2; j <= i / 2; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime == true) {
                    candidate = i;
                }
            }
        }

        if(candidate == -1)
            return number;

        return candidate;
    }

    public static void printSquareStar(int number) {
        if(number < 5)
            System.out.println("Invalid Value");

        int leftpointer = 0;
        int rightpointer = number-1;

        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                if(i == 0 || i == number-1) {
                    System.out.print("*");
                } else {
                    if(j == 0 || j == number - 1 || j == leftpointer || j == rightpointer) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            leftpointer++;
            rightpointer--;
            System.out.println("");
        }
    }
}
