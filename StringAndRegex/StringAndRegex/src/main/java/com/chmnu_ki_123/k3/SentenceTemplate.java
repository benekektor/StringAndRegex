package com.chmnu_ki_123.k3;

import java.util.regex.Pattern;

public class SentenceTemplate {

    public static void main(String[] args) {
        String sentence = "Почнемо, браття, пісню невеселу Словами призабутими старими Про Ігорів згорьований похід..";
        String result = removeWordsStartingWithS(sentence);

        System.out.println("Результуючий рядок:");
        System.out.println(result);
    }

    public static String removeWordsStartingWithS(String sentence) {
        String[] words = sentence.split("[\\s,\\.?!;:()]+");

        String pattern = "^с.*";

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!Pattern.matches(pattern, word.toLowerCase())) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
