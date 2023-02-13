public class GuessNumber {
    public Player playerOne;
    public Player playerTwo;
    public Player player;
    private int targetNumber;

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
        player.setNumber();
    }

    public boolean checkNumber() {
        boolean isGuessed = false;
        if (player.getNumber() < targetNumber) {
            System.out.printf("Число %3d меньше того, что загадал компьютер\n", player.getNumber());
        } else if (player.getNumber() > targetNumber) {
            System.out.printf("Число %3d больше того, что загадал компьютер\n", player.getNumber());
        } else {
            System.out.printf("%s, вы победили! Число %d угадано\n", player.getName(), 
                targetNumber);
            isGuessed = true;
        }
        return isGuessed;
    }
}
