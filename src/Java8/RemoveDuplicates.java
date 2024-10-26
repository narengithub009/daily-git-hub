package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> values = Arrays.asList("Java", "Java", "C++", ".Net", "Rust", "Angular");

        List<String> distinctValues = values.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(distinctValues);

        Set<String> distinctSetValues = values.stream()
                .collect(Collectors.toSet());

        System.out.println(distinctSetValues);
    }
}
