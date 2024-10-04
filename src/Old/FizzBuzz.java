package Old;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println(fizzBuzz(4));
    }

    private static String fizzBuzz(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(i);
        }
    }
}
