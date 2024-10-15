package Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxSalaryEmployee {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 75000),
                new Employee(3, "Charlie", 60000),
                new Employee(4, "David", 90000),
                new Employee(5, "Eve", 85000));

        Optional<Employee> maxSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        if (maxSalary.isPresent()) {
            System.out.println("Employee max salary is : " + maxSalary.get());
        } else {
            System.out.println("No Employees in the list...");
        }
    }
}
