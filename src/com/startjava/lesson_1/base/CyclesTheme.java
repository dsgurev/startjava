package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int evenCount = 0;
        int oddCount = 0;
        do {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            i++;
        } while (i < 22);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenCount +
                ", а нечетных = " + oddCount);

        //2. Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        if (min > num2) {
            min = num2;
        } 
        if (min > num3) {
            min = num3;
        }
        max--;
        for (int j = max; j > min; j--) {
            System.out.print(j + " ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        System.out.print( "исходное число в обратном порядке: ");
        while(number != 0){
            System.out.print(number % 10);
            sum += number % 10;
            number /= 10;
        }
        System.out.println("\nсумма его цифр: " + sum);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int numCount = 0;
        for (int k = 1; k < 24; k += 2) {
            System.out.printf("%3d", k);
            numCount++;
            if (numCount % 5 == 0) {
                numCount = 0;
                System.out.print("\n");
            }
        }
        do {
            System.out.printf("%3d", 0);
            numCount++;
        } while (numCount % 5 != 0);

        //5. Проверка количества двоек на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int num5 = 3242592;
        int num5Temp = num5;
        int countOf2 = 0;
        while(num5Temp != 0){
            if (num5Temp % 10 == 2) {
                countOf2++;
            }
            num5Temp /= 10;
        }
        String oddEven = "нечетное";
        if (countOf2 % 2 == 0) {
            oddEven = "четное";
        }
        System.out.printf("число %d содержит %d %s количество двоек", num5, countOf2, oddEven);

        //6. Отображение фигур в консоли
        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int l = 0; l < 5; l++) {
            System.out.print("**********\n");
        }
        int m = 5;
        while(m != 0){
            String formatPattern = "%." + m + "s%n";
            System.out.printf(formatPattern, "#####");
            m--;
        }
        int n = 1;
        int diff = 1;
        do {
            String formatPattern = "%." + n + "s%n";
            System.out.printf(formatPattern, "$$$");
            if (n == 3) {
                diff = -1;
            }
            n += diff;
        } while (n > 0);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%5s%5s%n", "Dec", "Char");
        for (int o = 1; o <= 255; o++) {
            if ((o < '0' && o % 2 != 0) || (o > 'a' && o < 'z' && o % 2 == 0)) {
                System.out.printf("%5d%5c%n", o, o);
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number8 = 1234321;
        int polydrome = number8;
        int emordylop = 0;
        int emordylopPrev = polydrome;
        while (polydrome > emordylop) {
            int rightDigit = polydrome % 10;
            emordylopPrev = polydrome;
            polydrome /= 10;
            emordylop = emordylop * 10 + rightDigit;
        }
        if (emordylop == polydrome || emordylop == emordylopPrev) {
            System.out.printf("число %d является палиндромом", number8);
        } else {
            System.out.printf("число %d не является палиндромом", number8);
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n\n9. Определение, является ли число счастливым");
        int sum1 = 0;
        int sum2 = 0;
        String string1 = "";
        String string2 = "";
        int num9 = 123321;
        int divider = 100000;
        int num9Temp = num9;
        int counter = 0;
        while(divider >= 1){
            counter++;
            int tempDivideResult = num9Temp / divider;
            if (counter <= 3) {
                sum1 += tempDivideResult;
                string1 += tempDivideResult;
            } else {
                sum2 += tempDivideResult;
                string2 += tempDivideResult;
            }
            num9Temp -= tempDivideResult * divider;
            divider /= 10;
        }
        System.out.printf("Сумма цифр %s = %d%n", string1, sum1);
        System.out.printf("Сумма цифр %s = %d%n", string2, sum2);
        if (sum1 == sum2) {
            System.out.printf("Число %d является счастливым", num9);
        } else {
            System.out.printf("Число %d не является счастливым", num9);
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("%23s","ТАБЛИЦА ПИФАГОРА\n");
        for (int row = 1; row < 10; row++) {
            for (int column = 1; column < 10; column++) {
                int tempNum = row * column;
                if (tempNum != 1) {
                    System.out.printf("%3d", tempNum);
                } else {
                    System.out.printf("%3s", "");
                }
                if (column == 1) {
                    System.out.printf("%2s", "|");
                }
            }
            System.out.print("\n");
            if (row == 1) {
                System.out.println("  ---------------------------");
            }
        }
    }
}
