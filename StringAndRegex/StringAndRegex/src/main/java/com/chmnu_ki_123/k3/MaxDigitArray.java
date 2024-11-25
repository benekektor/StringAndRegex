package com.chmnu_ki_123.k3;

import java.util.ArrayList;

public class MaxDigitArray {

    public static void main(String[] args) {
        int[] numbers = {123, 45, 67890, 12345, 7, 89012, 56};

        int[] resultArray = getNumbersWithMaxDigits(numbers);

        System.out.println("Вихідний масив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nЧисла з максимальною кількістю цифр (" + countDigits(numbers[0]) + "):");
        for (int number : resultArray) {
            System.out.print(number + " ");
        }
    }

    public static int[] getNumbersWithMaxDigits(int[] numbers) {
        int maxDigits = 0;
        for (int number : numbers) {
            int digitCount = countDigits(number);
            if (digitCount > maxDigits) {
                maxDigits = digitCount;
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int number : numbers) {
            if (countDigits(number) == maxDigits) {
                resultList.add(number);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }

    public static int countDigits(int number) {
        number = Math.abs(number); // Ignore the sign of the number
        return String.valueOf(number).length();
    }
}
