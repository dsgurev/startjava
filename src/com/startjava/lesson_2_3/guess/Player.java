package com.startjava.lesson_2_3.guess;

public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        if (number < 1 || number > 100) {
            System.out.println("Введённое число выходит за пределы полуинтервала (0, 100]");
            this.number = 0;
        } else this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}