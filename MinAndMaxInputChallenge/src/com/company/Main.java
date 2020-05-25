package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minnumber = Integer.MAX_VALUE;
        int maxnumber = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int num = scanner.nextInt();
                if ( num > maxnumber ) {
                    maxnumber = num;
                }
                if( num < minnumber ) {
                    minnumber = num;
                }
            } else {
                System.out.println("Invalid Number");
                System.out.println("The Max Number is " + maxnumber);
                System.out.println("The Min Number is " + minnumber);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
