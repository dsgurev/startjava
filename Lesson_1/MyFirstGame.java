public class MyFirstGame {

    public static void main(String[] args) {
        boolean isWin = false;
        int pikedNumber = 77;
        int supposeLow = 1;
        int supposeHigh = 100;
        if (pikedNumber > 100 || pikedNumber < 1) {
            System.out.printf("Загаданное число %d не входит в полуинтервал (0, 100]", pikedNumber);
        } else {
        do {
            if (pikedNumber == supposeLow) {
                isWin = true;
            } else {
                System.out.printf("Число %3d меньше того, что загадал компьютер\n", supposeLow);
            }
            if (pikedNumber == supposeHigh) {
                isWin = true;
            } else if (!isWin) {
                System.out.printf("Число %3d больше того, что загадал компьютер\n", supposeHigh);
            }
            supposeLow++;
            supposeHigh--;
            if (isWin) {
                System.out.printf("Вы победили! Число %d угадано", pikedNumber);
            }
        } while (!isWin);
        }
    }
}
