import java.util.function.Predicate;

public class IsSafeBridge {

    public static void main(String[] args) {

        // System.out.println(isSafeBridge("####"));

        Predicate<String> predicate = bridge -> !bridge.contains(" ");
        System.out.println(predicate.test("####"));
    }

    private static boolean isSafeBridge(String string) {

        return string.contains(" ") ? false : true;
    }
}
