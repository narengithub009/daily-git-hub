package Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingWordsInGivenString {

    public static void main(String[] args) {

        String str = "Hello how are you doing doing great Hello how about you";

        Map<String, Long> wordsCOunt = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(wordsCOunt);
    }
}
