package Old;

public class PrimeNumberInRange {

    public static boolean primeNumberInRange(int a, int b) {

        boolean flag = true;
        // int[] primeNumbers;
        for (int i = a; i <= b; i++) {

            if (i % 2 == 0) {

                flag = false;
            } else {
                System.out.println(i);
                flag = true;
            }

        }
        if (!flag) {
            System.out.println("No prime numbers in range.");
        }

        return flag;
    }

    public static void main(String[] args) {

        System.out.println(primeNumberInRange(62, 66));
    }
}
