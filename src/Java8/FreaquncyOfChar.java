package Java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreaquncyOfChar {
    public static void main(String[] args) {

        String inputString = "Hello";

        Map<Character, Long> freaquncyOfChar = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freaquncyOfChar);
    }
}
