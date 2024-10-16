package Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

        Optional<Employee> minSalary = employees.stream()
                .min(Comparator.comparing(Employee::getSalary));

        if (minSalary.isPresent()) {
            System.out.println("EMployee min salary is :" + minSalary.get());
        } else {
            System.out.println("Employee not found in this list");
        }

        // Employees salary >60000

        List<Employee> listOfEmployees = employees.stream()
                .filter(employee -> employee.getSalary() >= 60000)
                .collect(Collectors.toList());
        listOfEmployees.forEach(list -> System.out.println(list));

        // find avg salary of all employees

        double avgSalary = employees.stream()
                .mapToDouble(employee -> employee.getSalary())
                .average()
                .orElse(0.0);

        System.out.println("The avg salary of employees :" + avgSalary);

        // Group employees by salary...

        Map<String, List<Employee>> salaryDistribution = employees.stream()
                .collect(Collectors.groupingBy(emp -> {
                    if (emp.getSalary() < 60000)
                        return "Low Salary";
                    else if (emp.getSalary() <= 80000)
                        return "Medium Salary";
                    else
                        return "High Salary";
                }));
        salaryDistribution.forEach((range, empList) -> System.out.println(range + " " + empList));

        // Sort employees by name

        List<Employee> sortedEmployeeNames = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(sortedEmployeeNames);

        // Convert List of Employees to List of Employee Names

        List<String> empNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(empNames);

        // Check if Any Employee Has a Salary Greater than 85,000

        boolean salaryCheck = employees.stream()
                .anyMatch(emp -> emp.getSalary() > 85000);

        System.out.println(salaryCheck);
        // Sum of All Salaries

        double sum = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println(sum);
    }
}
