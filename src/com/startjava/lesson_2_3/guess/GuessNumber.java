package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = (int) (Math.random() * 100) + 1;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Компьютер загадал число от 1 до 100.");
        boolean guessed = false;
        Player currentPlayer = player1;

        while (!guessed) {
            int guess = inputGuess(currentPlayer);
            currentPlayer.setNumber(guess);

            if (isGuessed(currentPlayer, guess)) {
                guessed = true;
            } else {
                currentPlayer = switchPlayer(currentPlayer);
            }
        }
    }

    private int inputGuess(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        int guess = scanner.nextInt();
        while (guess < 1 || guess > 100) {
            System.out.println("Число должно быть в диапазоне от 1 до 100.");
            System.out.print(player.getName() + ", введите число: ");
            guess = scanner.nextInt();
        }
        return guess;
    }

    private boolean isGuessed(Player player, int guess) {
        if (guess == secretNumber) {
            System.out.println(player.getName() + " угадал число! Победа!");
            return true;
        }
        System.out.println(guess + (guess < secretNumber ? " меньше " : " больше ") + 
                "того, что загадал компьютер");
        return false;
    }

    private Player switchPlayer(Player currentPlayer) {
        return currentPlayer == player1 ? player2 : player1;
    }
}