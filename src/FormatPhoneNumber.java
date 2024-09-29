import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FormatPhoneNumber {

    public static String formatPhoneNumber(int[] arr) {

        List<String> collect = IntStream.of(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        return String.format("(%s%s%s) %s%s%s-%s%s%s%s", collect.toArray());
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(formatPhoneNumber(arr));

    }
}
