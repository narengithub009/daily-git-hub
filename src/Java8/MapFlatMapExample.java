package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFlatMapExample {

    public static void main(String[] args) {

        List<String> addressList1 = new ArrayList<>();
        addressList1.add("Hyd");
        addressList1.add("Pune");
        addressList1.add("Banglore");
        addressList1.add("Chennai Chennai");

        Employee employee1 = new Employee(122, "Naren", addressList1);

        List<String> addressList2 = new ArrayList<>();
        addressList2.add("Hyd");
        addressList2.add("Pune");
        addressList2.add("Banglore");

        Employee employee2 = new Employee(123, "Anny", addressList2);

        List<String> addressList3 = new ArrayList<>();
        addressList3.add("Hyd");

        addressList3.add("Chennai");

        Employee employee3 = new Employee(121, "Neeraja", addressList3);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println(employees);

        List<Integer> collect = employees.stream().map(emp -> emp.getId()).collect(Collectors.toList());
        System.out.println(collect);

        employees.stream().map(emp -> emp.getAddressList()).collect(Collectors.toSet())
                .forEach(System.out::println);

        Set<String> flatMapList = employees.stream().flatMap(emp -> emp.getAddressList().stream())
                .collect(Collectors.toSet());
        System.out.println(flatMapList);
    }
}
