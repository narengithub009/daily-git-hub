import java.util.Scanner;

public class TempLog4j {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        Integer temp;
        for (int i = 0; i <= num; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }

    }
}
