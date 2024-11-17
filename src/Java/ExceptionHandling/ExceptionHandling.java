package Java.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number :");

            int age = scanner.nextInt();

            try {
                if (age < 0) {
                    throw new AgeIsNegativeException("Age shoud not be nagative value");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }
}
