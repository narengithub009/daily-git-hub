package Old;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxNumber {

        public static void main(String[] args) {

                List<Integer> integers = Arrays.asList(1, 24, 2, 34, 232, 223);

                Integer maxValue = integers.stream().max(Integer::compareTo).orElseThrow();
                System.out.println(maxValue);

                String string = "Hello how are java is powerfull java is beautiful";

                Map<String, Long> frequentStrings = Arrays.stream(string.split(" "))
                                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

                System.out.println(frequentStrings);

                Integer secondHighestInteger = integers.stream()
                                .sorted((a, b) -> b - a)
                                .distinct()
                                .skip(1)
                                .findFirst()
                                .orElseThrow();

                System.out.println(secondHighestInteger);

                Map<Character, Long> charCount = string.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                System.out.println(charCount);
        }
}
