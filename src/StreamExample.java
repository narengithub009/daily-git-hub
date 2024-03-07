import java.util.stream.Stream;

public class StreamExample {

    private static Employee[] employees = {
            new Employee(12, "Narender"),
            new Employee(13, "Funny")
    };

    public static void main(String[] args) {

        Stream<Employee> of = Stream.of(employees);
        of.forEach(System.out::println);
    }
}
