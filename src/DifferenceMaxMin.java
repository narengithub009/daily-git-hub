import java.util.Arrays;

public class DifferenceMaxMin {

    public static void main(String[] args) {
        int[] arr = { 44, 32, 86, 19 };
        System.out.println(differenceMaxMin(arr));
    }

    private static int differenceMaxMin(int[] arr) {

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("max value : " + max + " min value is " + min);

        return max - min;

    }
}
