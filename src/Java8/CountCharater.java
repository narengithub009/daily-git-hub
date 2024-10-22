package Java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharater {

    public static void main(String[] args) {

        String string = "Narender";

        Map<Character, Long> CharGrp = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(CharGrp);
    }
}
