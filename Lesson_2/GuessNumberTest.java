import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerResponse;

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playerResponse = scanner.next().toLowerCase();
            } while (!playerResponse.equals("yes") && !playerResponse.equals("no"));
        } while (playerResponse.equals("yes"));

        System.out.println("Спасибо за игру!");
        scanner.close();
    }
}