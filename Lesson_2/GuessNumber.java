import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateTargetNumber();
        do {
            switchPlayer();
            tryGuess();
        } while (!isGuessed());
    }

    private void generateTargetNumber() {
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Компьютер загадал число");
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private void tryGuess() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Игрок " + currentPlayer.getName() + " введите число: ");
            currentPlayer.setNumber(scan.nextInt());
        } while (currentPlayer.getNumber() == 0);
    }

    private boolean isGuessed() {
        int playerNumber = currentPlayer.getNumber();

        if (playerNumber < targetNumber) {
            System.out.printf("Число %3d меньше того, что загадал компьютер\n", playerNumber);
        } else if (playerNumber > targetNumber) {
            System.out.printf("Число %3d больше того, что загадал компьютер\n", playerNumber);
        } else {
            System.out.printf("%s, вы победили! Число %d угадано\n", currentPlayer.getName(),
                    targetNumber);
            return true;
        }
        return false;
    }
}
