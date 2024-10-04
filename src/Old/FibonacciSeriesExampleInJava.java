package Old;

public class FibonacciSeriesExampleInJava {

    public static void main(String[] args) {

        generateFibonacciSeries(10);
    }

    public static void generateFibonacciSeries(int n) {
        int first = 0;
        int second = 1;

        int temp;
        System.out.print(first + " " + second + " ");
        for (int i = 0; i < n; i++) {

            temp = first + second;
            first = second;
            second = temp;
            System.out.print(temp + " ");
        }
    }
}
