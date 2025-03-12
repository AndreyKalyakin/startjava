public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int num1 = -10;
        int num2 = 21;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("В отрезке [" + num1 + ", " + num2 + "]");
        do {
            if (num1 % 2 == 0) {
                sumEven += num1;
            } else {
                sumOdd += num1;
            }
            num1++;
        } while (num1 <= num2);
        System.out.println(" сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
        num1 = 10;
        num2 = 5;
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
        for (int i = maxNum; i >= minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        num1 = 1234;
        int sum = 0;
        System.out.print("Цифры числа " + num1 + ": ");
        while (num1 > 0) {
            num2 = num1 % 10;
            System.out.print(num2 + " ");
            sum += num2;
            num1 /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        num1 = 1;
        num2 = 30;
        int charLine = 5;
        int count = 0;
        System.out.print("Нечётные числа из полуинтервала [" + num1 + ", " + num2 + "): \n");
        for (int i = num1; i < num2; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                count++;
                if (count % charLine == 0) {
                    System.out.println();
                }
            }
        }
        if (count % charLine != 0) {
            for (int i = count % charLine; i < charLine; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");
        num1 = 3242592;
        count = 0;
        System.out.print("В " + num1);
        while (num1 > 0) {
            int lastDigit = 0;
            lastDigit = num1 % 10;
            if (lastDigit % 10 == 2) {
                count++;
            } 
            num1 /= 10;
        }
        if (count % 2 == 0) {
            System.out.print(" чётное");
        } else {
            System.out.print(" нечётное");
        }
        System.out.print(" (" + count + ") количество двоек");

        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        int rectangleWidth = 10;
        int rectangleHeight = 5;
        for (int i = 0; i < rectangleHeight; i++) {
            for (int j = 0; j < rectangleWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int n = 5;
        int row = n;
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
        n = 3;
        int i = 1;
        do {
            int charCounter = 0;
            do {
                System.out.print("$");
                charCounter++;
            } while (charCounter < i);
            System.out.println();
            i++;
        } while (i <= n);
        int j = 2;
        do {
            int charCounter = 0;
            do {
                System.out.print("$");
                charCounter++;
            } while (charCounter < j);
            System.out.println();
            j--;
        } while (j >= 1);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.printf("%-10s%-12s%-30s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (i = 33; i <= 57; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4s%11s            %-30s\n", i, (char) i, Character.getName(i));
            }
        }
        for (i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4s%11s            %-30s\n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        num1 = 1234321;
        int originalNumber = num1;
        int revercedNumber = 0;
        while (num1 != 0) {
            int digit = num1 % 10;
            revercedNumber = revercedNumber * 10 + digit;
            num1 /= 10;
        }
        if (originalNumber == revercedNumber) {
            System.out.println("Число " + originalNumber + " - палиндром");
        } else {
            System.out.println("Число " + originalNumber + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        num1 = 123321;
        int firstHalf = num1 / 1000;
        int sumFirstHalf = 0;
        for (i = 0; i < 3; i++) {
            sumFirstHalf += firstHalf % 10;
            firstHalf /= 10;
        }
        int sumSecondHalf = 0;
        int secondHalf = num1 % 1000;
        for (i = 0; i < 3; i++) {
            sumSecondHalf += secondHalf % 10;
            secondHalf /= 10;
        }
        System.out.print("Число " + num1 + " - ");
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("счастливое");
        } else {
            System.out.println("не счастливое");
        }
        System.out.println("Сумма цифр " + (num1 / 1000) + " = " + sumFirstHalf);
        System.out.println("Сумма " + (num1 % 1000) + " = " + sumSecondHalf);

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");
        System.out.print("   |");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+-----------------------------");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}