package Old;

public class ExistsHigher {

    public static boolean existsHigher(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 2, 1123 };
        System.out.println(existsHigher(arr, 12345));
    }
}
