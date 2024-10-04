import java.util.Arrays;
import java.util.List;

public class ControlFlowDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(System.out::println);

        int number = 10;
        if (number > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueaday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            default:
                System.out.println("Other day");
                break;
        }

    }
}
