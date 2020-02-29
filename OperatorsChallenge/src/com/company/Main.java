package com.company;

public class Main {

    public static void main(String[] args) {
	    double valueOne = 20.00;
	    double valueTwo = 80.00;

	    double result = (valueOne + valueTwo) * 100.00;

	    result = result % 40.00;

	    boolean hasZeroRemainder = (result == 0) ? true : false;

	    if(!hasZeroRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
