package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        int[] arr1 = new int[]{};
        int[] rev1 = reverse(arr1);
        print(arr1, rev1);

        int[] arr2 = null;
        int[] rev2 = reverse(arr2);
        print(arr2, rev2);

        int[] arr3 = new int[]{6, 8, 9, 1};
        int[] rev3 = reverse(arr3);
        print(arr3, rev3);

        int[] arr4 = new int[]{13, 8, 5, 3, 2, 1, 1};
        int[] rev4 = reverse(arr4);
        print(arr4, rev4);
    }

    private static int[] reverse(int[] values) {
        if (values == null || values.length == 0) {
            return values;
        }
        int[] reversed = new int[values.length];
        int length = values.length;
        for (int i = 0; i < values.length; i++) {
            reversed[i] = values[--length];
        }
        return reversed;
    }

    private static void print(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("Ошибка: передан null вместо массива. Ожидался массив с целыми числами.\n");
            return;
        }
        if (original.length == 0) {
            System.out.println("Ошибка: массив нулевой длины. Ожидался непустой массив.\n");
            return;
        }
        System.out.println("   До реверса: " + Arrays.toString(original));
        System.out.println("После реверса: " + Arrays.toString(reversed) + "\n");
    }
}