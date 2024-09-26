import java.util.function.Predicate;

public class HasSpaces {

    public static void main(String[] args) {

        System.out.println(hasSpaces("hellosdsds"));

        Predicate<String> predicate = str -> str.contains(" ");

        System.out.println(predicate.test("hellosdsds"));
    }

    private static boolean hasSpaces(String string) {

        return string.contains(" ") ? true : false;
    }

}
