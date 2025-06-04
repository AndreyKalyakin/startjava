package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayElementRemover {
    public static void main(String[] args) {
        int[] indexes = { -1, 15, 0, 14 };
        ProcessEntry[] entries = processIndexes(indexes);
        for (ProcessEntry entry : entries) {
            displayResult(entry.original, entry.result, entry.index);
        }
    }

    private static ProcessEntry[] processIndexes(int[] indexes) {
        Random random = new Random();
        ProcessEntry[] entries = new ProcessEntry[indexes.length];
        int i = 0;
        for (int index : indexes) {
            float[] original = new float[15];
            for (int j = 0; j < 15; j++) {
                original[j] = random.nextFloat();
            }
            ProcessResult result = computeResult(original, index);
            entries[i++] = new ProcessEntry(original, index, result);
        }
        return entries;
    }

    private static ProcessResult computeResult(float[] original, int index) {
        if (index < 0 || index >= original.length) {
            return null;
        }
        float thresholdValue = original[index];
        float[] modified = new float[original.length];
        int zeroCount = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] > thresholdValue) {
                modified[i] = 0.0f;
                zeroCount++;
            } else {
                modified[i] = original[i];
            }
        }
        return new ProcessResult(modified, thresholdValue, zeroCount);
    }

    private static void displayResult(float[] original, ProcessResult result, int index) {
        if (result == null) {
            System.out.println("Ошибка: некорректный индекс " + index +
                    ". Допустимые индексы: от 0 до " + (original.length - 1) + ".\n");
            return;
        }
        System.out.println("Исходный массив:");
        printArrayFormatted(original);
        System.out.println("\nИзменённый массив:");
        printArrayFormatted(result.modified);
        System.out.printf("%nЗначение в ячейке по индексу: %.3f%n", result.thresholdValue);
        System.out.println("Количество обнулённых ячеек: " + result.zeroCount + "\n");
    }

    private static class ProcessEntry {
        final float[] original;
        final int index;
        final ProcessResult result;
        ProcessEntry(float[] original, int index, ProcessResult result) {
            this.original = original;
            this.index = index;
            this.result = result;
        }
    }

    private static class ProcessResult {
        final float[] modified;
        final float thresholdValue;
        final int zeroCount;
        ProcessResult(float[] modified, float thresholdValue, int zeroCount) {
            this.modified = modified;
            this.thresholdValue = thresholdValue;
            this.zeroCount = zeroCount;
        }
    }

    private static void printArrayFormatted(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%8.3f", arr[i]);
        }
    }
}