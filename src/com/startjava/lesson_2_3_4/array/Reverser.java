package com.startjava.lesson_2_3_4.array;

public class Reverser {
    public static void main(String[] args) {
        print(new int[]{});
        execution(new int[]{});

        print(null);
        execution(null);

        print(new int[]{6, 8, 9, 1});
        execution(new int[]{6, 8, 9, 1});

        print(new int[]{13, 8, 5, 3, 2, 1, 1});
        execution(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void execution(int[] values) {
        if (values == null) {
            System.out.println("Ошибка: передан null вместо массива. Ожидался массив с целыми числами.\n");
            return;
        }
        if (values.length == 0) {
            System.out.println("Ошибка: массив нулевой длины. Ожидался непустой массив.\n");
            return;
        }
        reverse(values);
    }

    private static void reverse(int[] values) {
        int length = values.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = values[i];
            values[i] = values[--length];
            values[length] = temp;
        }
    }

    public static void print(int[] values) {
        if (values == null) {
            System.out.println("Ошибка: передан null вместо массива. Ожидался массив с целыми числами.");
            return;
        }
        if (values.length == 0) {
            System.out.println("Ошибка: массив нулевой длины. Ожидался непустой массив.");
            return;
        }
        System.out.print("До реверса: [");
        for (int i = 0; i < values.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(values[i]);
        }
        System.out.println("]");
        System.out.print("После реверса: [");
        for (int i = values.length - 1; i >= 0; i--) {
            if (i < values.length - 1) System.out.print(", ");
            System.out.print(values[i]);
        }
        System.out.println("]\n");
    }
}