import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Equal {

    public static void main(String[] args) {

        System.out.println(equal(3, 3, 3));
        System.out.println(equalNumbers(1, 3, 4));
    }

    private static int equal(int i, int j, int k) {

        if (i == j && j == k) {
            return 3;
        } else if (i == j || j == k || k == i) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int equalNumbers(int a, int b, int c) {

        List<Integer> numbers = Arrays.asList(a, b, c);

        Map<Integer, Long> frequncyMap = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return frequncyMap.values().stream()
                .mapToInt(Long::intValue)
                .max()
                .orElse(0);
    }
}
