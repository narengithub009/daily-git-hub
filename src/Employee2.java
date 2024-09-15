import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee2 {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee2(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        List<Employee2> listOfEmployees = Arrays.asList(new Employee2("Narender", 37, 10000),
                new Employee2("Neeraja", 35, 120000),
                new Employee2("Aswitha", 12, 20000),
                new Employee2("Anny", 12, 23922));

        List<String> filterAge = listOfEmployees.stream()
                .filter(a -> a.getAge() < 30 && a.getSalary() > 10000)
                .map(employee -> {
                    String name = employee.getName();
                    return name != null ? name : "This default name";
                })
                .collect(Collectors.toList());
        System.out.println(filterAge);

        listOfEmployees.stream()
                // .sorted((e1, e2) -> Integer.compare(e2.getAge(), e1.getAge()))
                .sorted(Comparator.comparingInt(Employee2::getAge).reversed())
                .forEach(e -> System.out.println(e.getName() + " " + e.getAge()));

        Optional<Integer> maxValue = Arrays.asList(1, 2, 3, 4, 5, 7)
                .stream().max(Integer::compareTo);

        maxValue.ifPresent(System.out::println);
    }

}
