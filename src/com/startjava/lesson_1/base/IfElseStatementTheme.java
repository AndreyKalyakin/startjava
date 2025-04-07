package com.startjava.lesson_1.base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }

        int age = 17;
        if (age > 18) {
            System.out.println("Возраст больше 18 лет");
        } else {
            System.out.println("Возраст меньше 18 лет");
        }

        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Рост меньше 1.8 метра");
        } else {
            System.out.println("Рост больше 1.8 метра");
        }

        char firstLetterName = "Andrew".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА");
        int a = 345;
        int b = 965;
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        } else {
            System.out.println(a + " < " + b);
        }

        System.out.println("\n3. ПРОВЕРКА ЧИСЛА");
        int number = -11;
        if (number == 0) {
            System.out.println("Число является " + number);
        } else {
            System.out.print(number + " является ");
            if (number % 2 == 0) {
                System.out.print("чётным и");
            } else {
                System.out.print("нечётным и");
            }
            if (number > 0) {
                System.out.println(" положительным");
            } else {
                System.out.println(" отрицательным");
            }
        }

        System.out.println("\n4. ПОИСК ОДИНАКОВЫХ ЦИФР В ЧИСЛАХ");
        a = 123;
        b = 223;
        int onesA = a % 10;
        int tensA = a / 10 % 10;
        int hundredsA = a / 100 % 10;
        int onesB = b % 10;
        int tensB = b / 10 % 10;
        int hundredsB = b / 100 % 10;
        if (a != b) {
            if (onesA != onesB && tensA != tensB && hundredsA != hundredsB) {
                System.out.println("Равных цифр нет.");
            } else {
                System.out.println("Одинаковые цифры:");
                if (hundredsA == hundredsB) {
                    System.out.println("Сотни: " + hundredsA);
                } 
                if (tensA == tensB) {
                    System.out.println("Десятки: " + tensB);
                } 
                if (onesA == onesB) {
                    System.out.println("Единицы: " + onesA);
                } 
            }
        } else {
            System.out.println("Числа равны.");
        }

        System.out.println("\n5. ОПРЕДЕЛЕНИЕ СИМВОЛА ПО ЕГО КОДУ");
        char someChar = '\u0057';
        System.out.print("'" + someChar + "'" + " - это");
        if (Character.isLowerCase(someChar)) {
            System.out.println(" маленькая буква");
        } else if (Character.isUpperCase(someChar)) {
            System.out.println(" большая буква");
        } else if (Character.isDigit(someChar)) {
            System.out.println(" цифра");
        } else {
            System.out.println(" ни буква и ни цифра");
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        float deposit = 321123.59f;
        float interestRate = 0.07f;
        if (deposit < 100000) {
            interestRate = 0.05f;
        } else if (deposit > 300000) {
            interestRate = 0.1f;
        }
        float interestAmount = deposit * interestRate;
        float totalAmount = deposit + interestAmount;
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Сумма начисленного %: " + interestAmount + " руб.");
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        float historyPercent = 0.59f;
        int historyGrade = 2;
        if (historyPercent > 0.91) {
            historyGrade = 5;
        } else if (historyPercent > 0.73) {
            historyGrade = 4;
        } else if (historyPercent > 0.6) {
            historyGrade = 3;
        } 
        float programmingPercent = 0.92f;
        int programmingGrade = 2;
        if (programmingPercent > 0.91) {
            programmingGrade = 5;
        } else if (programmingPercent > 0.73) {
            programmingGrade = 4;
        } else if (programmingPercent > 0.6) {
            programmingGrade = 3;
        }
        float avgGrade = ((historyGrade + programmingGrade) / 2.0f);
        float avgPercent = (((historyPercent + programmingPercent) / 2.0f) * 100);
        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + programmingGrade);
        System.out.println("Средняя оценка по предметам - " + avgGrade);
        System.out.println("Средний процент по предметам - " + avgPercent + "%");

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        float monthlySales = 13025.233f;
        float monthlyPremisesRent = 5123.018f;
        float monthlyProductionCost = 9001.729f;
        float annualProfit = ((monthlySales - (monthlyPremisesRent + monthlyProductionCost)) * 12);
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }

        System.out.println("\n9. *РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        BigDecimal monthlySales2 = new BigDecimal("13025.233");
        BigDecimal monthlyPremisesRent2 = new BigDecimal("5123.018");
        BigDecimal monthlyProductionCost2 = new BigDecimal("9001.729");
        BigDecimal annualProfit2 = monthlySales2.subtract(monthlyPremisesRent2)
                .subtract(monthlyProductionCost2)
                .multiply(BigDecimal.valueOf(12))
                .setScale(2, RoundingMode.HALF_UP);
        if (annualProfit2.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + annualProfit2 + " руб.");
        } else if (annualProfit2.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Прибыль за год: " + annualProfit2 + " руб.");
        }

        System.out.println("\n10. *ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        BigDecimal deposit2 = new BigDecimal("321123.59");
        BigDecimal interestRate2 = new BigDecimal("0.07");
        if (deposit2.compareTo(BigDecimal.valueOf(100000)) < 0) {
            interestRate2 = new BigDecimal("0.05");
        } else if (deposit2.compareTo(BigDecimal.valueOf(300000)) > 0) {
            interestRate2 = new BigDecimal("0.1");
        }
        deposit2 = deposit2.setScale(2, RoundingMode.HALF_UP);
        BigDecimal interestAmount2 = deposit2.multiply(interestRate2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalAmount2 = deposit2.add(interestAmount2).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма вклада: " + deposit2 + " руб.");
        System.out.println("Сумма начисленного %: " + interestAmount2 + " руб.");
        System.out.println("Итоговая сумма с %: " + totalAmount2 + " руб.");
    }
}