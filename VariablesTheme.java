public class VariablesTheme {
        public static void main(String[] args) {
            System.out.println("1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА");
            // Количество ядер
            byte coreNumbers = 8;
            // Разрядность системы
            short osArchitecture = 64;
            // Объем оперативной памяти (мегабайт)
            int ramCapacity = 16384;
            // Объем жесткого диска (байт)
            long hddCapacity = 511210237952L;
            // Размер экрана (дюймов)
            float screenDiagonal = 15.6f;
            // Частота процессора (GHz)
            double cpuFrequency = 3.20;
            // Первая буква названия системы (Windows\Linux\Mac)
            char firstCharOs = 'W';
            // Это ноутбук?
            boolean isLaptop = true;
            // Вывод характеристик
            System.out.println("Количество ядер " + coreNumbers);
            System.out.println("Разрядность системы x" + osArchitecture);
            System.out.println("Объем оперативной памяти " + ramCapacity + " Mb");
            System.out.println("Объем жесткого диска " + hddCapacity + " byte");
            System.out.println("Размер экрана " + screenDiagonal + " in");
            System.out.println("Частота процессора " + cpuFrequency + " GHz");
            System.out.println("Первая буква названия системы " + firstCharOs);
            System.out.println("Это ноутбук? " + isLaptop);

            System.out.println();
            System.out.println("2. ");
        }
}