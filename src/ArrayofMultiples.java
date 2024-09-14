import java.util.Arrays;

public class ArrayofMultiples {

    public static int[] arrayOfMultiples(int num, int length) {
        int[] result = new int[length];
        int temp = 0;
        for (int i = 0; i < length; i++) {
            temp = temp + num;
            result[i] = temp;
            // num = result[i];
        }

        // System.out.println(Arrays.toString(result));
        System.out.println("***************************");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayofMultiples.arrayOfMultiples(17, 6)));
    }
}
