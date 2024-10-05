package Old;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniquEleFromArray {
        public static void main(String[] args) {

                String[] strArray = { "Hello", "Narender", "Java", "Microservices" };

                String longStr = Arrays.stream(strArray)
                                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                                .get();

                System.out.println(longStr);
                int[] number = { 12, 1, 13, 34, 23, 2, 3, 4, 55 };

                List<String> collect2 = Arrays.stream(number)
                                .boxed()
                                .map(m -> m + "")
                                .filter(s -> s.startsWith("1"))
                                .collect(Collectors.toList());

                System.out.println(collect2);
                Integer secondHighestNumber = Arrays.stream(number).boxed()
                                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                .findFirst()
                                .get();
                System.out.println(secondHighestNumber);
                String str = "ilovejavatechie";
                // String s[] = str.split("");
                // System.out.println(Arrays.toString(s));

                // Map<String, List<String>> map = Arrays.stream(str.split(""))
                // .collect(Collectors.groupingBy(s->s));
                // System.out.println(map);

                /* character occurences */
                Map<String, Long> collect = Arrays.stream(str.split(""))
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                System.out.println(collect);

                /* duplicate elemnets */

                List<String> duplicateEle = Arrays.stream(str.split(""))
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                .entrySet().stream()
                                .filter(x -> x.getValue() > 1)
                                .map(Map.Entry::getKey)
                                .collect(Collectors.toList());
                System.out.println(duplicateEle);

                /* Unique Element */

                List<String> UniqueEle = Arrays.stream(str.split(""))
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                .entrySet().stream()
                                .filter(x -> x.getValue() == 1)
                                .map(Map.Entry::getKey)
                                .collect(Collectors.toList());

                System.out.println(UniqueEle);

                /* find out fist non repeat ele */

                String firstNonRepeatValue = Arrays.stream(str.split(""))
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                                                Collectors.counting()))
                                .entrySet().stream()
                                .filter(x -> x.getValue() == 1)
                                .findFirst().get().getKey();
                System.out.println(firstNonRepeatValue);
        }
}
