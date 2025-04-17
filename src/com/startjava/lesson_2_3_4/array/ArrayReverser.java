package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int length = scanner.nextInt();

        if (length < 1) {
            System.out.println("Ошибка: количество элементов должно быть больше 0. Введено: " + length);
            return;
        }

        int[] numbers = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("   До реверса: [");
        printNumbers(numbers);
        System.out.println("]");

        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
        }

        System.out.print("После реверса: [");
        printNumbers(numbers);
        System.out.println("]\n");
    }

    private static void printNumbers(int[] numbers) {
        boolean first = true;
        for (int number : numbers) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(number);
            first = false;
        }
    }
}