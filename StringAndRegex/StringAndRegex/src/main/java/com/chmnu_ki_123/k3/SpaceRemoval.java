package com.chmnu_ki_123.k3;

public class SpaceRemoval {
    public static void main(String[] args) {
        String sentence = " Почнемо, браття, пісню невеселу Словами призабутими старими Про Ігорів згорьований похід ";
        String result = removeExtraSpaces(sentence);
        System.out.println(result);
    }

    public static String removeExtraSpaces(String sentence) {
        return sentence.trim().replaceAll("\\s+", " ");
    }
}
