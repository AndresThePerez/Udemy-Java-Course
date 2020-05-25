package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));

//        for(int i = 0; i < 5; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }
        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }

        System.out.println("*****************");

        for(int i = 8; i > 1; i--) {
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }

        System.out.println("******************");

        int counter = 0;
        for(int y = 1; y < 10; y++){
            if(isPrime(y) == true) {
                System.out.println(y + " is Prime");
                counter++;
                if(counter == 3) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }


}


