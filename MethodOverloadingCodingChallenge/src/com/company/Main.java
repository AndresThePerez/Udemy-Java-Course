package com.company;

public class Main {

    public static void main(String[] args) {
	double answer = calcFeetAndInchesToCentimeters(6, -1);
	double answer2 = calcFeetAndInchesToCentimeters(100);
    System.out.println(answer);
    System.out.println(answer2);
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double centimeters;
        if(feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
        centimeters = ((feet * 12) + inches) * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        int feet;
        int oldInches = inches;
        if(inches < 0) {
            System.out.println("Invalid Inches");
            return -1;
        }
        feet = (int)(inches / 12);
        inches = inches % 12;
        System.out.println(oldInches + " is the original value which is equal to " + feet + " feet and " + inches + " inches.");
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        System.out.println("Which has a total of " + centimeters + " centimeters.");
        return centimeters;
    }
}
