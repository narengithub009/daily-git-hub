package Java8;

import java.util.Arrays;
import java.util.List;

public class GetLastElementOfAnArray {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Hello", "How", "You", "Im", "Good");
        String string = strings.stream()
                .skip(strings.size() - 1).findFirst()
                .get();
        System.out.println(string);
    }
}
