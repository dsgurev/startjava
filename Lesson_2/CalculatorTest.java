import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            calculator.setA(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scan.nextInt());
            calculator.calc();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}