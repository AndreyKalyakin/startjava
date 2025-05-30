package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        int[] numbers = {};
        displayExpressions(generateFactorialExpressions(numbers));

        numbers = null;
        displayExpressions(generateFactorialExpressions(numbers));

        numbers = new int[]{8, 0, 9};
        displayExpressions(generateFactorialExpressions(numbers));

        numbers = new int[]{-3, 1, 7, 13};
        displayExpressions(generateFactorialExpressions(numbers));

        numbers = new int[]{-22, -0};
        displayExpressions(generateFactorialExpressions(numbers));
    }

    public static String[] generateFactorialExpressions(int... numbers) {
        if (numbers == null) {
            System.out.println("Входной массив: null");
            return new String[0];
        }

        if (numbers.length == 0) {
            System.out.println("Входной массив: пустой");
            return new String[0];
        }

        String[] expressions = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            expressions[i] = formatExpressions(numbers[i]);
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

    private static void displayExpressions(String[] expressions) {
        for (String expression : expressions) {
            System.out.println(expression);
        }
        System.out.println();
    }
}
