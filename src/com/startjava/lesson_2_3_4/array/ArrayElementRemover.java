package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayElementRemover {
    public static void main(String[] args) {
        int[] indexes = { -1, 15, 0, 14 };
        runFilteringIndexes(indexes);
    }

    private static void runFilteringIndexes(int[] indexes) {
        for (int index : indexes) {
            float[][] arrays = generateAndFilterArray(index);
            if (arrays == null) {
                System.out.println("Ошибка: некорректный индекс " + index + ". Допустимые индексы: от 0 до 14.\n");
                continue;
            }

            float[] original = arrays[0];
            float[] filtered = arrays[1];
            float threshold = original[index];

            System.out.println("Исходный массив:");
            printFormattedArray(original);
            System.out.println("\nИзменённый массив:");
            printFormattedArray(filtered);
            System.out.printf("%nЗначение в ячейке по индексу: %.3f%n", threshold);
            System.out.println("Количество обнулённых ячеек: " + countZeros(filtered) + "\n");
        }
    }

    private static float[][] generateAndFilterArray(int index) {
        final int LENGTH = 15;
        if (index < 0 || index >= LENGTH) {
            return null;
        }

        Random random = new Random();
        float[] original = new float[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            original[i] = random.nextFloat();
        }

        float threshold = original[index];
        float[] filtered = new float[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            filtered[i] = original[i] > threshold ? 0.0f : original[i];
        }

        return new float[][]{ original, filtered };
    }

    private static int countZeros(float[] arr) {
        int count = 0;
        for (float v : arr) {
            if (v == 0.0f) count++;
        }
        return count;
    }

    private static void printFormattedArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%8.3f", arr[i]);
        }
    }
}
