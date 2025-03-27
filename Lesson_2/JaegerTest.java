public class JaegerTest {
    public static void main(String[] args) {
        // Первый егерь
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setWeight(1.98f);
        jaegerOne.setHeight(79.25f);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);
        jaegerOne.setSpeed(7);
        System.out.println("Характеристики первого егеря:");
        System.out.println("Название модель: " + jaegerOne.getModelName());
        System.out.println("Поколение: " + jaegerOne.getMark());
        System.out.println("Страна производитель: " + jaegerOne.getOrigin());
        System.out.println("Вес: " + jaegerOne.getWeight() + " тонн");
        System.out.println("Рост: " + jaegerOne.getHeight() + " метров");
        System.out.println("Сила: " + jaegerOne.getStrength());
        System.out.println("Броня: " + jaegerOne.getArmor());
        System.out.println("Скорость: " + jaegerOne.getSpeed());
        jaegerOne.move();
        jaegerOne.weapon();
        jaegerOne.powerMove();

        // Второй егерь
        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", "Mark-4", "China", 1.722f, 76.2f, 8, 6, 9);
        System.out.println("\nХарактеристики второго егеря:");
        System.out.println("Название модель: " + jaegerTwo.getModelName());
        System.out.println("Поколение: " + jaegerTwo.getMark());
        System.out.println("Страна производитель: " + jaegerTwo.getOrigin());
        System.out.println("Вес: " + jaegerTwo.getWeight() + " тонн");
        System.out.println("Рост: " + jaegerTwo.getHeight() + " метров");
        System.out.println("Сила: " + jaegerTwo.getStrength());
        System.out.println("Броня: " + jaegerTwo.getArmor());
        System.out.println("Скорость: " + jaegerTwo.getSpeed());
        jaegerTwo.move();
        jaegerTwo.weapon();
        jaegerTwo.powerMove();
    }
}