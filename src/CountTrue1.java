public class CountTrue1 {

    public static void main(String[] args) {

        Boolean[] arr = { false, false, false, false, false };
        System.out.println(countTrue(arr));
    }

    public static int countTrue(Boolean[] arr) {
        int count = 0;
        for (Boolean boolean1 : arr) {

            if (boolean1) {
                count++;
            }
        }
        return count;
    }
}
