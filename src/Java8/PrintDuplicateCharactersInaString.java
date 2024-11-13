package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateCharactersInaString {

    public static void main(String[] args) {

        String str = "Java Concept of the Day Day".replaceAll("\\s+", "").toLowerCase();
        Set<String> set = new HashSet<>();
        Set<String> duplicateCharactersOfString = Arrays.stream(str.split(""))
                .filter(ch -> !set.add(ch))
                .collect(Collectors.toSet());
        System.out.println(duplicateCharactersOfString);
    }
}
