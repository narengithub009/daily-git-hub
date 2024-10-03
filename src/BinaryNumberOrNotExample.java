public class BinaryNumberOrNotExample {

    public static void main(String[] args) {
        System.out.println(isBinaryNumberOrNot(1011010));
    }

    public static boolean isBinaryNumberOrNot(int number) {

        while (number != 0) {

            if (number % 10 > 1) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
