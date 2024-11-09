package Java8;

import java.util.Arrays;
import java.util.List;

public class StringsWhichStartWithaNumber {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("One", "2wo", "2eight", "nine", "7seven");
        strings.stream()
                .filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
