public class WolfTest {

    public static void main(String[] args) {
        Wolf bigBadWolf = new Wolf();
        bigBadWolf.setGender("самец");
        bigBadWolf.setNickname("Серый Волк");
        bigBadWolf.setWeight(50.5f);
        bigBadWolf.setAge(5);
        bigBadWolf.setColor("серый");

        System.out.println("Это волк !!!");
        System.out.println("пол - " + bigBadWolf.getGender());
        System.out.println("кличка - " + bigBadWolf.getNickname());
        System.out.println("вес = " + bigBadWolf.getWeight());
        System.out.println("возраст = " + bigBadWolf.getAge() + " лет");
        System.out.println("окрас - " + bigBadWolf.getColor());
        
        bigBadWolf.walk();
        bigBadWolf.sit();
        bigBadWolf.run();
        bigBadWolf.howl();
        bigBadWolf.hunt();
    }
}