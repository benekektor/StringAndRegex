package com.chmnu_ki_123.k3;

public class CaesarCypher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = shift % 26;

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char encryptedChar = (char) ((character - base + shift + 26) % 26 + base);
                result.append(encryptedChar);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String originalText = "Hello, World!";
        int shift = 3;
        String encryptedText = encrypt(originalText, shift);

        System.out.println("Original: " + originalText);
        System.out.println("Encrypted: " + encryptedText);
    }
}