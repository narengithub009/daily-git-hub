package Old;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : \n");
        int num = scanner.nextInt();
        int m, rev = 0, x;
        m = num;

        while (num > 0) {
            x = num % 10;
            rev = rev * 10 + x;
            num = num / 10;
        }

        if (rev == m) {
            System.out.println("The given number is paloindrom :");
        } else {
            System.out.println("The given number is not palindrom:");
        }

    }
}
