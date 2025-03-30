public class MethodName {
        public static void main(String[] args) {
            System.out.println("1. HЕ BOOLEAN-МЕТОДЫ");
            new NoBooleanMethods().findLongestWord();
            new NoBooleanMethods().selectMenuItem();
            new NoBooleanMethods().calculateAvgGrades();
            new NoBooleanMethods().countUniqueWords();
            new NoBooleanMethods().showErrorMessege();
            new NoBooleanMethods().syncWithCloud();
            new NoBooleanMethods().recoverData();
            new NoBooleanMethods().pauseFileDownload();
            new NoBooleanMethods().resetToFactory();
            new NoBooleanMethods().writeToFlash();
            new NoBooleanMethods().celsiusToFahrenheit();
            new NoBooleanMethods().inputMathExpression();
            new NoBooleanMethods().identifyRaceWinner();
            new NoBooleanMethods().findBookByAuthor();

            System.out.println("\n2. BOOLEAN-МЕТОДЫ");
            BooleanMethods booleanMethods = new BooleanMethods();
            boolean result1 = booleanMethods.doesContinue();
            System.out.println(result1);
            boolean result2 = booleanMethods.hasUniqueDigit();
            System.out.println(result2);
            boolean result3 = booleanMethods.isLetterInput();
            System.out.println(result3);
            boolean result4 = booleanMethods.hasEqualDigits();
            System.out.println(result4);
            boolean result5 = booleanMethods.hasAttemptsLeft();
            System.out.println(result5);
            boolean result6 = booleanMethods.isBlankInput();
            System.out.println(result6);
            boolean result7 = booleanMethods.isEvenDiceRoll();
            System.out.println(result7);
            boolean result8 = booleanMethods.isValidFilePath();
            System.out.println(result8);
            boolean result9 = booleanMethods.isFileExists();
            System.out.println(result9);
        }
}