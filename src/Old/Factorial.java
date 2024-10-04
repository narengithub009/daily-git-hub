package Old;

public class Factorial {

    private static int n = 5;

    public static int factorialCal(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * factorialCal(n - 1);
        }
    }

    public static void main(String[] args) {
        long factorial = factorialCal(n);
        System.out.println(factorial);

    }
}
