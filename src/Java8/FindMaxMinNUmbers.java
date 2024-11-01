package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinNUmbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 32, 45, 56, 5, 45, 34);

        Integer maxInteger = numbers.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println(maxInteger);

        Integer minInteger = numbers.stream()
                .min(Comparator.naturalOrder()).get();

        System.out.println(minInteger);
    }
}
