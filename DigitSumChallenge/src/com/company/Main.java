package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(reverse(123));
    }

    private static int sumDigits(int number) {

        int divisor = 1;
        int lastnum = 0;
        int restnum = 0;
        int sum = 0;
        int tempNumber = number;

        if(number < 10)
            return -1;

        while(tempNumber > 0) {
            divisor = divisor * 10;
            restnum = tempNumber % divisor;
            if(restnum > 9) {
                lastnum = restnum / (divisor / 10);
            } else {
                lastnum = restnum;
            }
            sum += lastnum;
            tempNumber -= restnum;
        }
        return sum;
    }

    private static int sumDigits2(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            //extract least significant digit
            int digit = number % 10;
            sum += digit;

            //drop least significant digit
            number /= 10;
        }

        return sum;
    }

    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number += (number * 2);
        }
        int originalNumber = number;
        int currentNumber = 0;
        int oppositeNumber = 0;
        while (number > 0) {
            oppositeNumber *= 10;
            currentNumber = number % 10;
            oppositeNumber += currentNumber;
            number /= 10;
        }

        if(originalNumber == oppositeNumber)
            return true;
        return false;
    }
    public static boolean hasSharedDigit(int num1, int num2) {

        if(num1 < 10 || num1 > 99) {
            return false;
        }

        if(num2 < 10 || num2 > 99) {
            return false;
        }

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);

        while(num1 > 0) {
            System.out.println("BRUH");
            int tempNum = num1 % 10;
            System.out.println("Starting check for Number 1 = " + tempNum);

            int tempNumberForNum2 = num2;
            while(tempNumberForNum2 > 0) {
                int tempNum2 = tempNumberForNum2 % 10;
                System.out.println("Starting check for Number 2 = " +tempNum + " against " + tempNum2);
                if(tempNum == tempNum2) {
                    return true;
                }
                tempNumberForNum2 /= 10;
            }
            num1 /= 10;
        }

        return false;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while(number > 0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber;
    }

}
