package com.company;

public class Main {

    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(2000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = (kiloBytes / 1024);
        int remainder = (kiloBytes % 1024);

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
    }

}
