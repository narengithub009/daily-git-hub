package Java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {

        int i = 12345;

        Integer sumsOfIntegers = Stream.of(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumsOfIntegers);
    }
}
