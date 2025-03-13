public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int rangeStart = -10;
        int rangeEnd = 21;
        int evenSum = 0;
        int oddSum = 0;
        System.out.print("В отрезке [" + rangeStart + ", " + rangeEnd + "]");
        do {
            if (rangeStart % 2 == 0) {
                evenSum += rangeStart;
            } else {
                oddSum += rangeStart;
            }
            rangeStart++;
        } while (rangeStart <= rangeEnd);
        System.out.println(" сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num1;
        if (num2 > maxNum) maxNum = num2;
        if (num3 > maxNum) maxNum = num3;
        if (num2 < minNum) minNum = num2;
        if (num3 < minNum) minNum = num3;
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Минимальное число: " + minNum);
        System.out.print("Числа в порядке убывания: ");
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        num1 = 1234;
        int sum = 0;
        System.out.print("Цифры числа " + num1 + ": ");
        while (num1 > 0) {
            int reversNumber = num1 % 10;
            System.out.print(reversNumber);
            sum += reversNumber;
            num1 /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        num1 = 1;
        num2 = 30;
        int charsPerLine = 5;
        int count = 0;
        System.out.print("Нечётные числа из полуинтервала [" + num1 + ", " + num2 + "): \n");
        for (int i = num1; i < num2; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                count++;
                if (count % charsPerLine == 0) {
                    System.out.println();
                }
            }
        }
        if (count % charsPerLine != 0) {
            for (int i = count % charsPerLine; i < charsPerLine; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");
        num1 = 3242592;
        count = 0;
        System.out.print("В " + num1);
        while (num1 > 0) {
            if (num1 % 10 == 2) {
                count++;
            } 
            num1 /= 10;
        }
        if (count % 2 == 0) {
            System.out.print(" чётное");
        } else {
            System.out.print(" нечётное");
        }
        System.out.println(" (" + count + ") количество двоек");

        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        int width = 10;
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int size = 5;
        int row = size;
        while (row > 0) {
            int charCounter = 0;
            while (charCounter < row) {
                System.out.print("*");
                charCounter++;
            }
            System.out.println();
            row--;
        }

        System.out.println();
        size = 3;
        row = 1;
        do {
            int chars;
            if (row <= size) {       // Верхняя половина треугольника
                chars = row;
            } else {                 // Нижняя половина треугольника
                chars = 2 * size - row;
            }
            int charCounter = 0;
            do {
                System.out.print("$");
                charCounter++;
            } while (charCounter < chars);
            System.out.println();
            row++;
        } while (row <= 2 * size - 1);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.printf("%-10s%-12s%-30s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 57; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4s%11c            %-30s\n", i, i, Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4s%11c            %-30s\n", i, i, Character.getName(i));
            }
        }

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        int originalNumber = 1234321;
        int currNumber = originalNumber;
        int revercedNumber = 0;
        while (originalNumber > 0) {
            num2 = originalNumber % 10;
            revercedNumber = revercedNumber * 10 + num2;
            originalNumber /= 10;
        }
        if (currNumber == revercedNumber) {
            System.out.println("Число " + currNumber + " - палиндром");
        } else {
            System.out.println("Число " + currNumber + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        originalNumber = 123321;
        int firstHalf = originalNumber / 1000;
        int firstHalfSum = 0;
        int secondHalf = originalNumber % 1000;
        int secondHalfSum = 0;
        for (int i = 0; i < 3; i++) {
            firstHalfSum += firstHalf % 10;
            firstHalf /= 10;
            secondHalfSum += secondHalf % 10;
            secondHalf /= 10;
        }
        System.out.print("Число " + originalNumber + " - ");
        if (firstHalfSum == secondHalfSum) {
            System.out.println("счастливое");
        } else {
            System.out.println("не счастливое");
        }
        System.out.println("Сумма цифр " + (originalNumber / 1000) + " = " + firstHalfSum);
        System.out.println("Сумма " + (originalNumber % 1000) + " = " + secondHalfSum);

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");
        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+-----------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}