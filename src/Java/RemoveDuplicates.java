package Java;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 45, 33, 3, 2, 2 };
        Arrays.sort(arr);
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] arr) {

        int uniqueIndex = 0;
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr[uniqueIndex]) {

                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        return Arrays.copyOf(arr, uniqueIndex + 1);
    }
}
