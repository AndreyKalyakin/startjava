public class BooleanMethods {
    public boolean doesContinue() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetterInput() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasAttemptsLeft() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isBlankInput() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isEvenDiceRoll() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidFilePath() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isFileExists() {
        System.out.print(MethodNameReturn.getCurrentMethodName() + 
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}