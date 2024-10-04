package Old;

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

        List<Employee1> listOfEmployees = Arrays.asList(new Employee1("Narender", 12, 120000),
                new Employee1("Aswitha", 13, 123323),
                new Employee1("Neeraja", 14, 12342));
        List<Employee1> highSalaryEmp = listOfEmployees.stream()
                .filter(emp -> emp.getSalary() > 12000).collect(Collectors.toList());

        highSalaryEmp.forEach(emp -> System.out.println(emp.getName()));

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 7);
        Integer sum = numList.parallelStream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Optional<String> nullableValue = Optional.ofNullable(null);
        System.out.println(nullableValue.orElseGet(() -> "Default Value"));

        System.out.println("****************");

        System.out.println("factotial of " + HelloTest.factorial(3));

        System.out.println("The given string is : " + HelloTest.isPalindrom("Madama"));
    }

    public static int factorial(int num) {

        /*
         * int result = 1;
         * for (int i = 1; i <= num; i++) {
         * result *= i;
         * 
         * }
         */
        if (num == 1)
            return 1;

        return num * factorial(num - 1);

    }

    public static boolean isPalindrom(String str) {

        String builder = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(builder);

    }
}

@FunctionalInterface
interface InnerHelloTest {

    public void sayGreeting();
}
