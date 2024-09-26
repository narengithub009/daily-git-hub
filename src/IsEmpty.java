import java.util.function.Predicate;

public class IsEmpty {

    public static void main(String[] args) {

        // System.out.println(isEmpty("aa"));

        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test("a"));
    }

    private static boolean isEmpty(String string) {

        return string.isEmpty() ? true : false;
    }
}
