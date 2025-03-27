import java.util.Scanner;

public class CalculatTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        String continueCalculation;

        do {
            System.out.print("Введите первое число: ");
            int num1Scan = scan.nextInt();
            scan.nextLine();
            calculatorOne.setNum1(num1Scan);

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char sign = scan.nextLine().charAt(0);
            calculatorOne.setOperator(sign);

            System.out.print("Введите второе число: ");
            int num2Scan = scan.nextInt();
            calculatorOne.setNum2(num2Scan);

            calculatorOne.calculate();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                continueCalculation = scan.next();
            } while (!continueCalculation.equalsIgnoreCase("yes") && 
                !continueCalculation.equalsIgnoreCase("no"));
        } while (continueCalculation.equalsIgnoreCase("yes"));
        scan.close();
    }
}