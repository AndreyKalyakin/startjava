package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class HackingSimulator {
    private static final String COLOR_GREEN = "\u001B[32m";
    private static final String COLOR_RED = "\u001B[31m";
    private static final String COLOR_RESET = "\u001B[0m";

    public static void main(String[] args) {
        runLoadingAnimation();
        int accessCode = generateRandomCode();
        System.out.print("\rHacking: ");
        if (accessCode > 70) {
            System.out.println(COLOR_GREEN + "Access Granted!" + COLOR_RESET);
        } else {
            System.out.println(COLOR_RED + "Access Denied!" + COLOR_RESET);
        }
    }

    private static int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private static void runLoadingAnimation() {
        char[] spinnerChars = {'-', '\\', '|', '/'};
        int fullSpins = 4;
        int totalFrames = spinnerChars.length * fullSpins;
        int delayMillis = 215;

        for (int i = 0; i < totalFrames; i++) {
            System.out.print("\rHacking: " + spinnerChars[i % spinnerChars.length]);
            try {
                Thread.sleep(delayMillis);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}