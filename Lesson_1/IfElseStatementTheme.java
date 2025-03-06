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

        double growth = 1.9;
        if (growth < 1.8) {
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
        int c = -11;
        if (c != 0) {
            if (c > 0) {
                if (c % 2 == 0) {
                    System.out.println(c + " является положительным и чётным");
                } else {
                    System.out.println(c + " является положительным и нечётным");
                }
            } else {
                if (c % 2 == 1) {
                    System.out.println(c + " является отрицательным и нечётным");
                } else {
                    System.out.println(c + " является отрицательным и чётным");
                }
            }
        } else {
            System.out.println(c + " является нулём");
        }

        System.out.println("\n4. ПОИСК ОДИНАКОВЫХ ЦИФР В ЧИСЛАХ");
        int d = 123;
        int e = 223;
        int ones1 = d % 10;
        int tens1 = (d / 10) % 10;
        int hundreds1 = d / 100 % 10;
        int ones2 = e % 10;
        int tens2 = (e / 10) % 10;
        int hundreds2 = e / 100 % 10;
        if (d != e) {
            if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
                System.out.println("Равных цифр нет.");
            } else {
                System.out.println("Одинаковые цифры:");
                if (hundreds1 == hundreds2) {
                    System.out.println("Сотни: " + hundreds1);
                } 
                if (tens1 == tens2) {
                    System.out.println("Десятки: " + tens1);
                } 
                if (ones1 == ones2) {
                    System.out.println("Единицы: " + ones1);
                } 
            }
        } else {
            System.out.println("Числа равны.");
        }

        System.out.println("\n5. ОПРЕДЕЛЕНИЕ СИМВОЛА ПО ЕГО КОДУ");
        char charValue = '\u0057';
        boolean isLetter = Character.isLetter(charValue);
        boolean isLowerCaseLetter = Character.isLowerCase(charValue);
        boolean isNumber = Character.isDigit(charValue);
        if (isLetter) {
            if (isLowerCaseLetter) {
                System.out.println("'" + charValue + "'" + " - это маленькая буква");
            } else {
                System.out.println("'" + charValue + "'" + " - это большая буква");
            }
        } else if (isNumber) {
            System.out.println("'" + charValue + "'" + " - это цифра");
        } else {
            System.out.println("'" + charValue + "'" + " - ни буква и ни цифра");
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        float deposit = 321123.59f;
        float interestRate;
        if (deposit < 100000f) {
            interestRate = 0.05f;
        } else if (100000f <= deposit && deposit <= 300000f) {
            interestRate = 0.07f;
        } else {
            interestRate = 0.1f;
        }
        System.out.println("Сумма вклада: " + deposit + " руб.");
        float interestAmount = deposit * interestRate;
        System.out.println("Сумма начисленного %: " + interestAmount + " руб.");
        float totalAmount = deposit + interestAmount;
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        float historyFinalGrade = 0.59f;
        float programmingFinalGrade = 0.92f;
        int historyGrade;
        int programmingGrade;
        if (historyFinalGrade > 0.91f) {
            historyGrade = 5;
        } else if (historyFinalGrade > 0.73f) {
            historyGrade = 4;
        } else if (historyFinalGrade > 0.6f) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        } 
        if (programmingFinalGrade > 0.91f) {
            programmingGrade = 5;
        } else if (programmingFinalGrade > 0.73f) {
            programmingGrade = 4;
        } else if (programmingFinalGrade > 0.6f) {
            programmingGrade = 3;
        } else {
            programmingGrade = 2;
        }
        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + programmingGrade);
        float avgGrade = ((historyGrade + programmingGrade) / 2);
        float avgPercent = (((historyFinalGrade + programmingFinalGrade) / 2) * 100);
        System.out.println("Средняя оценка по предметам - " + avgGrade);
        System.out.println("Средний процент по предметам - " + avgPercent + "%");

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        float monthlySales = 13025.233f;
        float monthlyPremisesRent = 5123.018f;
        float monthlyProductionCost = 9001.729f;
        float annualProfit = ((monthlySales - (monthlyPremisesRent + monthlyProductionCost)) * 12);
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else if (annualProfit < 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }

        System.out.println("\n9. *РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        BigDecimal monthlySales2 = new BigDecimal(13025.233);
        BigDecimal monthlyPremisesRent2 = new BigDecimal(5123.018);
        BigDecimal monthlyProductionCost2 = new BigDecimal(9001.729);
        BigDecimal annualProfit2 = (monthlySales2.subtract(monthlyPremisesRent2.add(monthlyProductionCost2)))
                .multiply(BigDecimal.valueOf(12));
        annualProfit2 = annualProfit2.setScale(2, RoundingMode.HALF_UP);
        if (annualProfit2.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + annualProfit2 + " руб.");
        } else if (annualProfit2.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Прибыль за год: " + annualProfit2 + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit2);
        }

        System.out.println("\n10. *ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        BigDecimal deposit2 = new BigDecimal(321123.59);
        BigDecimal interestRate2 = BigDecimal.ZERO;
        if (deposit2.compareTo(BigDecimal.valueOf(100000)) < 0) {
            interestRate2 = new BigDecimal(0.05);
        } else if (deposit2.compareTo(BigDecimal.valueOf(100000)) >= 0 && 
                deposit2.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            interestRate2 = new BigDecimal(0.07);
        } else if (deposit2.compareTo(BigDecimal.valueOf(300000)) > 0) {
            interestRate2 = new BigDecimal(0.1);
        }
        deposit2 = deposit2.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма вклада: " + deposit2 + " руб.");
        BigDecimal interestAmount2 = deposit2.multiply(interestRate2).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма начисленного %: " + interestAmount2 + " руб.");
        BigDecimal totalAmount2 = deposit2.add(interestAmount2).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Итоговая сумма с %: " + totalAmount2 + " руб.");
    }
}