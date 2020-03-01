package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
	    String val = getDurationString(61, 0);
	    String val2 = getDurationString((3600 * 10) + (60 * 59) + 59);
        System.out.println(val);
        System.out.println(val2);
    }

    private static String getDurationString(int minutes, int seconds) {
        String result;
        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = (int) minutes / 60;
        minutes = minutes % 60;
        if(hours < 10) {
            result = "0" + hours + "h ";
        } else {
            result = Integer.toString(hours) + "h ";
        }
        if(minutes < 10) {
            result = result + "0" + Integer.toString(minutes) + "m ";
        } else {
            result += Integer.toString(minutes) + "m ";
        }
        if(seconds < 10) {
            result = result + "0" + Integer.toString(seconds) + "s";
        } else {
            result += Integer.toString(seconds) + "s";
        }
        return result;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = (int) seconds / 60;
        int remainderSeconds = seconds % 60;
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes and " + remainderSeconds + " seconds");

        return getDurationString(minutes, remainderSeconds);
    }
}
