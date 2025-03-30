import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                userResponse = scanner.next().toLowerCase();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        } while (userResponse.equals("yes"));

        System.out.println("Спасибо за игру!");
        scanner.close();
    }
}