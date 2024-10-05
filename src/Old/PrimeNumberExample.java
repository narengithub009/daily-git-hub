package Old;

public class PrimeNumberExample {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(isPrimeNumber(n) ? n + " is Prime number" : n + " is not prime number");
    }

    public static boolean isPrimeNumber(int num) {
        System.out.println(Math.sqrt(num));
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
