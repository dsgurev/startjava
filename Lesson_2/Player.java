import java.util.Scanner;

public class Player {
    private String name;
    private int number;
    private Scanner scan = new Scanner(System.in);
    
    public Player(int num) {
        System.out.print("Игрок " + num + " введите своё имя: ");
        name = scan.nextLine();
    }

    public String getName() {
        return name;
    }
    
    public void setNumber() {
        do {
            System.out.print("Игрок " + name + " введите число: ");
            number = scan.nextInt();
        } while (number < 1 || number > 100);
    }

    public int getNumber() {
        return number;
    }
}