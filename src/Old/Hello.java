package Old;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hello extends FinalTest {

        public static void main(String[] args) {
                FinalTest finalTest = new FinalTest();
                finalTest.message("Hello");

                List<String> names = Arrays.asList("Narender", "Anny", "Neeraja", "Aswitha");

                Collections.sort(names);

                System.out.println(names);

                List<List<Integer>> listOfStreams = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(3, 4, 5, 6),
                                Arrays.asList(6, 6, 7));

                listOfStreams.stream()
                                .flatMap(List::stream)
                                .distinct()
                                .collect(Collectors.toList()).forEach(System.out::print);

                Map<Character, List<String>> mapWithGroupnames = names.stream()
                                .collect(Collectors.groupingBy(name -> name.charAt(0)));

                System.out.println(mapWithGroupnames);
        }
}
