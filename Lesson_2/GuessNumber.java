import java.util.Scanner;

public class GuessNumber {
    public Player playerOne;
    public Player playerTwo;
    public Player player;
    private int targetNumber;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void setTargetNumber() {
        targetNumber = (int) (Math.random() * 101);
        if (targetNumber == 0) {
            targetNumber++;
        }
        System.out.println("Компьютер загадал число");
    }

    public void switchPlayer(){
        if (player == null || player == playerTwo) {
            player = playerOne;
        } else if (player == playerOne) {
            player = playerTwo;
        }
    }

    public void tryGuess() {
        do {
            System.out.print("Игрок " + player.getName() + " введите число: ");
            player.setNumber(scan.nextInt());
        } while (player.getNumber() < 1 || player.getNumber() > 100);
    }

    public void checkNumber() {
        int playerNumber = player.getNumber();
        if (playerNumber < targetNumber) {
            System.out.printf("Число %3d меньше того, что загадал компьютер\n", playerNumber);
        } else if (playerNumber > targetNumber) {
            System.out.printf("Число %3d больше того, что загадал компьютер\n", playerNumber);
        } else {
            System.out.printf("%s, вы победили! Число %d угадано\n", player.getName(), 
                targetNumber);
        }
    }

    public void startGame() {
        setTargetNumber();
        do {
            switchPlayer();
            tryGuess();
            checkNumber();
        } while (targetNumber != player.getNumber());
    }
}
