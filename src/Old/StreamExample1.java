package Old;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample1 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> ot = integers.stream().map(n -> n * 2)
                .filter(n -> n > 3 && n % 2 != 0)
                .max(Integer::compareTo);
        ot.ifPresent(System.out::println);
    }
}