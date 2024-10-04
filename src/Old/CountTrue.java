package Old;

public class CountTrue {

    public static int countTrue(Boolean[] str) {
        int count = 0;
        for (Boolean st : str) {
            if (st != null && st) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Boolean[] str = { false, null, true };
        System.out.println(countTrue(str));
    }
}
