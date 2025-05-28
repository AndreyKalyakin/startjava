package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Массив: массив нулевой длины");
        int[] values1 = {};
        String[] expression1 = calculateFactorials(values1);
        displayFactorials(expression1);

        System.out.println("Массив: null");
        int[] values2 = null;
        String[] expression2 = calculateFactorials(values2);
        displayFactorials(expression2);

        System.out.println("Массив: {8, 0, 9}");
        int[] values3 = {8, 0, 9};
        String[] expression3 = calculateFactorials(values3);
        displayFactorials(expression3);

        System.out.println("Массив: {-3, 1, 7, 13}");
        int[] values4 = {-3, 1, 7, 13};
        String[] expression4 = calculateFactorials(values4);
        displayFactorials(expression4);

        System.out.println("Массив: {-22, -0}");
        int[] values5 = {-22, -0};
        String[] expression5 = calculateFactorials(values5);
        displayFactorials(expression5);
    }

    public static String[] calculateFactorials(int... values) {
        if (values == null) {
            return new String[] {"Входной массив: null"};
        }

        if (values.length == 0) {
            return new String[] {"Входной массив: пустой"};
        }

        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = formatFactorialOutput(values[i]);
        }
        return result;
    }

    private static String formatFactorialOutput(int n) {
        if (n < 0) {
            return "Ошибка: факториал " + n + "! не определен. Допустимы только неотрицательные значения.";
        }
        long result = 1;
        String expression = n + "! = ";
        if (n == 0 || n == 1) {
            expression += "1";
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
                expression += i + (i != n ? " * " : "");
            }
        }
        expression += " = " + result;
        return expression;
    }

    private static void displayFactorials(String[] expressions) {
        for (String expression : expressions) {
            System.out.println(expression);
        }
        System.out.println();
    }
}
