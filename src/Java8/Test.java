package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> ListOfIntergers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 9);
        Map<Boolean, List<Integer>> sepOddandEven = ListOfIntergers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(sepOddandEven);

        System.out.println("++++++++++++++++++++++");

        Set<Entry<Boolean, List<Integer>>> entrySet = sepOddandEven.entrySet();
        for (Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("---------------");
            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("odd numbers");
            }
            System.out.println("----------------");
            List<Integer> list = entry.getValue();
            for (int i : list) {
                System.out.println(i);
            }
        }
    }
}
