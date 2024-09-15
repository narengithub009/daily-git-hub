import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayofMultiples {

    public static int[] arrayOfMultiples(int num, int length) {
        /*
         * int[] result = new int[length];
         * int temp = 0;
         * for (int i = 0; i < length; i++) {
         * temp = temp + num;
         * result[i] = temp;
         * // num = result[i];
         * }
         * 
         * System.out.println(Arrays.toString(result));
         * // System.out.println(Arrays.toString(result));
         * System.out.println("***************************");
         * return result;
         */
        System.out.println("Herooo");
        return IntStream.range(1, length + 1).map(n -> n * num).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayofMultiples.arrayOfMultiples(7, 5)));
    }
}
