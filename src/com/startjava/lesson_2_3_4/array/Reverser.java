package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        print(new int[]{});
        reverse(new int[]{});

        print(null);
        reverse(null);

        print(new int[]{6, 8, 9, 1});
        reverse(new int[]{6, 8, 9, 1});

        print(new int[]{13, 8, 5, 3, 2, 1, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static int[] reverse(int[] values) {
        if (values == null || values.length == 0) {
            return values;
        }
        int length = values.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = values[i];
            values[i] = values[--length];
            values[length] = temp;
        }
        return values;
    }

    private static void print(int[] values) {
        if (values == null) {
            System.out.println("Ошибка: передан null вместо массива. Ожидался массив с целыми числами.\n");
            return;
        }
        if (values.length == 0) {
            System.out.println("Ошибка: массив нулевой длины. Ожидался непустой массив.\n");
            return;
        }
        System.out.println("   До реверса: " + Arrays.toString(values));
        System.out.println("После реверса: " + Arrays.toString(reverse(values)) + "\n");
    }
}