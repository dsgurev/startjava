public class WolfTest {

    public static void main(String[] args) {
        Wolf bigBadWolf = new Wolf();
        bigBadWolf.gender = "самец";
        bigBadWolf.nickname = "Серый Волк";
        bigBadWolf.weight = 50.5f;
        bigBadWolf.age = 5;
        bigBadWolf.color = "серый";
        System.out.println("Это волк !!!");
        System.out.println("пол - " + bigBadWolf.gender);
        System.out.println("кличка - " + bigBadWolf.nickname);
        System.out.println("вес = " + bigBadWolf.weight);
        System.out.println("возраст = " + bigBadWolf.age + " лет");
        System.out.println("окрас - " + bigBadWolf.color);
        bigBadWolf.walk();
        bigBadWolf.sit();
        bigBadWolf.run();
        bigBadWolf.howl();
        bigBadWolf.hunt();
    }
}