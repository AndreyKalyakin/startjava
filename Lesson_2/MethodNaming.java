public class MethodNaming {
    public static void main(String[] args) {
        System.out.println("1. HЕ BOOLEAN-МЕТОДЫ");
        invokeNonBooleanMethods();

        System.out.println("\n2. BOOLEAN-МЕТОДЫ");
        invokeBooleanMethods();
    }

    private static void invokeNonBooleanMethods() {
        NonBooleanMethods nonBoolean = new NonBooleanMethods();
        nonBoolean.findLongestWord();
        nonBoolean.selectMenuItem();
        nonBoolean.AvgGrades();
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

    private static void invokeBooleanMethods() {
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