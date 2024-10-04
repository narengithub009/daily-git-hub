package Old;

import java.util.OptionalInt;

public class OptionalIntExample {
    public static void main(String[] args) {

        OptionalInt optionalInt = OptionalInt.of(0);

        System.out.println(optionalInt.isPresent()); // will return true if value is present!!
        System.out.println(optionalInt.getAsInt());// get returns the value
        System.out.println(optionalInt.orElse(9));
        optionalInt.ifPresent(System.out::println);

    }
}
