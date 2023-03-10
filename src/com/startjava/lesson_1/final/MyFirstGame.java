package com.startjava.lesson_1.final;

public class MyFirstGame {

    public static void main(String[] args) {
        int targetNumber = 77;
        int playerNumber = 0;
        if (targetNumber < 1 || targetNumber > 100) {
            System.out.printf("Загаданное число %d не входит в полуинтервал (0, 100]",
                    targetNumber);
            return;
        }
        for (int i = 100; i > 0; i--) {
            for (int j = 1; j <= 2; j++) {
                if (j % 2 != 0) {
                    playerNumber = 101 - i;
                } else {
                    playerNumber = i;
                }
                if (playerNumber < targetNumber) {
                    System.out.printf("Число %3d меньше того, что загадал компьютер\n",
                        playerNumber);
                } else if (playerNumber > targetNumber) {
                    System.out.printf("Число %3d больше того, что загадал компьютер\n",
                        playerNumber);
                } else {
                    System.out.printf("Вы победили! Число %d угадано", targetNumber);
                    return;
                }
            }
        }
    }
}
