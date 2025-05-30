package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class HackingSimulator {
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        printHackResult(hack());
    }

    private static int hack() {
        char[] spins = {'-', '\\', '|', '/'};
        int fullSpins = 4;
        int totalFrames = spins.length * fullSpins;

        for (int i = 0; i < totalFrames; i++) {
            System.out.print("\rHacking: " + spins[i % spins.length]);
            try {
                Thread.sleep(215);
            } catch (InterruptedException e) {
                return 0;
            }
        }
        return generateRandomCode();
    }

    private static int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private static void printHackResult(int accessCode) {
        System.out.println("\rHacking: " + ((accessCode > 70
                ? GREEN + "Access Granted!"
                : RED + "Access Denied!")
                + RESET));
    }
}