package Old;

public class SampleTemp12 {
    public static void main(String[] args) {

        int num = 10;

        private long initialVal = 0;
        private long initialVal1 = 1;
        private long temp = 0;
        System.out.print(initialVal + " " + initialVal1);
        for (int i = 0; i <= num; i++) {
            temp = initialVal + initialVal1;
            initialVal = initialVal1;
            initialVal1 = temp;
            System.out.println(temp + " ");

        }

    }
}
