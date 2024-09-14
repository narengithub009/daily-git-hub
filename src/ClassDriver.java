import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassDriver {
    public static void main(String[] args) {

        String a = "aabbccc";

        Map<String, Long> repaetedWords = Arrays.asList(a.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Stream<String> map = repaetedWords.entrySet().stream()
                .filter(s -> s.getValue() > 1)
                .map(Entry::getKey);

        StringBuilder builder = new StringBuilder(a);
        char[] ch;
        for (int i = 1; i <= builder.length(); i++) {

        }

    }
}
