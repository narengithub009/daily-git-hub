import java.util.function.Predicate;

public class IsPlural {

    public static void main(String[] args) {

        // System.out.println(isPlural("Mangoe"));

        Predicate<String> predicate = str -> str.endsWith("s");
        System.out.println(predicate.test("Mangoe"));
    }

    private static boolean isPlural(String string) {

        return string.substring(string.length() - 1).equals("s");
    }
}
