public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА");
        // Назначение переменных
        byte coreNumbers = 8;
        short osArchitecture = 64;
        int ramCapacity = 16384;
        long hddCapacity = 511210237952L;
        float screenDiagonal = 15.6f;
        double cpuFrequency = 3.20;
        char firstCharOs = 'W';
        boolean isLaptop = true;
        // Вывод характеристик
        System.out.println("Количество ядер: " + coreNumbers);
        System.out.println("Разрядность системы: x" + osArchitecture);
        System.out.println("Объем оперативной памяти: " + ramCapacity + " Mb");
        System.out.println("Объем жесткого диска: " + hddCapacity + " byte");
        System.out.println("Размер экрана: " + screenDiagonal + " in");
        System.out.println("Частота процессора: " + cpuFrequency + " GHz");
        System.out.println("Первая буква названия системы: " + firstCharOs);
        System.out.println("Это ноутбук? " + isLaptop);

        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        // Стоимость ручки
        float penPrice = 105.5f;
        // Стоимость книги
        float bookPrice = 235.83f;
        // Скидка
        float discount = 0.11f;
        // Общая стоимость товаров без скидки
        float totalPrice = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки = " + totalPrice);
        // Общая сумма скидки
        float penDiscount = penPrice * discount;
        float bookDiscount = bookPrice * discount;
        float sumDiscount = penDiscount + bookDiscount;
        System.out.println("Общая сумма скидки = " + sumDiscount);
        // Общая стоимость товаров со скидкой
        float penDiscountPrice = penPrice - penDiscount;
        float bookDiscountPrice = bookPrice - bookDiscount;
        float totalDiscountPrice = penDiscountPrice + bookDiscountPrice;
        System.out.println("Общая стоимость товаров со скидкой = " + totalDiscountPrice);

        System.out.println("\n3. ВЫВОД СЛОВА JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4. ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");
        // Вывод byte
        byte maxByte = 127;
        System.out.println("Вывод типа: byte");
        System.out.println("Первоначальное значение = " + maxByte);
        maxByte++;
        System.out.println("Значение byte после инкремента на единицу = " + maxByte);
        maxByte--;
        System.out.println("Значение byte после декремента на единицу = " + maxByte);
        // Вывод short
        short maxShort = 32767;
        System.out.println("Вывод типа: short");
        System.out.println("Первоначальное значение = " + maxShort);
        maxShort++;
        System.out.println("Значение short после инкремента на единицу = " + maxShort);
        maxShort--;
        System.out.println("Значение short после декремента на единицу = " + maxShort);
        // Вывод int
        int maxInt = 2147483647;
        System.out.println("Вывод типа: int");
        System.out.println("Первоначальное значение = " + maxInt);
        maxInt++;
        System.out.println("Значение short после инкремента на единицу = " + maxInt);
        maxInt--;
        System.out.println("Значение short после декремента на единицу = " + maxInt);
        // Вывод long
        long maxLong = 9223372036854775807L;
        System.out.println("Вывод типа: long");
        System.out.println("Первоначальное значение = " + maxLong);
        maxLong++;
        System.out.println("Значение short после инкремента на единицу = " + maxLong);
        maxLong--;
        System.out.println("Значение short после декремента на единицу = " + maxLong);
        // Вывод char
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
        // С помощью третьей переменной
        System.out.println("С помощью третьей переменной");
        System.out.println("Исходные значения до обмена: а = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Значения после обмена: a = " + a + ", b = " + b);
        // С помощью арифметических операций
        System.out.println("С помощью арифметических операций");
        System.out.println("Исходные значения до обмена: а = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значения после обмена: a = " + a + ", b = " + b);
        // С помощью побитовой операции ^
        System.out.println("С помощью побитовой операции ^");
        System.out.println("Исходные значения до обмена: а = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Значения после обмена: a = " + a + ", b = " + b);

        System.out.println("\n6. ВЫВОД СИМВОЛОВ И ИХ КОДОВ");
        char asciiCode36 = '$';
        char asciiCode42 = '*';
        char asciiCode64 = '@';
        char asciiCode94 = '^';
        char asciiCode126 = '~';
        // Вывод значений Код - Символ
        System.out.println("Код: " + (int) asciiCode36 + " Символ: " + asciiCode36);
        System.out.println("Код: " + (int) asciiCode42 + " Символ: " + asciiCode42);
        System.out.println("Код: " + (int) asciiCode64 + " Символ: " + asciiCode64);
        System.out.println("Код: " + (int) asciiCode94 + " Символ: " + asciiCode94);
        System.out.println("Код: " + (int) asciiCode126 + " Символ: " + asciiCode126);

        System.out.println("\n7. ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");
        char sym1 = '/';
        char sym2 = '\\';
        char sym3 = '_';
        char sym4 = '(';
        char sym5 = ')';
        // Вывод ASCII-АРТ ДЮКА
        System.out.println("    " + sym1 + sym2 + "\n" +
                "   " + sym1 + "  " + sym2 + "\n" +
                "  " + sym1 + sym3 + sym4 + " " + sym5 + sym2 + "\n" +
                " " + sym1 + "      " + sym2 + "\n" +
                sym1 + sym3 + sym3 + sym3 + sym3 + sym1 + sym2 + sym3 + sym3 + sym2);

        System.out.println("\n8. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА");
    }
}