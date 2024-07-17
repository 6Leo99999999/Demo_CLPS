package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(extractNumber("abcd123.456"));
        System.out.println(extractNumber("abcd123"));
    }

    public static String extractNumber(String str) {
        String numberStr = str.replaceAll("[a-zA-Z]", "");

        if (numberStr.indexOf(".") == -1) {
            numberStr += ".00";
        } else {
            int dotIndex = numberStr.indexOf(".");
            if (dotIndex == numberStr.length() - 1) {
                numberStr += "0";
            } else if (dotIndex < numberStr.length() - 3) {
                numberStr = numberStr.substring(0, dotIndex + 3);
            }
        }

        return numberStr;
    }

}
