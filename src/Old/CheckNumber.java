import java.util.Optional;

public class CheckNumber {

    public static void main(String[] args) {
        System.out.println(checkNumber(15));
    }

    public static String checkNumber(int n) {

        return Optional.of(n)
                .map(n1 -> {
                    if (n1 % 3 == 0 && n1 % 5 == 0)
                        return "HelloWorld";
                    else if (n1 % 3 == 0)
                        return "Hello";
                    else if (n1 % 5 == 0)
                        return "World";
                    else
                        return "";
                }).orElse("");
    }
}
