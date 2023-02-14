import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок 1 введите своё имя: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Игрок 2 введите своё имя: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        String answer = "yes";
        while (answer.equals("yes")) {
            guessNumber.startGame();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}