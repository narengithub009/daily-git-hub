import java.util.OptionalDouble;

public class OptionalDoubleExample {
    public static void main(String[] args) {
        
        OptionalDouble optionalDouble=OptionalDouble.of(5.0);
        System.out.println(optionalDouble.isPresent()); // isPresent will return true if a value is present.
        System.out.println(optionalDouble.getAsDouble());
        System.out.println(optionalDouble.orElse(6.0));
        optionalDouble.ifPresent(s->System.out.println(s*s));
    }
}
