package Old;

public class ArraySum {

    public static int arraySum(int[] interger) {
        int sum = 0;
        for (int i = 0; i < interger.length; i++) {
            sum += interger[i];
        }
        return sum;
    }

    public static int findSum(int[] interger, int length) {

        if (length <= 0) {
            return 0;
        }

        return interger[length - 1] + findSum(interger, length - 1);
    }

    public static void main(String[] args) {
        int[] arrayInt = { 1, 2 };

        System.out.println(ArraySum.arraySum(arrayInt));

        System.out.println(ArraySum.findSum(arrayInt, arrayInt.length));
    }
}
