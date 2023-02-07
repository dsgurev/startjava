public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 1);

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
        System.out.println("Модель: " + jaegerTwo.getModelName());
        System.out.println("Поколение: " + jaegerTwo.getMark());
        System.out.println("Страна производства: " + jaegerTwo.getOrigin());
        System.out.println("Текущая скорость: " + jaegerTwo.getSpeed());
        System.out.print("\n");
        jaegerOne.checkMoving();
        jaegerTwo.checkMoving();
        jaegerTwo.setSpeed(9);
        jaegerTwo.checkSpeed();
        jaegerOne.checkSpeed();
        jaegerTwo.setSpeed(0);
        jaegerTwo.checkMoving();
    }
}