package com.startjava.lesson_2_3.method.naming;

public class MethodNaming {
    public static void main(String[] args) {
        System.out.println("1. HЕ BOOLEAN-МЕТОДЫ");
        execNonBooleanMethods();

        System.out.println("\n2. BOOLEAN-МЕТОДЫ");
        execBooleanMethods();
    }

    private static void execNonBooleanMethods() {
        NonBooleanMethods nonBoolean = new NonBooleanMethods();
        nonBoolean.findLongestWord();
        nonBoolean.selectMenuItem();
        nonBoolean.avgGrades();
        nonBoolean.countUniqueWords();
        nonBoolean.showErrorMessege();
        nonBoolean.syncWithCloud();
        nonBoolean.recoverData();
        nonBoolean.pauseFileDownload();
        nonBoolean.resetToFactory();
        nonBoolean.writeToFile();
        nonBoolean.celsiusToFahrenheit();
        nonBoolean.inputMathExpression();
        nonBoolean.identifyRaceWinner();
        nonBoolean.findBookByAuthor();
    }

    private static void execBooleanMethods() {
        BooleanMethods booleanMethods = new BooleanMethods();
        System.out.println(booleanMethods.doesContinue());
        System.out.println(booleanMethods.hasUniqueDigit());
        System.out.println(booleanMethods.isLetterInput());
        System.out.println(booleanMethods.hasEqualDigits());
        System.out.println(booleanMethods.hasAttemptsLeft());
        System.out.println(booleanMethods.isBlankInput());
        System.out.println(booleanMethods.isEvenDiceRoll());
        System.out.println(booleanMethods.isValidFilePath());
        System.out.println(booleanMethods.isFileExists());
    }
}