package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfSTringsJoining {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String formingString = listOfStrings.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(formingString);

        List<Integer> numbers = Arrays.asList(2, 30, 43, 2342, 232, 212, 2332);
        numbers.stream()
                .filter(c -> c % 5 == 0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
