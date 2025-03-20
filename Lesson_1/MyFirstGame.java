public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 67;
        int playerNumber = 65;
        int rangeStart = 1;
        int rangeEnd = 100;
        while (true) {
            if (playerNumber < computerNumber && playerNumber >= rangeStart) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            } else if (playerNumber > computerNumber && playerNumber <= rangeEnd) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else if (playerNumber < rangeStart || playerNumber > rangeEnd) {
                System.out.println("Ошибка: недопустимое число");
                break;
            } else {
                System.out.println("Вы победили! Загаданное число: " + computerNumber);
                break;
            }
        }
    }
}
