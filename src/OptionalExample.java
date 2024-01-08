import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        
        Optional<String> optional=Optional.of("Hello");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("Default value "));
        optional.ifPresent((msg)->System.out.println(msg.concat(" good morning")));
    }
}
