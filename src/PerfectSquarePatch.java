import java.util.Arrays;

public class PerfectSquarePatch {

    public static void squarePatch(int num) {
        int[] result = new int[num];
        // int j = 0;
        for (int i = 0; i < num; i++) {

            /*
             * while (j < num) {
             * result[j] = num;
             * j++;
             * }
             */
            System.out.print("[");
            for (int j = 0; j < num; j++) {
                System.out.print(num + ", ");
            }
            System.out.print("]");
            System.out.println(",");
        }
        // return result;

    }

    public static void main(String[] args) {
        PerfectSquarePatch.squarePatch(5);
    }
}
