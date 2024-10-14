package Java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static Optional<Character> firstNonRepeatedCharacter(String string) {

        LinkedHashMap<Character, Long> characterCount = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return characterCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static void main(String[] args) {

        String string = "Narender";
        Optional<Character> firstNonRepeatedCharacter = firstNonRepeatedCharacter(string);
        firstNonRepeatedCharacter.ifPresentOrElse(ch -> System.out.println("The fisrt non repeated char is " + ch),
                () -> System.out.println("No non repated values found"));
    }
}
