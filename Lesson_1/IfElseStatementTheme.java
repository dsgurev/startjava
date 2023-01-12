public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java 
        System.out.println("\n1. Перевод псевдокода на язык Java ");
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
        boolean isEqualDig = false;
        int number1 = 123;
        int number2 = 321;
        int eqDig;
        if (number1 / 100 == number2 / 100) {
            isEqualDig = true;
            eqDig = number1 / 100;
            System.out.println("У чисел " + number1 + " и " + number2 + " одинаковые цифры " + 
                eqDig + " в первом разряде");
        }
        if (number1 / 10 % 10 == number2 / 10 % 10) {
            isEqualDig = true;
            eqDig = number1 / 10 % 10;
            System.out.println("У чисел " + number1 + " и " + number2 + " одинаковые цифры " + 
                eqDig + " во втором разряде");
        }
        if (number1 % 100 % 10 == number2 % 100 % 10) {
            isEqualDig = true;
            eqDig = number1 % 100 % 10;
            System.out.println("У чисел " + number1 + " и " + number2 + " одинаковые цифры " + 
                eqDig + " во втором разряде");
        }
        if (!isEqualDig) {
            System.out.println("У чисел " + number1 + " и " + number2 + " нет одинаковых цифр "+
                "стоящих в одном разряде");
        }

        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char character = '\u0057';
        if ((character > 'a' & character < 'z') | (character > 'а' & character < 'я')) {
            System.out.println("Символ " + character + " является маленькой буквой");
        } else if ((character > 'A' & character < 'Z') | (character > 'А' & character < 'Я')) {
            System.out.println("Символ " + character + " является большой буквой");
        } else if (character > '0' & character < '9') {
            System.out.println("Символ " + character + " является числом");
        } else {
            System.out.println("Символ " + character + " не буква и не число");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        float amount = 300_000f;
        float percent = 0f;
        if (amount < 100_000) {
            percent = 5f;
        } else if (100_000 <= amount & amount <= 300_000) {
            percent = 7f;
        } else if (amount > 300_000) {
            percent = 10f;
        }
        System.out.println("Сумма вклада " + amount + "\nначисленный % " + 
                (amount * percent / 100) + "\nитоговая сумма с % " + 
                (amount + amount * percent / 100));

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        float prcHist = 59f;
        float prcProg = 91f;
        float prcAvg = 0f;
        byte scoreHist = 0;
        byte scoreProg = 0;
        float scoreAvg = 0f;
        if (prcHist <= 60) {
            scoreHist = 2;
        } else if (prcHist > 91) {
            scoreHist = 5;
        } else if (prcHist > 73) {
            scoreHist = 4;
        } else if (prcHist > 60) {
            scoreHist = 3;
        }
        if (prcProg <= 60) {
            scoreProg = 2;
        } else if (prcProg > 91) {
            scoreProg = 5;
        } else if (prcProg > 73) {
            scoreProg = 4;
        } else if (prcProg > 60) {
            scoreProg = 3;
        }
        System.out.println("Итоговые оценки:\n" + scoreHist + " - история\n" + scoreProg +
                " - программирование");
        scoreAvg = (float) (scoreHist + scoreProg) / 2;
        System.out.println("Средний балл оценок по предметам: " + scoreAvg);
        prcAvg = (float) (prcHist + prcProg) / 2;
        System.out.println("Средний % по предметам: " + prcAvg);

        //8. Расчет прибыли за год
        System.out.println("\n8. Расчет прибыли за год");
        float rent = 5_000f;
        float sale = 13_000f;
        float cost = 9_000f;
        float profit = (float)( sale - rent - cost ) * 12;
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