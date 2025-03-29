import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = (int) (Math.random() * 100) + 1;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Компьютер загадал число от 1 до 100.");
        boolean guessed = false;
        Player currentPlayer = player1;

        while (!guessed) {
            System.out.print(currentPlayer.getName() + ", введите число: ");
            int guess = scanner.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("Число должно быть в диапазоне от 1 до 100.");
                continue;
            }

            currentPlayer.setNumber(guess);

            if (guess == secretNumber) {
                System.out.println(currentPlayer.getName() + " угадал число! Победа!");
                guessed = true;
            } else if (guess < secretNumber) {
                System.out.println(guess + " меньше того, что загадал компьютер");
            } else {
                System.out.println(guess + " больше того, что загадал компьютер");
            }

            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
    }
}