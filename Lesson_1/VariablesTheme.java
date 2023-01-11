public class VariablesTheme {

    public static void main(String[] args) {
        //1. Вывод значений переменных на консоль
        System.out.println("\n1. Вывод значений переменных на консоль");
        boolean isPersonalComputer = true;
        System.out.println("isPersonalComputer = " + isPersonalComputer + "   | это персональный компьютер (boolean -- булев тип)");
        byte coresNumber = 6;
        System.out.println("coresNumber        = " + coresNumber + "      | количество физических ядер (byte -- 8-разрядное целое число)");
        short logicalCoresNumber = 12;
        System.out.println("logicalCoresNumber = " + logicalCoresNumber + "     | количество логических ядер (short -- 16-разрядное целое число)");
        int memorySizeInGb = 32;
        System.out.println("memorySizeInGb     = " + memorySizeInGb + "     | объем ОЗУ в Гб (int -- 32-разрядное целое число)");
        long memorySizeInMb = 32_768L;
        System.out.println("memorySizeInMb     = " + memorySizeInMb + "  | объем ОЗУ в Мб (long -- 64-разрядное целое число)");
        float processorFreqGg = 4.3f;
        System.out.println("processorFreqGg    = " + processorFreqGg + "    | частота процессора в ГГц " +
                "(float -- 32-разрядное число в формате IEEE 754 с плавающей точкой)");
        double processorFreqMg = 4300.0d;
        System.out.println("processorFreqMg    = " + processorFreqMg + " | частота процессора в МГц " +
                "(double -- 64-разрядное число в формате IEEE 754 с плавающей точкой)");
        char diskName = 'C';
        System.out.println("diskName           = " + diskName + "      | буква логического диска " + 
                "(char -- 16-разрядное беззнаковое целое, представляющее собой символ UTF-16)");
        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 100f;
        float bookPrice = 200f;
        float totalPrice = penPrice + bookPrice;
        float discont = totalPrice * 11 / 100;
        System.out.println("сумма скидки = " + discont + " руб.");
        System.out.println("общая стоимость товаров со скидкой = " + (totalPrice - discont) + " руб.");
        //3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a" +
                "\n   J   a a  v   v  a a" +
                "\nJ  J  aaaaa  V V  aaaaa" +
                "\n JJ  a     a  V  a     a");
        //4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        byte byteNumI = (byte) (byteNum + 1);
        byte byteNumD = (byte) (byteNumI - 1);
        System.out.println("byte  " + byteNum + " | " + byteNumI + " | " + byteNumD );
        short shortNum = 32767;
        short shortNumI = (short) (shortNum + 1);
        short shortNumD = (short) (shortNumI - 1);
        System.out.println("short " + shortNum + " | " + shortNumI + " | " + shortNumD );
        int intNum = 2147483647;
        int intNumI = intNum + 1;
        int intNumD = intNumI - 1;
        System.out.println("int   " + intNum + " | " + intNumI + " | " + intNumD );
        long longNum = 9223372036854775807L;
        long longNumI = longNum + 1;
        long longNumD = longNumI - 1;
        System.out.println("long  " + longNum + " | " + longNumI + " | " + longNumD );
        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("с помощью третьей переменной");
        int num1 = 2;
        int num2 = 5;
        int num3;
        System.out.println("исходные значения переменных: num1 = " + num1 + " | num2 = " + num2 );
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("новые значения переменных:    num1 = " + num1 + " | num2 = " + num2 );
        System.out.println("с помощью арифметических операций");
        System.out.println("исходные значения переменных: num1 = " + num1 + " | num2 = " + num2 );
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения переменных:    num1 = " + num1 + " | num2 = " + num2 );
        System.out.println("с помощью побитовой операции ^");
        System.out.println("исходные значения переменных: num1 = " + num1 + " | num2 = " + num2 );
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новые значения переменных:    num1 = " + num1 + " | num2 = " + num2 );
        //6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char char35 = '#';
        char char38 = '&';
        char char64 = '@';
        char char94 = '^';
        char char95 = '_';
        System.out.println(char35);
        System.out.println((short) char35);
        System.out.println(char38);
        System.out.println((short) char38);
        System.out.println(char64);
        System.out.println((short) char64);
        System.out.println(char94);
        System.out.println((short) char94);
        System.out.println(char95);
        System.out.println((short) char95);
        //7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        char underline = '_';
        System.out.println("    " + slash + backslash +
                "\n   " + slash + "  " + backslash +
                "\n  " + slash + underline + leftBracket + " " + rightBracket + backslash +
                "\n " + slash + "      " + backslash +
                "\n" + slash + underline + underline + underline + underline + slash + backslash + underline + underline + backslash);
        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        short num = 123;
        short hundreds = (short) (num / 100);
        short tens = (short) ((num % 100) / 10);
        short units = (short) ((num % 100) % 10);
        System.out.println("   Число " + num + " содержит:" +
                "\n         " + hundreds + " сотен" +
                "\n         " + tens + " десятков" +
                "\n         " + units + " единиц");
        System.out.println("   Сумма его цифр = " + (hundreds + tens + units) +
                "\n   Произведение = " + (hundreds * tens * units));
        //9. Вывод времени
        System.out.println("\n9. Вывод времени");
        int secs = 86399;
        int hh = secs / 3600;
        int mm = secs % 3600 / 60;
        int ss = secs % 3600 % 60;
        System.out.println(secs + " секунд это " + hh + ":" + mm + ":" + ss);
    }
}