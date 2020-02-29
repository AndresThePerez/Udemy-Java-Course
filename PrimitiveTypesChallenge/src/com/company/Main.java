package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 200;
        int intValue = 300;

        long longValue = 50000 + (10 * (byteValue + shortValue + intValue));

        System.out.println(longValue);
    }
}
