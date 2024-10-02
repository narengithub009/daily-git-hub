import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RecurringWords {

    public static void main(String[] args) {

        List<String> listOfThings = Arrays.asList("Hello", "Banana", "Banana", "Orange", "Hello");
        String str = "Hello hWorld How are you";
        System.out.println(findReccurringWords(listOfThings));
        System.out.println(findReccurringChars(str));

    }

    public static Map<String, Long> findReccurringWords(List<String> list) {

        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static Map<String, Long> findReccurringChars(String str) {

        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
