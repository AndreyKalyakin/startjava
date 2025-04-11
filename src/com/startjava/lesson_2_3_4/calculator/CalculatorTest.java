package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        String repeat;

        do {
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();
            scan.nextLine();
            calculatorOne.setNum1(num1);

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char sign = scan.nextLine().charAt(0);
            calculatorOne.setOperator(sign);

            System.out.print("Введите второе число: ");
            int num2 = scan.nextInt();
            calculatorOne.setNum2(num2);

            calculatorOne.calculate();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                repeat = scan.next().toLowerCase();
            } while (!repeat.equals("yes") && !repeat.equals("no"));
        } while (repeat.equals("yes"));
        scan.close();
    }
}