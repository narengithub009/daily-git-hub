package Java8;

import java.util.Arrays;
import java.util.List;

public class CommonEleBetweenTwoArrays {

    public static void main(String[] args) {

        List<Integer> arrayOne = Arrays.asList(12, 123, 34, 44, 563, 3453, 32);
        List<Integer> arrayTwo = Arrays.asList(12, 34, 44, 45, 32, 23, 232);

        arrayOne.stream().filter(arrayTwo::contains)
                .forEach(System.out::println);

    }
}
