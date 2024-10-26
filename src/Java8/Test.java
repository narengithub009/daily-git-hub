package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> ListOfIntergers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 9);
        Map<Boolean, List<Integer>> sepOddandEven = ListOfIntergers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(sepOddandEven);
    }
}
