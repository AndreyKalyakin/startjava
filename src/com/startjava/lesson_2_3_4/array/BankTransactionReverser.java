package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionReverser {
    public static void main() {
        int[] arr1 = {};
        int[] rev1 = reverseTransactions(arr1);
        printTransactions(arr1, rev1);

        int[] arr2 = null;
        int[] rev2 = reverseTransactions(arr2);
        printTransactions(arr2, rev2);

        int[] arr3 = {6, 8, 9, 1};
        int[] rev3 = reverseTransactions(arr3);
        printTransactions(arr3, rev3);

        int[] arr4 = {13, 8, 5, 3, 2, 1, 1};
        int[] rev4 = reverseTransactions(arr4);
        printTransactions(arr4, rev4);
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