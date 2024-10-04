package Old;

public class MissingNum {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 7, 6, 9, 8 };
        System.out.println(missingNum(arr));
    }

    public static int missingNum(int[] arr) {
        int num = 10;
        int expectedSum = num * (num + 1) / 2;
        int actualSum = 0;

        for (int i : arr) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }
}
