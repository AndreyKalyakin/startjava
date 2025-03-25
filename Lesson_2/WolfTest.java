public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "самец";
        wolfOne.nickname = "Петрович";
        wolfOne.weight = 32.3f;
        wolfOne.age = 7;
        wolfOne.color = "серый";

        System.out.println("Пол = " + wolfOne.gender);
        System.out.println("Кличка = " + wolfOne.nickname);
        System.out.println("Вес = " + wolfOne.weight + " кг");
        System.out.println("Возраст = " + wolfOne.age + " лет");
        System.out.println("Окрас = " + wolfOne.color);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
        }
}