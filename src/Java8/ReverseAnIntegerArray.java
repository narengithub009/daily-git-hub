package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray {

    public static void main(String[] args) {

        int[] intArray = { 2, 3, 2, 55, 67, 7 };

        int[] array = IntStream.rangeClosed(1, intArray.length)
                .map(i -> intArray[intArray.length - i]).toArray();

        System.out.println(Arrays.toString(array));
    }
}
