public class Calculator {
    private int num1;
    private int num2;
    private char operator;
    private double result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return;
                }
                result = num1 / num2;
                break;
            case '^':
                result = 1;
                if (num2 < 0) {
                    num2 = -num2;
                }
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                if (num2 < 0) {
                    result = 1 / result;
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return;
                }
                result = num1 % num2;
                break;
            default:
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
                break;
        }
        System.out.println("Результат: " + result);
    }
}