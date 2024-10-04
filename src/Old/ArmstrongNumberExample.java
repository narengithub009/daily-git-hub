package Old;

public class ArmstrongNumberExample {

    public static void main(String[] args) {
        isArmstrongNumberOrNot(370);
    }

    public static void isArmstrongNumberOrNot(int number) {

        // int number = 123;
        int sum = 0;

        int temp = number;

        while (temp > 0) {
            int rem = temp % 10;
            sum += (rem * rem * rem);
            temp = temp / 10;
        }

        if (number == sum) {
            System.out.println(number + " is armstrong number");
        } else {
            System.out.println(number + " is not armstrong number");
        }
    }
}
