public class FactorialExample {

    public static void main(String[] args) {

        System.out.println(factorialEx(4));
    }

    public static int factorialEx(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {

            factorial = factorial * i;
        }
        return factorial;
    }
}
