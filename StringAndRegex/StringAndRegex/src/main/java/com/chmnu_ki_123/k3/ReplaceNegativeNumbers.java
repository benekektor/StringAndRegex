package com.chmnu_ki_123.k3;

public class ReplaceNegativeNumbers {

    public static void main(String[] args) {
        String input = "String 12 with numbers -1, 2, 5, -4, 12. Replace all negative";
        String result = replaceNegativeNumbers(input);

        System.out.println("Вхідний рядок:");
        System.out.println(input);

        System.out.println("\nРезультуючий рядок:");
        System.out.println(result);
    }

    public static String replaceNegativeNumbers(String input) {
        String pattern = "-\\d+";
        return input.replaceAll(pattern, "[]");
    }
}
