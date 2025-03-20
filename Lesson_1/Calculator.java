public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;
        char operator = '%';
        int result = 0;
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Ошибка: только натуральный числа");
        } else {
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else if (operator == '^') {
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
            } else if (operator == '%') {
                result = num1 % num2;
            } else {
                System.out.println("Ошибка: недопустимый оператор");
                return;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}