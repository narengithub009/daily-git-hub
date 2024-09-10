import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloTest {
    public static void main(String[] args) {

        String str = "Hellojavahowareyou";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // System.out.println(Arrays.toString(dulVal));

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("This is traditional way of writing the anonimous inner class...");
            }

        };
        runnable.run();

        Runnable runnable2 = () -> System.out
                .println("This is functional way of writing for anonimous innerclasss using lambdas");

        runnable2.run();

        InnerHelloTest helloTest = () -> System.out.println("Hello how are you...");
        helloTest.sayGreeting();

        List<String> asList = Arrays.asList("Narender", "Anny", "Neeraja", "Jhon", "Auto");
        asList.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        Optional<Object> ofNullable = Optional.ofNullable("Hello");
        System.out.println(ofNullable.orElse("Default value..."));
    }

}

@FunctionalInterface
interface InnerHelloTest {

    public void sayGreeting();
}
