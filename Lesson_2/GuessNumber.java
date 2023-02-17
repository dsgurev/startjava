import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player playerCurrent;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        setTargetNumber();
        do {
            switchPlayer();
            tryGuess();
        } while (checkNumberIsGuessed() == false);
    }

    private void setTargetNumber() {
        targetNumber = (int) Math.ceil(Math.random() * 100);
        System.out.println("Компьютер загадал число");
    }

    private void switchPlayer() {
        playerCurrent = (playerCurrent == null || playerCurrent == player2) ? player1 : player2;
    }

    private void tryGuess() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Игрок " + playerCurrent.getName() + " введите число: ");
            playerCurrent.setNumber(scan.nextInt());
        } while (playerCurrent.getNumber() == 0);
    }

    private boolean checkNumberIsGuessed() {
        boolean numberIsGuessed = false;
        int playerNumber = playerCurrent.getNumber();

        if (playerNumber < targetNumber) {
            System.out.printf("Число %3d меньше того, что загадал компьютер\n", playerNumber);
        } else if (playerNumber > targetNumber) {
            System.out.printf("Число %3d больше того, что загадал компьютер\n", playerNumber);
        } else {
            System.out.printf("%s, вы победили! Число %d угадано\n", playerCurrent.getName(),
            targetNumber);
            numberIsGuessed = true;
        }
        return numberIsGuessed;
    }
}
