package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 2;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or five");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'P';

        switch(charValue) {
            case 'A' :
                System.out.println("Char: A found");
                break;
            case 'B':
                System.out.println("Char: B found");
                break;
            case 'C':
                System.out.println("Char: C found");
                break;
            case 'D':
                System.out.println("Char: D found");
                break;
            case 'E':
                System.out.println("Char: E found");
                break;
            default:
                System.out.println("ERROR: Char not found");
        }

        String month = "JANuary";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("not sure");
        }
    }
}
