package com.startjava.lesson_2_3_4.array;

public class Reverser {
    public static void main(String[] args) {
        execution(new int[]{});
        execution(null);
        execution(new int[]{6, 8, 9, 1});
        execution(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void execution(int[] values) {
        if (values == null) {
            System.out.println("Ошибка: передан null вместо массива. Ожидался массив с целыми числами.\n");
            return;
        }

        int length = values.length;
        if (length == 0) {
            System.out.println("Ошибка: массив нулевой длины. Ожидался непустой массив.\n");
            return;
        }

        System.out.print("   До реверса: [");
        printNumbers(values);
        System.out.println("]");

        reverse(values);

        System.out.print("После реверса: [");
        printNumbers(values);
        System.out.println("]\n");
    }

    private static void reverse(int[] values) {
        int length = values.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = values[i];
            values[i] = values[length - 1 - i];
            values[length - 1 - i] = temp;
        }
    }

    private static void printNumbers(int[] values) {
        boolean first = true;
        for (int number : values) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(number);
            first = false;
        }
    }
}