package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        int tempnum = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(x < 11) {
            System.out.println("Enter number #" + x + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                tempnum = scanner.nextInt();
                sum += tempnum;
                x++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum is " + sum);
    }
}
