package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] intarray1 = { 1, 2, 244, 53, 2 };
        int[] intarray2 = { 1, 2, 24, 5443, 3 };

        int[] concatArray = IntStream.concat(Arrays.stream(intarray1), Arrays.stream(intarray2)).sorted().toArray();
        System.out.println(Arrays.toString(concatArray));

        // Merging two arrays with distinct values...

        int[] distinctArray = IntStream
                .concat(Arrays.stream(intarray1), Arrays.stream(intarray2))
                .sorted()
                .distinct().toArray();

        System.out.println(Arrays.toString(distinctArray));
    }
}
