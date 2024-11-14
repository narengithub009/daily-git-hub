package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacterInAString {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        LinkedHashMap<String, Long> mapStrings = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String string = mapStrings.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(string);
    }
}
