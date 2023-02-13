import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber(new Player(1), new Player(2));
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {
            guessNumber.setTargetNumber();
            boolean isGuessed = false;
            while(isGuessed == false) {
                guessNumber.switchPlayer();
                guessNumber.tryGuess();
                isGuessed = guessNumber.checkNumber();
            }
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scan.next();
                if (answer.equals("no")) {
                    return;
                }
            } while (!answer.equals("yes"));
        }
    }
}