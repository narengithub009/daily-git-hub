import java.util.function.BiPredicate;

public class Comp {

    public static void main(String[] args) {

        System.out.println(comp("asas", "asaaa"));

        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.length() == str2.length();

        System.out.println(biPredicate.test("", " "));
    }

    private static boolean comp(String string, String string2) {
        int str1Length = string.length();
        int str2Length = string2.length();
        return str1Length == str2Length;
    }
}
