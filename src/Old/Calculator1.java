package Old;

public class Calculator1 {

    public static int calculator(int a, char operator, int b) {

        switch (operator) {
            case '+':
                return a + b;
            case '*':
                return a * b;
            case '-':
                return a - b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed...");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator...");

        }

    }

    public static void main(String[] args) {
        System.out.println(calculator(12, '/', 0));
    }
}
