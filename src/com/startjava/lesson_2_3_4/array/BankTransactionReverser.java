package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionReverser {
    public static void main() {
        int[] original = {};
        int[] reversed = reverseTransactions(original);
        printTransactions(original, reversed);

        original = null;
        reversed = reverseTransactions(original);
        printTransactions(original, reversed);

        original = new int[]{6, 8, 9, 1};
        reversed = reverseTransactions(original);
        printTransactions(original, reversed);

        original = new int[]{13, 8, 5, 3, 2, 1, 1};
        reversed = reverseTransactions(original);
        printTransactions(original, reversed);
    }

    private static int[] reverseTransactions(int[] original) {
        if (original == null || original.length == 0) {
            return original;
        }
        int[] reversed = new int[original.length];
        int length = original.length;
        for (int value : original) {
            reversed[--length] = value;
        }
        return reversed;
    }
    
    private static void printTransactions(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("Ошибка: передан null вместо массива. Ожидался массив с целыми числами.\n");
            return;
        }
        if (original.length == 0) {
            System.out.println("Ошибка: массив нулевой длины. Ожидался непустой массив.\n");
            return;
        }
        System.out.println("Исходные транзакции: " + Arrays.toString(original));
        System.out.println(" В обратном порядке: " + Arrays.toString(reversed) + "\n");
    }
}