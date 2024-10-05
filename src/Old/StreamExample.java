package Old;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamExample {
    private static Logger logger = Logger.getLogger(StreamExample.class.getName());

    private static Employee[] employees = {
            new Employee(12, "Narender"),
            new Employee(13, "Funny")
    };

    public static void message(String string) {
        logger.info("Method calling.......");
        System.out.println(string);
        logger.info("Method call completed " + string);
    }

    public static void main(String[] args) {
        StreamExample.message("Hello...");
        ;
        Stream<Employee> of = Stream.of(employees);
        of.forEach(System.out::println);
        System.out.println(of);

    }
}
