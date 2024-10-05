package Old;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestSample1 {
    public static void main(String[] args) {

        String[] str = { "hello", "howareyou", "imgood", "whataboutyou" };

        String string = Arrays.stream(str).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(string);

    }
}
