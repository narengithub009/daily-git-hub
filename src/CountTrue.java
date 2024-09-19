public class CountTrue {

    public static int countTrue(String[] str) {
        int count = 0;
        for (String st : str) {
            if (st.charAt(0) == 't') {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        String[] str = { "false", "false", "false", "false", "false" };
        System.out.println(countTrue(str));
    }
}
