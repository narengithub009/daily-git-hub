package Old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEmployee {

    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(12, "Naren"));
        arrayList.add(new Employee(13, "Mittu"));
        arrayList.add(new Employee(14, "Anny"));
        arrayList.add(new Employee(9, "Neeru"));

        for (Employee employee : arrayList) {
            System.out.println(employee.getId() + " " + employee.getName());
        }

        Collections.sort(arrayList, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }

        });

        arrayList.stream().forEach(System.out::println);

    }
}
