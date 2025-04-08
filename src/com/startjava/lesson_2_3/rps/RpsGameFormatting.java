package com.startjava.lesson_2_3.rps;

import java.util.Random;
import java.util.Scanner;

// Игра Камень-Ножницы-Бумага
public class RpsGameFormatting {
    private static final String ROCK = "✊";
    private static final String SCISSORS = "✌️";
    private static final String PAPER = "✋";

    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        String name1 = inputName(console);
        String name2 = inputName(console);

        // Ход первого игрока
        int position = generatePosition(name1, r);
        String sign1 = determineSign(position);
        showSigns(sign1);

        // Ход второго игрока
        position = generatePosition(name2, r);
        String sign2 = determineSign(position);
        showSigns(sign2);

        determineWinner(name1, sign1, name2, sign2);
        console.close();
    }

    private static String inputName(Scanner console) {
        System.out.print("Введите имя игрока: ");
        return console.nextLine();
    }

    private static int generatePosition(String name, Random r) {
        System.out.println("Ход " + name + ": ");
        return r.nextInt(1, 100);
    }

    private static String determineSign(int position) {
        if (position > 66) {
            return ROCK;
        } else if (position > 33) {
            return SCISSORS;
        } else {
            return PAPER;
        }
    }

    private static void showSigns(String sign) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print(ROCK + "\r");
            Thread.sleep(100);
            System.out.print(SCISSORS + "\r");
            Thread.sleep(100);
            System.out.print(PAPER + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign);
    }

    private static void determineWinner(String name1, String sign1, String name2, String sign2) {
        if (sign1.equals(sign2)) {
            System.out.println("\nПобедила дружба!");
            return;
        }

        if (isFirstPlayerWin(sign1, sign2)) {
            System.out.println("\nПобедил - " + name1);
            return;
        }

        System.out.println("\nПобедил - " + name2);
    }

    private static boolean isFirstPlayerWin(String s1, String s2) {
        return s1.equals(ROCK) && s2.equals(SCISSORS) ||
               s1.equals(SCISSORS) && s2.equals(PAPER) ||
               s1.equals(PAPER) && s2.equals(ROCK);
    }
}