import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА");

        byte coreNumber = 8;
        short osArch = 64;
        int ramCapacity = 16384;
        long hddCapacity = 511210237952L;
        float screenDiagonal = 15.6f;
        double cpuFrequency = 3.20;
        char firstCharOs = 'W';
        boolean isLaptop = true;
        System.out.println("Количество ядер: " + coreNumber);
        System.out.println("Разрядность системы: x" + osArch);
        System.out.println("Объем оперативной памяти: " + ramCapacity + " Mb");
        System.out.println("Объем жесткого диска: " + hddCapacity + " byte");
        System.out.println("Размер экрана: " + screenDiagonal + " in");
        System.out.println("Частота процессора: " + cpuFrequency + " GHz");
        System.out.println("Первая буква названия системы: " + firstCharOs);
        System.out.println("Это ноутбук? " + isLaptop);

        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        float penPrice = 105.5f;
        float bookPrice = 235.83f;
        float discount = 0.11f;
        float basePrice = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки = " + basePrice);
        float totalDiscount = basePrice * discount;
        System.out.println("Общая сумма скидки = " + totalDiscount);
        float totalDiscountPrice = basePrice - totalDiscount;
        System.out.println("Общая стоимость товаров со скидкой = " + totalDiscountPrice);

        System.out.println("\n3. ВЫВОД СЛОВА JAVA");
        System.out.println("    J    a  v     v  a\n" +
                "    J   a a  v   v  a a\n" +
                " J  J  aaaaa  V V  aaaaa\n" +
                "  JJ  a     a  V  a     a");

        System.out.println("\n4. ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");
        byte maxByte = 127;
        System.out.println("Вывод типа: byte");
        System.out.println("Первоначальное значение = " + maxByte);
        maxByte++;
        System.out.println("Значение byte после инкремента на единицу = " + maxByte);
        maxByte--;
        System.out.println("Значение byte после декремента на единицу = " + maxByte);

        short maxShort = 32767;
        System.out.println("Вывод типа: short");
        System.out.println("Первоначальное значение = " + maxShort);
        maxShort++;
        System.out.println("Значение short после инкремента на единицу = " + maxShort);
        maxShort--;
        System.out.println("Значение short после декремента на единицу = " + maxShort);

        int maxInt = 2147483647;
        System.out.println("Вывод типа: int");
        System.out.println("Первоначальное значение = " + maxInt);
        maxInt++;
        System.out.println("Значение short после инкремента на единицу = " + maxInt);
        maxInt--;
        System.out.println("Значение short после декремента на единицу = " + maxInt);

        long maxLong = 9223372036854775807L;
        System.out.println("Вывод типа: long");
        System.out.println("Первоначальное значение = " + maxLong);
        maxLong++;
        System.out.println("Значение short после инкремента на единицу = " + maxLong);
        maxLong--;
        System.out.println("Значение short после декремента на единицу = " + maxLong);

        char maxChar = 65535;
        System.out.println("Вывод типа: char");
        System.out.println("Первоначальное значение = " + (int) maxChar);
        maxChar++;
        System.out.println("Значение short после инкремента на единицу = " + (int) maxChar);
        maxChar--;
        System.out.println("Значение short после декремента на единицу = " + (int) maxChar);

        System.out.println("\n5. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");
        int a = 2;
        int b = 5;
        final int tmp = a;
        System.out.println("С помощью третьей переменной");
        System.out.println("Исходные значения до обмена: а = " + a + ", b = " + b);
        a = b;
        b = tmp;
        System.out.println("Значения после обмена: a = " + a + ", b = " + b);

        System.out.println("С помощью арифметических операций");
        System.out.println("Исходные значения до обмена: а = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Значения после обмена: a = " + a + ", b = " + b);

        System.out.println("С помощью побитовой операции ^");
        System.out.println("Исходные значения до обмена: а = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Значения после обмена: a = " + a + ", b = " + b);

        System.out.println("\n6. ВЫВОД СИМВОЛОВ И ИХ КОДОВ");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char caret = '^';
        char tilde = '~';
        System.out.println("Код: " + (int) dollar + " Символ: " + dollar);
        System.out.println("Код: " + (int) asterisk + " Символ: " + asterisk);
        System.out.println("Код: " + (int) atSign + " Символ: " + atSign);
        System.out.println("Код: " + (int) caret + " Символ: " + caret);
        System.out.println("Код: " + (int) tilde + " Символ: " + tilde);

        System.out.println("\n7. ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");
        char slash = '/';
        char verticalBar = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + verticalBar +
                "\n   " + slash + "  " + verticalBar +
                "\n  " + slash + underscore + leftParenthesis + " " + rightParenthesis + verticalBar +
                "\n " + slash + "      " + verticalBar +
                "\n" + slash + underscore + underscore + underscore + underscore +
                slash + verticalBar + underscore + underscore + verticalBar);

        System.out.println("\n8. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА");
        int originalNumber = 123;
        int hundreds = originalNumber / 100;
        int tens = originalNumber / 10 % 10;
        int ones = originalNumber % 10;
        int dischargeSum = hundreds + tens + ones;
        int dischargeProduct = hundreds * tens * ones;
        System.out.println("Число " + originalNumber + " содержит:\n" + 
                "  сотен - " + hundreds +
                "\n  десятков - " + tens +
                "\n  единиц - " + ones +
                "\nСумма разрядов = " + dischargeSum +
                "\nПроизведение разрядов = " + dischargeProduct);

        System.out.println("\n9. ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = totalSeconds / 60 % 60;
        int ss = totalSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss);

        System.out.println("\n10. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        BigDecimal penPrice2 = new BigDecimal(105.5);
        BigDecimal bookPrice2 = new BigDecimal(235.83);
        BigDecimal discount2 = new BigDecimal(0.11);
        BigDecimal basePrice2 = penPrice2.add(bookPrice2);
        basePrice2 = basePrice2.setScale(2, RoundingMode.DOWN); 
        System.out.println("Общая стоимость товаров без скидки = " + basePrice2);
        BigDecimal totalDiscount2 = basePrice2.multiply(discount2);
        totalDiscount2 = totalDiscount2.setScale(2, RoundingMode.DOWN);
        System.out.println("Общая сумма скидки = " + totalDiscount2);
        BigDecimal totalDiscountPrice2 = basePrice2.subtract(totalDiscount2);
        totalDiscountPrice2 = totalDiscountPrice2.setScale(2, RoundingMode.DOWN);
        System.out.println("Общая стоимость товаров со скидкой = " + totalDiscountPrice2);
    }
}