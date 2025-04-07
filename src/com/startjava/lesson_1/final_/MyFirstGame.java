package com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 67;
        int playerNumber = 65;
        int rangeStart = 1;
        int rangeEnd = 100;
        while (computerNumber != playerNumber) {
            if (playerNumber < rangeStart || playerNumber > rangeEnd) {
                System.out.println("Ошибка: недопустимое число");
                break;
            }
            if (playerNumber < computerNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            } else if (playerNumber > computerNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            }
        }
        System.out.println("Вы победили! Загаданное число: " + computerNumber);
    }
}
