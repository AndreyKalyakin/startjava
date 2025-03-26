public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setNickname("Петрович");
        wolfOne.setWeight(32.3f);
        wolfOne.setAge(9);
        wolfOne.setColor("серый");

        System.out.println("Пол = " + wolfOne.getGender());
        System.out.println("Кличка = " + wolfOne.getNickname());
        System.out.println("Вес = " + wolfOne.getWeight() + " кг");
        System.out.println("Возраст = " + wolfOne.getAge() + " лет");
        System.out.println("Окрас = " + wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}