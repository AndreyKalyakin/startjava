package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        int[] numbers = {};
        displayFactorials(calc(numbers));

        numbers = null;
        displayFactorials(calc(numbers));

        numbers = new int[]{8, 0, 9};
        displayFactorials(calc(numbers));

        numbers = new int[]{-3, 1, 7, 13};
        displayFactorials(calc(numbers));

        numbers = new int[]{-22, -0};
        displayFactorials(calc(numbers));
    }

    public static String[] calc(int... values) {
        if (values == null) {
            System.out.println("Входной массив: null");
            return new String[0];
        }

        if (values.length == 0) {
            System.out.println("Входной массив: пустой");
            return new String[0];
        }

        String[] expressions = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            expressions[i] = formatExpressions(values[i]);
        }
        return expressions;
    }

    private static String formatExpressions(int n) {
        if (n < 0) {
            return "Ошибка: факториал " + n + "! не определен. Допустимы только неотрицательные значения.";
        }
        long result = 1;
        StringBuilder expression = new StringBuilder(n + "! = ");
        if (n == 0 || n == 1) {
            expression.append("1");
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
                expression.append(i).append(i != n ? " * " : "");
            }
        }
        expression.append(" = ").append(result);
        return expression.toString();
    }

    private static void displayFactorials(String[] expressions) {
        for (String expression : expressions) {
            System.out.println(expression);
        }
        System.out.println();
    }
}
