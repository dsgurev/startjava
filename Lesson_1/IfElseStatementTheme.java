public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java 
        System.out.println("\n1. Перевод псевдокода на язык Java");
        byte age = 30;
        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        } else {
            System.out.println("Вам 20 лет, или меньше");
        }

        boolean isMaleSex = true;
        if (!isMaleSex) {
            System.out.println("Вы не мужчина");
        } else {
            System.out.println("Вы мужчина");
        }

        float height = 1.81f;
        if (height < 1.8) {
            System.out.println("Рост меньше 180 см");
        } else {
            System.out.println("Рост 180 см, или больше");
        }

        char firstNameChar = "Dmitriy".charAt(0);
        if (firstNameChar == 'M') {
            System.out.println("Первая буква имени = M");
        } else if (firstNameChar == 'I') {
            System.out.println("Первая буква имени = I");
        } else {
            System.out.println("Первая буква имени не M и не I, а " + firstNameChar);
        }

        //2. Поиск max и min числа
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 1000;
        int num2 = 2000;
        if (num1 == num2) {
            System.out.println("Число " + num1 + " равно " + num2);
        } else if (num1 > num2) {
            System.out.println("Максимальное число: " + num1 + "\nМинимальное число: " + num2);
        } else {
            System.out.println("Максимальное число: " + num2 + "\nМинимальное число: " + num1);
        }

        //3. Проверка числа
        System.out.println("\n3. Проверка числа");
        int num = 123_456;
        if (num == 0) {
            System.out.println("Число " + num + " является нулем");
        } else {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " является четным");
            } else {
                System.out.println("Число " + num + " является нечетным");
            }
            if (num < 0) {
                System.out.println("Число " + num + " является отрицательным");
            } else {
                System.out.println("Число " + num + " является положительным");
            }
        }

        //4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        boolean isEqualDigit = false;
        int number1 = 123;
        int number2 = 321;
        int equalDigitTemp;
        equalDigitTemp = number1 / 100;
        if (equalDigitTemp == number2 / 100) {
            isEqualDigit = true;
            System.out.println("У чисел " + number1 + " и " + number2 + " одинаковые цифры " +
                equalDigitTemp + " в первом разряде");
        }
        equalDigitTemp = number1 / 10 % 10;
        if (equalDigitTemp == number2 / 10 % 10) {
            isEqualDigit = true;
            System.out.println("У чисел " + number1 + " и " + number2 + " одинаковые цифры " +
                equalDigitTemp + " во втором разряде");
        }
        equalDigitTemp = number1 % 100 % 10;
        if (equalDigitTemp == number2 % 100 % 10) {
            isEqualDigit = true;
            System.out.println("У чисел " + number1 + " и " + number2 + " одинаковые цифры " +
                equalDigitTemp + " во третьем разряде");
        }
        if (!isEqualDigit) {
            System.out.println("У чисел " + number1 + " и " + number2 + " нет одинаковых цифр "+
                "стоящих в одном разряде");
        }

        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char unknownСhar = '\u0057';
        if ((unknownСhar > 'a' && unknownСhar < 'z') || (unknownСhar > 'а' && unknownСhar < 'я')) {
            System.out.println("Символ " + unknownСhar + " является маленькой буквой");
        } else if ((unknownСhar > 'A' && unknownСhar < 'Z') || 
                (unknownСhar > 'А' && unknownСhar < 'Я')) {
            System.out.println("Символ " + unknownСhar + " является большой буквой");
        } else if (unknownСhar > '0' && unknownСhar < '9') {
            System.out.println("Символ " + unknownСhar + " является числом");
        } else {
            System.out.println("Символ " + unknownСhar + " не буква и не число");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        float amount = 300_000f;
        float percent = 5f;
        if (100_000 <= amount && amount <= 300_000) {
            percent = 7f;
        } else if (amount > 300_000) {
            percent = 10f;
        }
        float calcPercentAmount = amount / 100 * percent;
        System.out.println("Сумма вклада " + amount + "\nначисленный % " + calcPercentAmount +
                "\nитоговая сумма с % " + (amount + calcPercentAmount));

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        float percentHistory = 59f;
        float percentProgramming = 91f;
        byte scoreHistory = 2;
        byte scoreProgramming = 2;
        if (percentHistory > 91) {
            scoreHistory = 5;
        } else if (percentHistory > 73) {
            scoreHistory = 4;
        } else if (percentHistory > 60) {
            scoreHistory = 3;
        }
        if (percentProgramming > 91) {
            scoreProgramming = 5;
        } else if (percentProgramming > 73) {
            scoreProgramming = 4;
        } else if (percentProgramming > 60) {
            scoreProgramming = 3;
        }
        System.out.println("Итоговые оценки:\n" + scoreHistory + " - история\n" + scoreProgramming +
                " - программирование");
        float scoreAverage = (float) (scoreHistory + scoreProgramming) / 2;
        System.out.println("Средний балл оценок по предметам: " + scoreAverage);
        float percentAverage = (float) (percentHistory + percentProgramming) / 2;
        System.out.println("Средний % по предметам: " + percentAverage);

        //8. Расчет прибыли за год
        System.out.println("\n8. Расчет прибыли за год");
        float rent = 5_000f;
        float sale = 13_000f;
        float cost = 9_000f;
        float profit = (float) (sale - rent - cost) * 12;
        if (profit < 0) {
            System.out.println("прибыль за год: " + profit + " руб.");
        } else {
            System.out.println("прибыль за год: +" + profit + " руб.");
        }

        //9. Подсчет количества банкнот
        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 567;
        int cntHundreds = 0;
        int cntTens = 0;
        int cntOnes = 0;
        int maxHundreds = 10;
        int maxTens = 5;
        int maxOnes = 50;
        if (sum / 100 < 1 ) {
            //сотни не нужны
        } else if (sum / 100 < maxHundreds) {
            cntHundreds = sum / 100;
        } else {        
            cntHundreds = maxHundreds;
        }
        if (cntHundreds != 0) {
            sum -= cntHundreds * 100;
        }
        if (sum / 10 < 1 ) {
            //десятки не нужны
        } else if (sum / 10 < maxTens) {
            cntTens = sum / 10;
        } else {
            cntTens = maxTens;
        }
        if (cntTens != 0) {
            sum -= cntTens * 10;
        }
        if (sum < 1 ) {
            //onedollar не нужны
        } else if (sum < maxOnes) {
            cntOnes = sum;
            sum = cntHundreds * 100 + cntTens * 10 + cntOnes;
            System.out.println("Банкноты 100USD - количество: " + cntHundreds +
                    "\nБанкноты 10USD  - количество: " + cntTens +
                    "\nБанкноты 1USD   - количество: " + cntOnes +
                    "\nВыдаваемая сумма " + sum);
        } else {
            System.out.println("для выдачи нужной суммы не хватает банкнот");
        }
    }
}