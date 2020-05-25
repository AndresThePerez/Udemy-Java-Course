package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(4);
    }
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        if(number == 0) {
            System.out.println("Zero");
        }

        int reversedNumber = reverse(number);
        int tempnumber = 0;
        String string = "";

        int firstNumber = getDigitCount(number);
        int secondNumber = getDigitCount(reversedNumber);

        System.out.println("reversedNumber: " + reversedNumber);
        System.out.println("firstNumber: " + number);
        if(firstNumber != secondNumber) {
            int diff = (secondNumber > firstNumber) ? secondNumber - firstNumber : firstNumber - secondNumber;
            for(int i = 0; i < diff; i++) {
                string += "Zero ";
            }
        }

        while(reversedNumber > 0) {
            tempnumber = reversedNumber % 10;
            if(tempnumber == 0) {
                string += "Zero ";
            } else if(tempnumber == 1) {
                string += "One ";
            } else if(tempnumber == 2) {
                string += "Two ";
            } else if(tempnumber == 3) {
                string += "Three ";
            } else if(tempnumber == 4) {
                string += "Four ";
            } else if(tempnumber == 5) {
                string += "Five ";
            } else if(tempnumber == 6) {
                string += "Six ";
            } else if(tempnumber == 7) {
                string += "Seven ";
            } else if(tempnumber == 8) {
                string += "Eight ";
            } else if(tempnumber == 19) {
                string += "Nine ";
            }
            reversedNumber /= 10;
        }

        System.out.println(string);
    }

    public static int reverse(int number) {
        boolean type = false;
        if(number < 0) {
            number *= -1;
            type = true;
        }
        int reversedNumber = 0;
        while(number > 0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber += number % 10;
            number /= 10;
        }
        if(type == true) {
            reversedNumber *= -1;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int counter = 0;

        if(number == 0)
            return 1;

        if(number < 0) {
            return -1;
        }

        while(number > 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}