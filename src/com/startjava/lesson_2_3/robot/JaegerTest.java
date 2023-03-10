package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Chronos Berserker");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("Australia");
        jaegerOne.setSpeed(5);

        System.out.println("-=Первый робот=-");
        System.out.println("Модель: " + jaegerOne.getModelName());
        System.out.println("Поколение: " + jaegerOne.getMark());
        System.out.println("Страна производства: " + jaegerOne.getOrigin());
        System.out.println("Текущая скорость: " + jaegerOne.getSpeed());

        System.out.println("-=Второй робот=-");
        Jaeger jaegerTwo = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 1);
        System.out.println("Модель: " + jaegerTwo.getModelName());
        System.out.println("Поколение: " + jaegerTwo.getMark());
        System.out.println("Страна производства: " + jaegerTwo.getOrigin());
        System.out.println("Текущая скорость: " + jaegerTwo.getSpeed() + "\n");

        jaegerOne.checkMoving();
        jaegerTwo.checkMoving();
        jaegerTwo.setSpeed(9);
        jaegerTwo.showSpeed();
        jaegerOne.showSpeed();
        jaegerTwo.setSpeed(0);
        jaegerTwo.checkMoving();
    }
}