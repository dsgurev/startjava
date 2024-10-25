public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        char sign = '^';
        int result = 0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Операция не поддерживается");
                return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
