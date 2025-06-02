package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayElementRemover {
    public static void main(String[] args) {
        int[] indexes = { -1, 15, 0, 14 };
        processIndexes(indexes);
    }

    private static void processIndexes(int[] indexes) {
        Random random = new Random();
        for (int index : indexes) {
            double[] original = new double[15];
            for (int i = 0; i < 15; i++) {
                original[i] = random.nextDouble();
            }
            handleAndDisplay(original, index);
        }
    }

    private static void handleAndDisplay(double[] original, int index) {
        if (index < 0 || index >= original.length) {
            System.out.println("Ошибка: некорректный индекс " + index +
                    ". Допустимые индексы: от 0 до " + (original.length - 1) + ".\n");
            return;
        }
        double thresholdValue = original[index];
        double[] modified = new double[original.length];
        int zeroCount = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] > thresholdValue) {
                modified[i] = 0.0;
                zeroCount++;
            } else {
                modified[i] = original[i];
            }
        }
        System.out.println("Исходный массив:");
        printArrayFormatted(original);
        System.out.println("\nИзменённый массив:");
        printArrayFormatted(modified);
        System.out.printf("%nЗначение в ячейке по индексу: %.3f%n", thresholdValue);
        System.out.println("Количество обнулённых ячеек: " + zeroCount + "\n");
    }

    private static void printArrayFormatted(double[] arr) {
        for (int i = 0; i < 8 && i < arr.length; i++) {
            System.out.printf("%8.3f", arr[i]);
        }
        System.out.println();
        for (int i = 8; i < arr.length; i++) {
            System.out.printf("%8.3f", arr[i]);
        }
    }
}